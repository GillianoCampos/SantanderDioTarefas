// Generated by view binder compiler. Do not edit!
package com.example.todolist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.todolist.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final EmptyStateBinding includeEmpty;

  @NonNull
  public final RecyclerView rvTasks;

  @NonNull
  public final TextView tvTitle;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull FloatingActionButton fab,
      @NonNull EmptyStateBinding includeEmpty, @NonNull RecyclerView rvTasks,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.fab = fab;
    this.includeEmpty = includeEmpty;
    this.rvTasks = rvTasks;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fab;
      FloatingActionButton fab = rootView.findViewById(id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.include_empty;
      View includeEmpty = rootView.findViewById(id);
      if (includeEmpty == null) {
        break missingId;
      }
      EmptyStateBinding binding_includeEmpty = EmptyStateBinding.bind(includeEmpty);

      id = R.id.rv_tasks;
      RecyclerView rvTasks = rootView.findViewById(id);
      if (rvTasks == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = rootView.findViewById(id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, fab, binding_includeEmpty,
          rvTasks, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}