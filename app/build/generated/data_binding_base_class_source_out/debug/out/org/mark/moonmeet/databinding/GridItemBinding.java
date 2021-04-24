// Generated by view binder compiler. Do not edit!
package org.mark.moonmeet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.mark.moonmeet.R;

public final class GridItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageview1;

  @NonNull
  public final ImageView imageview2;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final LinearLayout linear2;

  @NonNull
  public final LinearLayout linear3;

  @NonNull
  public final LinearLayout linearBase;

  @NonNull
  public final TextView textview1;

  private GridItemBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageview1,
      @NonNull ImageView imageview2, @NonNull LinearLayout linear1, @NonNull LinearLayout linear2,
      @NonNull LinearLayout linear3, @NonNull LinearLayout linearBase,
      @NonNull TextView textview1) {
    this.rootView = rootView;
    this.imageview1 = imageview1;
    this.imageview2 = imageview2;
    this.linear1 = linear1;
    this.linear2 = linear2;
    this.linear3 = linear3;
    this.linearBase = linearBase;
    this.textview1 = textview1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GridItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageview1;
      ImageView imageview1 = ViewBindings.findChildViewById(rootView, id);
      if (imageview1 == null) {
        break missingId;
      }

      id = R.id.imageview2;
      ImageView imageview2 = ViewBindings.findChildViewById(rootView, id);
      if (imageview2 == null) {
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

      id = R.id.linear3;
      LinearLayout linear3 = ViewBindings.findChildViewById(rootView, id);
      if (linear3 == null) {
        break missingId;
      }

      id = R.id.linear_base;
      LinearLayout linearBase = ViewBindings.findChildViewById(rootView, id);
      if (linearBase == null) {
        break missingId;
      }

      id = R.id.textview1;
      TextView textview1 = ViewBindings.findChildViewById(rootView, id);
      if (textview1 == null) {
        break missingId;
      }

      return new GridItemBinding((LinearLayout) rootView, imageview1, imageview2, linear1, linear2,
          linear3, linearBase, textview1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
