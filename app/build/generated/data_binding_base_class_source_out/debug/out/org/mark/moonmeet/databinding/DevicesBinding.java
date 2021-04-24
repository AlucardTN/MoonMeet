// Generated by view binder compiler. Do not edit!
package org.mark.moonmeet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.FitWindowsLinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.mark.moonmeet.R;

public final class DevicesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ShapeableImageView back;

  @NonNull
  public final LinearLayout bar;

  @NonNull
  public final MaterialTextView countryText;

  @NonNull
  public final MaterialTextView devices;

  @NonNull
  public final LinearLayout dividerBottom;

  @NonNull
  public final FitWindowsLinearLayout fitslinearlayout;

  @NonNull
  public final LinearLayoutCompat linearcompat;

  @NonNull
  public final LinearLayoutCompat linearcompatHolderDevice;

  @NonNull
  public final LinearLayoutCompat linearcompatSemiOnline;

  @NonNull
  public final MaterialTextView moonmeetCurrentVersion;

  @NonNull
  public final MaterialTextView noActiveLongText;

  @NonNull
  public final MaterialTextView noActiveSessions;

  @NonNull
  public final ShapeableImageView noDevicesIcon;

  @NonNull
  public final LinearLayoutCompat noOtherSessionCompatLinear;

  @NonNull
  public final MaterialTextView onlineText;

  @NonNull
  public final MaterialTextView phoneStatus;

  @NonNull
  public final RelativeLayout relativeLayoutHolder;

  @NonNull
  public final RelativeLayout spaceRelative;

  @NonNull
  public final MaterialTextView thisDevice;

  private DevicesBinding(@NonNull LinearLayout rootView, @NonNull ShapeableImageView back,
      @NonNull LinearLayout bar, @NonNull MaterialTextView countryText,
      @NonNull MaterialTextView devices, @NonNull LinearLayout dividerBottom,
      @NonNull FitWindowsLinearLayout fitslinearlayout, @NonNull LinearLayoutCompat linearcompat,
      @NonNull LinearLayoutCompat linearcompatHolderDevice,
      @NonNull LinearLayoutCompat linearcompatSemiOnline,
      @NonNull MaterialTextView moonmeetCurrentVersion, @NonNull MaterialTextView noActiveLongText,
      @NonNull MaterialTextView noActiveSessions, @NonNull ShapeableImageView noDevicesIcon,
      @NonNull LinearLayoutCompat noOtherSessionCompatLinear, @NonNull MaterialTextView onlineText,
      @NonNull MaterialTextView phoneStatus, @NonNull RelativeLayout relativeLayoutHolder,
      @NonNull RelativeLayout spaceRelative, @NonNull MaterialTextView thisDevice) {
    this.rootView = rootView;
    this.back = back;
    this.bar = bar;
    this.countryText = countryText;
    this.devices = devices;
    this.dividerBottom = dividerBottom;
    this.fitslinearlayout = fitslinearlayout;
    this.linearcompat = linearcompat;
    this.linearcompatHolderDevice = linearcompatHolderDevice;
    this.linearcompatSemiOnline = linearcompatSemiOnline;
    this.moonmeetCurrentVersion = moonmeetCurrentVersion;
    this.noActiveLongText = noActiveLongText;
    this.noActiveSessions = noActiveSessions;
    this.noDevicesIcon = noDevicesIcon;
    this.noOtherSessionCompatLinear = noOtherSessionCompatLinear;
    this.onlineText = onlineText;
    this.phoneStatus = phoneStatus;
    this.relativeLayoutHolder = relativeLayoutHolder;
    this.spaceRelative = spaceRelative;
    this.thisDevice = thisDevice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DevicesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DevicesBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.devices, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DevicesBinding bind(@NonNull View rootView) {
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

      id = R.id.country_text;
      MaterialTextView countryText = ViewBindings.findChildViewById(rootView, id);
      if (countryText == null) {
        break missingId;
      }

      id = R.id.devices;
      MaterialTextView devices = ViewBindings.findChildViewById(rootView, id);
      if (devices == null) {
        break missingId;
      }

      id = R.id.divider_bottom;
      LinearLayout dividerBottom = ViewBindings.findChildViewById(rootView, id);
      if (dividerBottom == null) {
        break missingId;
      }

      id = R.id.fitslinearlayout;
      FitWindowsLinearLayout fitslinearlayout = ViewBindings.findChildViewById(rootView, id);
      if (fitslinearlayout == null) {
        break missingId;
      }

      id = R.id.linearcompat;
      LinearLayoutCompat linearcompat = ViewBindings.findChildViewById(rootView, id);
      if (linearcompat == null) {
        break missingId;
      }

      id = R.id.linearcompat_holder_device;
      LinearLayoutCompat linearcompatHolderDevice = ViewBindings.findChildViewById(rootView, id);
      if (linearcompatHolderDevice == null) {
        break missingId;
      }

      id = R.id.linearcompat_semi_online;
      LinearLayoutCompat linearcompatSemiOnline = ViewBindings.findChildViewById(rootView, id);
      if (linearcompatSemiOnline == null) {
        break missingId;
      }

      id = R.id.moonmeet_current_version;
      MaterialTextView moonmeetCurrentVersion = ViewBindings.findChildViewById(rootView, id);
      if (moonmeetCurrentVersion == null) {
        break missingId;
      }

      id = R.id.no_active_long_text;
      MaterialTextView noActiveLongText = ViewBindings.findChildViewById(rootView, id);
      if (noActiveLongText == null) {
        break missingId;
      }

      id = R.id.no_active_sessions;
      MaterialTextView noActiveSessions = ViewBindings.findChildViewById(rootView, id);
      if (noActiveSessions == null) {
        break missingId;
      }

      id = R.id.no_devices_icon;
      ShapeableImageView noDevicesIcon = ViewBindings.findChildViewById(rootView, id);
      if (noDevicesIcon == null) {
        break missingId;
      }

      id = R.id.no_other_session_compat_linear;
      LinearLayoutCompat noOtherSessionCompatLinear = ViewBindings.findChildViewById(rootView, id);
      if (noOtherSessionCompatLinear == null) {
        break missingId;
      }

      id = R.id.online_text;
      MaterialTextView onlineText = ViewBindings.findChildViewById(rootView, id);
      if (onlineText == null) {
        break missingId;
      }

      id = R.id.phone_status;
      MaterialTextView phoneStatus = ViewBindings.findChildViewById(rootView, id);
      if (phoneStatus == null) {
        break missingId;
      }

      id = R.id.relative_layout_holder;
      RelativeLayout relativeLayoutHolder = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayoutHolder == null) {
        break missingId;
      }

      id = R.id.space_relative;
      RelativeLayout spaceRelative = ViewBindings.findChildViewById(rootView, id);
      if (spaceRelative == null) {
        break missingId;
      }

      id = R.id.this_device;
      MaterialTextView thisDevice = ViewBindings.findChildViewById(rootView, id);
      if (thisDevice == null) {
        break missingId;
      }

      return new DevicesBinding((LinearLayout) rootView, back, bar, countryText, devices,
          dividerBottom, fitslinearlayout, linearcompat, linearcompatHolderDevice,
          linearcompatSemiOnline, moonmeetCurrentVersion, noActiveLongText, noActiveSessions,
          noDevicesIcon, noOtherSessionCompatLinear, onlineText, phoneStatus, relativeLayoutHolder,
          spaceRelative, thisDevice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
