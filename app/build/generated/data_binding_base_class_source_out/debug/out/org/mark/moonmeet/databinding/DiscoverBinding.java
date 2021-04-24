// Generated by view binder compiler. Do not edit!
package org.mark.moonmeet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.mark.moonmeet.R;

public final class DiscoverBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final FrameLayout holder;

  @NonNull
  public final ImageView imageview1;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final LinearLayout nopplyet;

  @NonNull
  public final MaterialTextView nopplyetFullTxt;

  @NonNull
  public final MaterialTextView nopplyetMiniTxt;

  @NonNull
  public final RecyclerView recyclerview1;

  @NonNull
  public final TextView textview1;

  private DiscoverBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout holder,
      @NonNull ImageView imageview1, @NonNull LinearLayout linear1, @NonNull LinearLayout nopplyet,
      @NonNull MaterialTextView nopplyetFullTxt, @NonNull MaterialTextView nopplyetMiniTxt,
      @NonNull RecyclerView recyclerview1, @NonNull TextView textview1) {
    this.rootView = rootView;
    this.holder = holder;
    this.imageview1 = imageview1;
    this.linear1 = linear1;
    this.nopplyet = nopplyet;
    this.nopplyetFullTxt = nopplyetFullTxt;
    this.nopplyetMiniTxt = nopplyetMiniTxt;
    this.recyclerview1 = recyclerview1;
    this.textview1 = textview1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DiscoverBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DiscoverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.discover, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DiscoverBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.holder;
      FrameLayout holder = ViewBindings.findChildViewById(rootView, id);
      if (holder == null) {
        break missingId;
      }

      id = R.id.imageview1;
      ImageView imageview1 = ViewBindings.findChildViewById(rootView, id);
      if (imageview1 == null) {
        break missingId;
      }

      id = R.id.linear1;
      LinearLayout linear1 = ViewBindings.findChildViewById(rootView, id);
      if (linear1 == null) {
        break missingId;
      }

      id = R.id.nopplyet;
      LinearLayout nopplyet = ViewBindings.findChildViewById(rootView, id);
      if (nopplyet == null) {
        break missingId;
      }

      id = R.id.nopplyet_full_txt;
      MaterialTextView nopplyetFullTxt = ViewBindings.findChildViewById(rootView, id);
      if (nopplyetFullTxt == null) {
        break missingId;
      }

      id = R.id.nopplyet_mini_txt;
      MaterialTextView nopplyetMiniTxt = ViewBindings.findChildViewById(rootView, id);
      if (nopplyetMiniTxt == null) {
        break missingId;
      }

      id = R.id.recyclerview1;
      RecyclerView recyclerview1 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerview1 == null) {
        break missingId;
      }

      id = R.id.textview1;
      TextView textview1 = ViewBindings.findChildViewById(rootView, id);
      if (textview1 == null) {
        break missingId;
      }

      return new DiscoverBinding((LinearLayout) rootView, holder, imageview1, linear1, nopplyet,
          nopplyetFullTxt, nopplyetMiniTxt, recyclerview1, textview1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
