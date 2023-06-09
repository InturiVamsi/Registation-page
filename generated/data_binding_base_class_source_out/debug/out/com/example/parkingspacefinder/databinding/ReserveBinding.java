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

public final class ReserveBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView button4;

  @NonNull
  public final EditText editTextDate;

  @NonNull
  public final EditText editTextTime;

  @NonNull
  public final EditText edtText1;

  @NonNull
  public final EditText edtText2;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView21;

  @NonNull
  public final TextView textView5;

  private ReserveBinding(@NonNull ConstraintLayout rootView, @NonNull TextView button4,
      @NonNull EditText editTextDate, @NonNull EditText editTextTime, @NonNull EditText edtText1,
      @NonNull EditText edtText2, @NonNull ImageView imageView, @NonNull ImageView imageView2,
      @NonNull TextView textView, @NonNull TextView textView12, @NonNull TextView textView14,
      @NonNull TextView textView19, @NonNull TextView textView2, @NonNull TextView textView20,
      @NonNull TextView textView21, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.button4 = button4;
    this.editTextDate = editTextDate;
    this.editTextTime = editTextTime;
    this.edtText1 = edtText1;
    this.edtText2 = edtText2;
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.textView = textView;
    this.textView12 = textView12;
    this.textView14 = textView14;
    this.textView19 = textView19;
    this.textView2 = textView2;
    this.textView20 = textView20;
    this.textView21 = textView21;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReserveBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReserveBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.reserve, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReserveBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button4;
      TextView button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.editTextDate;
      EditText editTextDate = ViewBindings.findChildViewById(rootView, id);
      if (editTextDate == null) {
        break missingId;
      }

      id = R.id.editTextTime;
      EditText editTextTime = ViewBindings.findChildViewById(rootView, id);
      if (editTextTime == null) {
        break missingId;
      }

      id = R.id.edtText1;
      EditText edtText1 = ViewBindings.findChildViewById(rootView, id);
      if (edtText1 == null) {
        break missingId;
      }

      id = R.id.edtText2;
      EditText edtText2 = ViewBindings.findChildViewById(rootView, id);
      if (edtText2 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = ViewBindings.findChildViewById(rootView, id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView21;
      TextView textView21 = ViewBindings.findChildViewById(rootView, id);
      if (textView21 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new ReserveBinding((ConstraintLayout) rootView, button4, editTextDate, editTextTime,
          edtText1, edtText2, imageView, imageView2, textView, textView12, textView14, textView19,
          textView2, textView20, textView21, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
