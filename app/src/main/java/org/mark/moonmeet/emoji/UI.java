package org.mark.moonmeet.emoji;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.DrawableCompat;

import org.mark.axemojiview.AXEmojiManager;
import org.mark.axemojiview.listener.OnStickerActions;
import org.mark.axemojiview.sticker.Sticker;
import org.mark.axemojiview.utils.Utils;
import org.mark.axemojiview.view.AXEmojiLayout;
import org.mark.axemojiview.view.AXEmojiPager;
import org.mark.axemojiview.view.AXEmojiView;
import org.mark.axemojiview.view.AXSingleEmojiView;
import org.mark.axemojiview.view.AXStickerView;
import org.mark.moonmeet.R;

public class UI {

    public static boolean mEmojiView;
    public static boolean mSingleEmojiView;
    public static boolean mStickerView;
    public static boolean mCustomView;
    public static boolean mFooterView;
    public static boolean mCustomFooter;
    public static boolean mWhiteCategory;

    public static boolean darkMode;

    public static void loadTheme(){
        // release theme
        darkMode = false;
        AXEmojiManager.resetTheme();

        // set EmojiView Theme
        AXEmojiManager.getEmojiViewTheme().setFooterEnabled(true);
        AXEmojiManager.getEmojiViewTheme().setSelectionColor(0xffFF4081);
        AXEmojiManager.getEmojiViewTheme().setFooterSelectedItemColor(0xffFF4081);
        AXEmojiManager.getStickerViewTheme().setSelectionColor(0xffFF4081);

        if (mWhiteCategory) {
            AXEmojiManager.getEmojiViewTheme().setSelectionColor(Color.TRANSPARENT);
            AXEmojiManager.getEmojiViewTheme().setSelectedColor(0xffFF4081);
            AXEmojiManager.getEmojiViewTheme().setCategoryColor(Color.WHITE);
            AXEmojiManager.getEmojiViewTheme().setFooterBackgroundColor(Color.WHITE);
            AXEmojiManager.getEmojiViewTheme().setAlwaysShowDivider(true);

            AXEmojiManager.getStickerViewTheme().setSelectedColor(0xffFF4081);
            AXEmojiManager.getStickerViewTheme().setCategoryColor(Color.WHITE);
            AXEmojiManager.getStickerViewTheme().setAlwaysShowDivider(true);
        }
        AXEmojiManager.getInstance().setBackspaceCategoryEnabled(true);
    }

    public static void loadDarkTheme(){
        // release theme
        darkMode = true;
        AXEmojiManager.resetTheme();

        // set EmojiView Theme
        AXEmojiManager.getEmojiViewTheme().setFooterEnabled(mFooterView&&!mCustomFooter);
        AXEmojiManager.getEmojiViewTheme().setSelectionColor(0xff82ADD9);
        AXEmojiManager.getEmojiViewTheme().setSelectedColor(0xff82ADD9);
        AXEmojiManager.getEmojiViewTheme().setFooterSelectedItemColor(0xff82ADD9);
        AXEmojiManager.getEmojiViewTheme().setBackgroundColor(0xFF1E2632);
        AXEmojiManager.getEmojiViewTheme().setCategoryColor(0xFF1E2632);
        AXEmojiManager.getEmojiViewTheme().setFooterBackgroundColor(0xFF1E2632);
        AXEmojiManager.getEmojiViewTheme().setVariantPopupBackgroundColor(0xFF232D3A);
        AXEmojiManager.getEmojiViewTheme().setVariantDividerEnabled(false);
        AXEmojiManager.getEmojiViewTheme().setDividerColor(0xFF1B242D);
        AXEmojiManager.getEmojiViewTheme().setDefaultColor(0xFF677382);
        AXEmojiManager.getEmojiViewTheme().setTitleColor(0xFF677382);

        AXEmojiManager.getStickerViewTheme().setSelectionColor(0xff82ADD9);
        AXEmojiManager.getStickerViewTheme().setSelectedColor(0xff82ADD9);
        AXEmojiManager.getStickerViewTheme().setBackgroundColor(0xFF1E2632);
        AXEmojiManager.getStickerViewTheme().setCategoryColor(0xFF1E2632);
        AXEmojiManager.getStickerViewTheme().setDividerColor(0xFF1B242D);
        AXEmojiManager.getStickerViewTheme().setDefaultColor(0xFF677382);

        if (mWhiteCategory) {
            AXEmojiManager.getEmojiViewTheme().setSelectionColor(Color.TRANSPARENT);
            AXEmojiManager.getEmojiViewTheme().setCategoryColor(0xFF232D3A);
            AXEmojiManager.getEmojiViewTheme().setFooterBackgroundColor(0xFF232D3A);
            AXEmojiManager.getEmojiViewTheme().setAlwaysShowDivider(true);

            AXEmojiManager.getStickerViewTheme().setCategoryColor(0xFF232D3A);
            AXEmojiManager.getStickerViewTheme().setAlwaysShowDivider(true);
        }
        AXEmojiManager.getInstance().setBackspaceCategoryEnabled(!mCustomFooter);
    }

    public static AXEmojiPager loadView(final Context context, EditText editText){
        AXEmojiPager emojiPager = new AXEmojiPager(context);

        if (mSingleEmojiView) {
            /**
             * add single emoji view
             */
            AXSingleEmojiView singleEmojiView = new AXSingleEmojiView(context);
            emojiPager.addPage(singleEmojiView, R.drawable.ic_msg_panel_smiles);
        }

        if (mEmojiView) {
            /**
             * add emoji view (with viewpager)
             */
            AXEmojiView emojiView = new AXEmojiView(context);
            emojiPager.addPage(emojiView, R.drawable.ic_msg_panel_smiles);
        }

        if (mStickerView) {
            /**
             * add Sticker View
             */
            AXStickerView stickerView = new AXStickerView(context, "stickers", new WhatsAppProvider());
            emojiPager.addPage(stickerView, R.drawable.ic_msg_panel_stickers);

            //add sticker click listener
            stickerView.setOnStickerActionsListener(new OnStickerActions() {
                @Override
                public void onClick(View view, Sticker sticker, boolean fromRecent) {
                    Toast.makeText(view.getContext(),sticker.toString()+" clicked!", Toast.LENGTH_SHORT).show();
                }

                @Override
                public boolean onLongClick(View view, Sticker sticker, boolean fromRecent) {
                    return false;
                }
            });
        }

        if (mCustomView){
            emojiPager.addPage(new LoadingView(context), R.drawable.msg_round_load_m);
        }

        // set target emoji edit text to emojiViewPager
        emojiPager.setEditText(editText);

        emojiPager.setSwipeWithFingerEnabled(true);

        if (mCustomFooter){
            initCustomFooter(context,emojiPager);
        }else{
            emojiPager.setLeftIcon(R.drawable.ic_ab_search);
            emojiPager.setOnFooterItemClicked((view, leftIcon) -> {
                if (leftIcon) Toast.makeText(context,"Search Clicked", Toast.LENGTH_SHORT).show();
            });
        }

        return emojiPager;
    }

    private static void initCustomFooter(final Context context, AXEmojiPager emojiPager){
        final FrameLayout footer = new FrameLayout(context);
        Drawable drawable = context.getResources().getDrawable(R.drawable.circle_bg);
        if (darkMode) DrawableCompat.setTint(DrawableCompat.wrap(drawable),0xFF1B242D);
        footer.setBackground(drawable);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            footer.setElevation(Utils.dp(context,4));
        }

        AXEmojiLayout.LayoutParams lp = new AXEmojiLayout.LayoutParams(Utils.dp(context,48),Utils.dp(context,48));
        lp.rightMargin = Utils.dp(context,12);
        lp.bottomMargin = Utils.dp(context,12);
        lp.gravity = Gravity.RIGHT | Gravity.BOTTOM;
        footer.setLayoutParams(lp);
        emojiPager.setCustomFooter(footer,true);

        final AppCompatImageView img = new AppCompatImageView(context);
        FrameLayout.LayoutParams lp2 = new FrameLayout.LayoutParams(Utils.dp(context,22),Utils.dp(context,22));
        lp2.gravity = Gravity.CENTER;
        footer.addView(img,lp2);

        final View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Search Clicked", Toast.LENGTH_SHORT).show();
            }
        };

        emojiPager.setOnEmojiPageChangedListener((emojiPager1, base, position) -> {
            Drawable drawable1;
            if (AXEmojiManager.isAXEmojiView(base)){
                drawable1 = context.getResources().getDrawable(R.drawable.emoji_backspace);
                Utils.enableBackspaceTouch(footer, emojiPager1.getEditText());
                footer.setOnClickListener(null);
            }else {
                drawable1 = context.getResources().getDrawable(R.drawable.ic_ab_search);
                footer.setOnTouchListener(null);
                footer.setOnClickListener(clickListener);
            }
            DrawableCompat.setTint(DrawableCompat.wrap(drawable1),AXEmojiManager.getEmojiViewTheme().getFooterItemColor());
            img.setImageDrawable(drawable1);
        });
    }
}
