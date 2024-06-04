// Generated by view binder compiler. Do not edit!
package com.example.emosense.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.emosense.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemClinicBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView ivClinic;

  @NonNull
  public final TextView textView;

  private ItemClinicBinding(@NonNull CardView rootView, @NonNull ImageView imageView3,
      @NonNull ImageView ivClinic, @NonNull TextView textView) {
    this.rootView = rootView;
    this.imageView3 = imageView3;
    this.ivClinic = ivClinic;
    this.textView = textView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemClinicBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemClinicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_clinic, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemClinicBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.ivClinic;
      ImageView ivClinic = ViewBindings.findChildViewById(rootView, id);
      if (ivClinic == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ItemClinicBinding((CardView) rootView, imageView3, ivClinic, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
