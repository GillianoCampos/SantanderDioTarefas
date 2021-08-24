// Generated by view binder compiler. Do not edit!
package com.example.todolist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.todolist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EmptyStateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout emptyState;

  @NonNull
  public final AppCompatImageView ivImage;

  @NonNull
  public final TextView tvMessage;

  private EmptyStateBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout emptyState, @NonNull AppCompatImageView ivImage,
      @NonNull TextView tvMessage) {
    this.rootView = rootView;
    this.emptyState = emptyState;
    this.ivImage = ivImage;
    this.tvMessage = tvMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EmptyStateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EmptyStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.empty_state, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EmptyStateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout emptyState = (ConstraintLayout) rootView;

      id = R.id.iv_image;
      AppCompatImageView ivImage = rootView.findViewById(id);
      if (ivImage == null) {
        break missingId;
      }

      id = R.id.tv_message;
      TextView tvMessage = rootView.findViewById(id);
      if (tvMessage == null) {
        break missingId;
      }

      return new EmptyStateBinding((ConstraintLayout) rootView, emptyState, ivImage, tvMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
