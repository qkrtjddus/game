// Generated by view binder compiler. Do not edit!
package dev.lucasnlm.antimine.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dev.lucasnlm.antimine.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HexBannerBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AppCompatImageView banner;

  private HexBannerBinding(@NonNull FrameLayout rootView, @NonNull AppCompatImageView banner) {
    this.rootView = rootView;
    this.banner = banner;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HexBannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HexBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.hex_banner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HexBannerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.banner;
      AppCompatImageView banner = ViewBindings.findChildViewById(rootView, id);
      if (banner == null) {
        break missingId;
      }

      return new HexBannerBinding((FrameLayout) rootView, banner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
