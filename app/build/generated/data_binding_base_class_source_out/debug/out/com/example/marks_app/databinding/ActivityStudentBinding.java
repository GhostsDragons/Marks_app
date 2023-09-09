// Generated by view binder compiler. Do not edit!
package com.example.marks_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.marks_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityStudentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView Fra;

  @NonNull
  public final TableLayout MarksTable;

  private ActivityStudentBinding(@NonNull ConstraintLayout rootView, @NonNull TextView Fra,
      @NonNull TableLayout MarksTable) {
    this.rootView = rootView;
    this.Fra = Fra;
    this.MarksTable = MarksTable;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStudentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStudentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_student, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStudentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Fra;
      TextView Fra = ViewBindings.findChildViewById(rootView, id);
      if (Fra == null) {
        break missingId;
      }

      id = R.id.Marks_Table;
      TableLayout MarksTable = ViewBindings.findChildViewById(rootView, id);
      if (MarksTable == null) {
        break missingId;
      }

      return new ActivityStudentBinding((ConstraintLayout) rootView, Fra, MarksTable);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
