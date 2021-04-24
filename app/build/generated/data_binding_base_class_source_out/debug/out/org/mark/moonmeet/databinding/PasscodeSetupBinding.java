// Generated by view binder compiler. Do not edit!
package org.mark.moonmeet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.andrognito.patternlockview.PatternLockView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.mark.moonmeet.R;

public final class PasscodeSetupBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ShapeableImageView back;

  @NonNull
  public final LinearLayout bar;

  @NonNull
  public final TextView cancelText;

  @NonNull
  public final TextView continueText;

  @NonNull
  public final LinearLayout divider;

  @NonNull
  public final LinearLayout holder;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final LinearLayout linear2;

  @NonNull
  public final PatternLockView patternlockview;

  @NonNull
  public final PatternLockView patternlockview1;

  @NonNull
  public final MaterialTextView privacyTopbar;

  @NonNull
  public final TextView textview1;

  private PasscodeSetupBinding(@NonNull LinearLayout rootView, @NonNull ShapeableImageView back,
      @NonNull LinearLayout bar, @NonNull TextView cancelText, @NonNull TextView continueText,
      @NonNull LinearLayout divider, @NonNull LinearLayout holder, @NonNull LinearLayout linear1,
      @NonNull LinearLayout linear2, @NonNull PatternLockView patternlockview,
      @NonNull PatternLockView patternlockview1, @NonNull MaterialTextView privacyTopbar,
      @NonNull TextView textview1) {
    this.rootView = rootView;
    this.back = back;
    this.bar = bar;
    this.cancelText = cancelText;
    this.continueText = continueText;
    this.divider = divider;
    this.holder = holder;
    this.linear1 = linear1;
    this.linear2 = linear2;
    this.patternlockview = patternlockview;
    this.patternlockview1 = patternlockview1;
    this.privacyTopbar = privacyTopbar;
    this.textview1 = textview1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PasscodeSetupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PasscodeSetupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.passcode_setup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PasscodeSetupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ShapeableImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.bar;
      LinearLayout bar = ViewBindings.findChildViewById(rootView, id);
      if (bar == null) {
        break missingId;
      }

      id = R.id.cancel_text;
      TextView cancelText = ViewBindings.findChildViewById(rootView, id);
      if (cancelText == null) {
        break missingId;
      }

      id = R.id.continue_text;
      TextView continueText = ViewBindings.findChildViewById(rootView, id);
      if (continueText == null) {
        break missingId;
      }

      id = R.id.divider;
      LinearLayout divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.holder;
      LinearLayout holder = ViewBindings.findChildViewById(rootView, id);
      if (holder == null) {
        break missingId;
      }

      id = R.id.linear1;
      LinearLayout linear1 = ViewBindings.findChildViewById(rootView, id);
      if (linear1 == null) {
        break missingId;
      }

      id = R.id.linear2;
      LinearLayout linear2 = ViewBindings.findChildViewById(rootView, id);
      if (linear2 == null) {
        break missingId;
      }

      id = R.id.patternlockview;
      PatternLockView patternlockview = ViewBindings.findChildViewById(rootView, id);
      if (patternlockview == null) {
        break missingId;
      }

      id = R.id.patternlockview1;
      PatternLockView patternlockview1 = ViewBindings.findChildViewById(rootView, id);
      if (patternlockview1 == null) {
        break missingId;
      }

      id = R.id.privacy_topbar;
      MaterialTextView privacyTopbar = ViewBindings.findChildViewById(rootView, id);
      if (privacyTopbar == null) {
        break missingId;
      }

      id = R.id.textview1;
      TextView textview1 = ViewBindings.findChildViewById(rootView, id);
      if (textview1 == null) {
        break missingId;
      }

      return new PasscodeSetupBinding((LinearLayout) rootView, back, bar, cancelText, continueText,
          divider, holder, linear1, linear2, patternlockview, patternlockview1, privacyTopbar,
          textview1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
