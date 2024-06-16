// Generated by view binder compiler. Do not edit!
package com.example.emosense.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.emosense.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNewsDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final CardView headerCardView;

  @NonNull
  public final ImageView ivNews;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView tvDesc;

  @NonNull
  public final TextView tvTitle;

  private ActivityNewsDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton backButton, @NonNull CardView headerCardView, @NonNull ImageView ivNews,
      @NonNull ConstraintLayout main, @NonNull TextView textView2, @NonNull TextView tvDesc,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.headerCardView = headerCardView;
    this.ivNews = ivNews;
    this.main = main;
    this.textView2 = textView2;
    this.tvDesc = tvDesc;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNewsDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNewsDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_news_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNewsDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.headerCardView;
      CardView headerCardView = ViewBindings.findChildViewById(rootView, id);
      if (headerCardView == null) {
        break missingId;
      }

      id = R.id.ivNews;
      ImageView ivNews = ViewBindings.findChildViewById(rootView, id);
      if (ivNews == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.tvDesc;
      TextView tvDesc = ViewBindings.findChildViewById(rootView, id);
      if (tvDesc == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityNewsDetailBinding((ConstraintLayout) rootView, backButton, headerCardView,
          ivNews, main, textView2, tvDesc, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
