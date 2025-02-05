// Generated by view binder compiler. Do not edit!
package dev.lucasnlm.antimine.themes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import dev.lucasnlm.antimine.themes.R;
import dev.lucasnlm.antimine.ui.view.OfferCardButtonView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityThemeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView skins;

  @NonNull
  public final MaterialCardView skinsCard;

  @NonNull
  public final RecyclerView themes;

  @NonNull
  public final MaterialCardView themesCard;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final OfferCardButtonView unlockAll;

  private ActivityThemeBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView skins,
      @NonNull MaterialCardView skinsCard, @NonNull RecyclerView themes,
      @NonNull MaterialCardView themesCard, @NonNull MaterialToolbar toolbar,
      @NonNull OfferCardButtonView unlockAll) {
    this.rootView = rootView;
    this.skins = skins;
    this.skinsCard = skinsCard;
    this.themes = themes;
    this.themesCard = themesCard;
    this.toolbar = toolbar;
    this.unlockAll = unlockAll;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityThemeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityThemeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_theme, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityThemeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.skins;
      RecyclerView skins = ViewBindings.findChildViewById(rootView, id);
      if (skins == null) {
        break missingId;
      }

      id = R.id.skinsCard;
      MaterialCardView skinsCard = ViewBindings.findChildViewById(rootView, id);
      if (skinsCard == null) {
        break missingId;
      }

      id = R.id.themes;
      RecyclerView themes = ViewBindings.findChildViewById(rootView, id);
      if (themes == null) {
        break missingId;
      }

      id = R.id.themesCard;
      MaterialCardView themesCard = ViewBindings.findChildViewById(rootView, id);
      if (themesCard == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.unlockAll;
      OfferCardButtonView unlockAll = ViewBindings.findChildViewById(rootView, id);
      if (unlockAll == null) {
        break missingId;
      }

      return new ActivityThemeBinding((ConstraintLayout) rootView, skins, skinsCard, themes,
          themesCard, toolbar, unlockAll);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
