// Generated by view binder compiler. Do not edit!
package com.example.emosense.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.emosense.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemFlashcardBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton btnFlip;

  @NonNull
  public final RelativeLayout card1;

  @NonNull
  public final RelativeLayout cardBack1;

  @NonNull
  public final RelativeLayout cardFront1;

  @NonNull
  public final TextView label;

  @NonNull
  public final ImageView pauseAudio;

  @NonNull
  public final ImageView playAudio;

  private ItemFlashcardBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton btnFlip,
      @NonNull RelativeLayout card1, @NonNull RelativeLayout cardBack1,
      @NonNull RelativeLayout cardFront1, @NonNull TextView label, @NonNull ImageView pauseAudio,
      @NonNull ImageView playAudio) {
    this.rootView = rootView;
    this.btnFlip = btnFlip;
    this.card1 = card1;
    this.cardBack1 = cardBack1;
    this.cardFront1 = cardFront1;
    this.label = label;
    this.pauseAudio = pauseAudio;
    this.playAudio = playAudio;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemFlashcardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemFlashcardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_flashcard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemFlashcardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnFlip;
      ImageButton btnFlip = ViewBindings.findChildViewById(rootView, id);
      if (btnFlip == null) {
        break missingId;
      }

      RelativeLayout card1 = (RelativeLayout) rootView;

      id = R.id.cardBack1;
      RelativeLayout cardBack1 = ViewBindings.findChildViewById(rootView, id);
      if (cardBack1 == null) {
        break missingId;
      }

      id = R.id.cardFront1;
      RelativeLayout cardFront1 = ViewBindings.findChildViewById(rootView, id);
      if (cardFront1 == null) {
        break missingId;
      }

      id = R.id.label;
      TextView label = ViewBindings.findChildViewById(rootView, id);
      if (label == null) {
        break missingId;
      }

      id = R.id.pauseAudio;
      ImageView pauseAudio = ViewBindings.findChildViewById(rootView, id);
      if (pauseAudio == null) {
        break missingId;
      }

      id = R.id.playAudio;
      ImageView playAudio = ViewBindings.findChildViewById(rootView, id);
      if (playAudio == null) {
        break missingId;
      }

      return new ItemFlashcardBinding((RelativeLayout) rootView, btnFlip, card1, cardBack1,
          cardFront1, label, pauseAudio, playAudio);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}