// Generated by view binder compiler. Do not edit!
package com.example.parkingspacefinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class PaymentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView Dash;

  @NonNull
  public final ImageView imageView14;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView textView22;

  @NonNull
  public final TextView textView23;

  @NonNull
  public final TextView textView24;

  private PaymentBinding(@NonNull ConstraintLayout rootView, @NonNull TextView Dash,
      @NonNull ImageView imageView14, @NonNull ImageView imageView3, @NonNull TextView textView22,
      @NonNull TextView textView23, @NonNull TextView textView24) {
    this.rootView = rootView;
    this.Dash = Dash;
    this.imageView14 = imageView14;
    this.imageView3 = imageView3;
    this.textView22 = textView22;
    this.textView23 = textView23;
    this.textView24 = textView24;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PaymentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PaymentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.payment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PaymentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Dash_;
      TextView Dash = ViewBindings.findChildViewById(rootView, id);
      if (Dash == null) {
        break missingId;
      }

      id = R.id.imageView14;
      ImageView imageView14 = ViewBindings.findChildViewById(rootView, id);
      if (imageView14 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.textView22;
      TextView textView22 = ViewBindings.findChildViewById(rootView, id);
      if (textView22 == null) {
        break missingId;
      }

      id = R.id.textView23;
      TextView textView23 = ViewBindings.findChildViewById(rootView, id);
      if (textView23 == null) {
        break missingId;
      }

      id = R.id.textView24;
      TextView textView24 = ViewBindings.findChildViewById(rootView, id);
      if (textView24 == null) {
        break missingId;
      }

      return new PaymentBinding((ConstraintLayout) rootView, Dash, imageView14, imageView3,
          textView22, textView23, textView24);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
