// Generated by view binder compiler. Do not edit!
package dev.lucasnlm.antimine.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import dev.lucasnlm.antimine.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewHistoryItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final AppCompatImageView badge;

  @NonNull
  public final MaterialTextView dash;

  @NonNull
  public final MaterialTextView difficulty;

  @NonNull
  public final MaterialTextView minefieldSize;

  @NonNull
  public final MaterialTextView minesCount;

  @NonNull
  public final MaterialButton open;

  @NonNull
  public final MaterialButton replay;

  private ViewHistoryItemBinding(@NonNull MaterialCardView rootView,
      @NonNull AppCompatImageView badge, @NonNull MaterialTextView dash,
      @NonNull MaterialTextView difficulty, @NonNull MaterialTextView minefieldSize,
      @NonNull MaterialTextView minesCount, @NonNull MaterialButton open,
      @NonNull MaterialButton replay) {
    this.rootView = rootView;
    this.badge = badge;
    this.dash = dash;
    this.difficulty = difficulty;
    this.minefieldSize = minefieldSize;
    this.minesCount = minesCount;
    this.open = open;
    this.replay = replay;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewHistoryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewHistoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_history_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewHistoryItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.badge;
      AppCompatImageView badge = ViewBindings.findChildViewById(rootView, id);
      if (badge == null) {
        break missingId;
      }

      id = R.id.dash;
      MaterialTextView dash = ViewBindings.findChildViewById(rootView, id);
      if (dash == null) {
        break missingId;
      }

      id = R.id.difficulty;
      MaterialTextView difficulty = ViewBindings.findChildViewById(rootView, id);
      if (difficulty == null) {
        break missingId;
      }

      id = R.id.minefieldSize;
      MaterialTextView minefieldSize = ViewBindings.findChildViewById(rootView, id);
      if (minefieldSize == null) {
        break missingId;
      }

      id = R.id.minesCount;
      MaterialTextView minesCount = ViewBindings.findChildViewById(rootView, id);
      if (minesCount == null) {
        break missingId;
      }

      id = R.id.open;
      MaterialButton open = ViewBindings.findChildViewById(rootView, id);
      if (open == null) {
        break missingId;
      }

      id = R.id.replay;
      MaterialButton replay = ViewBindings.findChildViewById(rootView, id);
      if (replay == null) {
        break missingId;
      }

      return new ViewHistoryItemBinding((MaterialCardView) rootView, badge, dash, difficulty,
          minefieldSize, minesCount, open, replay);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
