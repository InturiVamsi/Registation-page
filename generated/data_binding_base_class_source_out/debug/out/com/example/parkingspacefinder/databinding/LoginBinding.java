// Generated by view binder compiler. Do not edit!
package com.example.parkingspacefinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.parkingspacefinder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView button2;

  @NonNull
  public final EditText edttxt1;

  @NonNull
  public final EditText edttxt2;

  @NonNull
  public final ImageView imageView12;

  @NonNull
  public final ImageView imageView13;

  @NonNull
  public final ImageView imageView16;

  @NonNull
  public final ImageView imageView17;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final TextView textView26;

  @NonNull
  public final TextView textView28;

  private LoginBinding(@NonNull ConstraintLayout rootView, @NonNull TextView button2,
      @NonNull EditText edttxt1, @NonNull EditText edttxt2, @NonNull ImageView imageView12,
      @NonNull ImageView imageView13, @NonNull ImageView imageView16,
      @NonNull ImageView imageView17, @NonNull TextView textView25, @NonNull TextView textView26,
      @NonNull TextView textView28) {
    this.rootView = rootView;
    this.button2 = button2;
    this.edttxt1 = edttxt1;
    this.edttxt2 = edttxt2;
    this.imageView12 = imageView12;
    this.imageView13 = imageView13;
    this.imageView16 = imageView16;
    this.imageView17 = imageView17;
    this.textView25 = textView25;
    this.textView26 = textView26;
    this.textView28 = textView28;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button2;
      TextView button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.edttxt1;
      EditText edttxt1 = ViewBindings.findChildViewById(rootView, id);
      if (edttxt1 == null) {
        break missingId;
      }

      id = R.id.edttxt2;
      EditText edttxt2 = ViewBindings.findChildViewById(rootView, id);
      if (edttxt2 == null) {
        break missingId;
      }

      id = R.id.imageView12;
      ImageView imageView12 = ViewBindings.findChildViewById(rootView, id);
      if (imageView12 == null) {
        break missingId;
      }

      id = R.id.imageView13;
      ImageView imageView13 = ViewBindings.findChildViewById(rootView, id);
      if (imageView13 == null) {
        break missingId;
      }

      id = R.id.imageView16;
      ImageView imageView16 = ViewBindings.findChildViewById(rootView, id);
      if (imageView16 == null) {
        break missingId;
      }

      id = R.id.imageView17;
      ImageView imageView17 = ViewBindings.findChildViewById(rootView, id);
      if (imageView17 == null) {
        break missingId;
      }

      id = R.id.textView25;
      TextView textView25 = ViewBindings.findChildViewById(rootView, id);
      if (textView25 == null) {
        break missingId;
      }

      id = R.id.textView26;
      TextView textView26 = ViewBindings.findChildViewById(rootView, id);
      if (textView26 == null) {
        break missingId;
      }

      id = R.id.textView28;
      TextView textView28 = ViewBindings.findChildViewById(rootView, id);
      if (textView28 == null) {
        break missingId;
      }

      return new LoginBinding((ConstraintLayout) rootView, button2, edttxt1, edttxt2, imageView12,
          imageView13, imageView16, imageView17, textView25, textView26, textView28);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
