// Generated by view binder compiler. Do not edit!
package org.mark.moonmeet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.mark.moonmeet.R;

public final class IntroBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final DotsIndicator dotsIndicator;

  @NonNull
  public final LinearLayout holder;

  @NonNull
  public final LinearLayout linearDotsBox;

  @NonNull
  public final ViewPager viewpager1;

  private IntroBinding(@NonNull LinearLayout rootView, @NonNull DotsIndicator dotsIndicator,
      @NonNull LinearLayout holder, @NonNull LinearLayout linearDotsBox,
      @NonNull ViewPager viewpager1) {
    this.rootView = rootView;
    this.dotsIndicator = dotsIndicator;
    this.holder = holder;
    this.linearDotsBox = linearDotsBox;
    this.viewpager1 = viewpager1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static IntroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static IntroBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.intro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static IntroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dots_indicator;
      DotsIndicator dotsIndicator = ViewBindings.findChildViewById(rootView, id);
      if (dotsIndicator == null) {
        break missingId;
      }

      id = R.id.holder;
      LinearLayout holder = ViewBindings.findChildViewById(rootView, id);
      if (holder == null) {
        break missingId;
      }

      id = R.id.linear_dots_box;
      LinearLayout linearDotsBox = ViewBindings.findChildViewById(rootView, id);
      if (linearDotsBox == null) {
        break missingId;
      }

      id = R.id.viewpager1;
      ViewPager viewpager1 = ViewBindings.findChildViewById(rootView, id);
      if (viewpager1 == null) {
        break missingId;
      }

      return new IntroBinding((LinearLayout) rootView, dotsIndicator, holder, linearDotsBox,
          viewpager1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
