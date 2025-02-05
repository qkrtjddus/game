// Generated by view binder compiler. Do not edit!
package dev.lucasnlm.antimine.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;
import dev.lucasnlm.antimine.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPreferencesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialSwitch allowClickNumber;

  @NonNull
  public final MaterialSwitch automaticFlags;

  @NonNull
  public final MaterialButton exportSettings;

  @NonNull
  public final MaterialSwitch flagWhenTapOnNumbers;

  @NonNull
  public final MaterialTextView gameplayLabel;

  @NonNull
  public final MaterialCardView gameplaySettings;

  @NonNull
  public final MaterialTextView generalLabel;

  @NonNull
  public final MaterialCardView generalSettings;

  @NonNull
  public final MaterialSwitch hapticFeedback;

  @NonNull
  public final MaterialSwitch highlightUnsolvedNumbers;

  @NonNull
  public final MaterialSwitch hint;

  @NonNull
  public final MaterialSwitch immersiveMode;

  @NonNull
  public final MaterialButton importSettings;

  @NonNull
  public final MaterialSwitch music;

  @NonNull
  public final MaterialSwitch noGuessingMode;

  @NonNull
  public final MaterialSwitch openDirectly;

  @NonNull
  public final MaterialSwitch playGames;

  @NonNull
  public final LinearLayout settingsManagement;

  @NonNull
  public final MaterialSwitch showTimer;

  @NonNull
  public final MaterialSwitch showWindows;

  @NonNull
  public final MaterialSwitch soundEffects;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final MaterialSwitch useQuestionMark;

  private ActivityPreferencesBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialSwitch allowClickNumber, @NonNull MaterialSwitch automaticFlags,
      @NonNull MaterialButton exportSettings, @NonNull MaterialSwitch flagWhenTapOnNumbers,
      @NonNull MaterialTextView gameplayLabel, @NonNull MaterialCardView gameplaySettings,
      @NonNull MaterialTextView generalLabel, @NonNull MaterialCardView generalSettings,
      @NonNull MaterialSwitch hapticFeedback, @NonNull MaterialSwitch highlightUnsolvedNumbers,
      @NonNull MaterialSwitch hint, @NonNull MaterialSwitch immersiveMode,
      @NonNull MaterialButton importSettings, @NonNull MaterialSwitch music,
      @NonNull MaterialSwitch noGuessingMode, @NonNull MaterialSwitch openDirectly,
      @NonNull MaterialSwitch playGames, @NonNull LinearLayout settingsManagement,
      @NonNull MaterialSwitch showTimer, @NonNull MaterialSwitch showWindows,
      @NonNull MaterialSwitch soundEffects, @NonNull MaterialToolbar toolbar,
      @NonNull MaterialSwitch useQuestionMark) {
    this.rootView = rootView;
    this.allowClickNumber = allowClickNumber;
    this.automaticFlags = automaticFlags;
    this.exportSettings = exportSettings;
    this.flagWhenTapOnNumbers = flagWhenTapOnNumbers;
    this.gameplayLabel = gameplayLabel;
    this.gameplaySettings = gameplaySettings;
    this.generalLabel = generalLabel;
    this.generalSettings = generalSettings;
    this.hapticFeedback = hapticFeedback;
    this.highlightUnsolvedNumbers = highlightUnsolvedNumbers;
    this.hint = hint;
    this.immersiveMode = immersiveMode;
    this.importSettings = importSettings;
    this.music = music;
    this.noGuessingMode = noGuessingMode;
    this.openDirectly = openDirectly;
    this.playGames = playGames;
    this.settingsManagement = settingsManagement;
    this.showTimer = showTimer;
    this.showWindows = showWindows;
    this.soundEffects = soundEffects;
    this.toolbar = toolbar;
    this.useQuestionMark = useQuestionMark;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPreferencesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPreferencesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_preferences, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPreferencesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.allowClickNumber;
      MaterialSwitch allowClickNumber = ViewBindings.findChildViewById(rootView, id);
      if (allowClickNumber == null) {
        break missingId;
      }

      id = R.id.automaticFlags;
      MaterialSwitch automaticFlags = ViewBindings.findChildViewById(rootView, id);
      if (automaticFlags == null) {
        break missingId;
      }

      id = R.id.exportSettings;
      MaterialButton exportSettings = ViewBindings.findChildViewById(rootView, id);
      if (exportSettings == null) {
        break missingId;
      }

      id = R.id.flagWhenTapOnNumbers;
      MaterialSwitch flagWhenTapOnNumbers = ViewBindings.findChildViewById(rootView, id);
      if (flagWhenTapOnNumbers == null) {
        break missingId;
      }

      id = R.id.gameplayLabel;
      MaterialTextView gameplayLabel = ViewBindings.findChildViewById(rootView, id);
      if (gameplayLabel == null) {
        break missingId;
      }

      id = R.id.gameplaySettings;
      MaterialCardView gameplaySettings = ViewBindings.findChildViewById(rootView, id);
      if (gameplaySettings == null) {
        break missingId;
      }

      id = R.id.generalLabel;
      MaterialTextView generalLabel = ViewBindings.findChildViewById(rootView, id);
      if (generalLabel == null) {
        break missingId;
      }

      id = R.id.generalSettings;
      MaterialCardView generalSettings = ViewBindings.findChildViewById(rootView, id);
      if (generalSettings == null) {
        break missingId;
      }

      id = R.id.hapticFeedback;
      MaterialSwitch hapticFeedback = ViewBindings.findChildViewById(rootView, id);
      if (hapticFeedback == null) {
        break missingId;
      }

      id = R.id.highlightUnsolvedNumbers;
      MaterialSwitch highlightUnsolvedNumbers = ViewBindings.findChildViewById(rootView, id);
      if (highlightUnsolvedNumbers == null) {
        break missingId;
      }

      id = R.id.hint;
      MaterialSwitch hint = ViewBindings.findChildViewById(rootView, id);
      if (hint == null) {
        break missingId;
      }

      id = R.id.immersiveMode;
      MaterialSwitch immersiveMode = ViewBindings.findChildViewById(rootView, id);
      if (immersiveMode == null) {
        break missingId;
      }

      id = R.id.importSettings;
      MaterialButton importSettings = ViewBindings.findChildViewById(rootView, id);
      if (importSettings == null) {
        break missingId;
      }

      id = R.id.music;
      MaterialSwitch music = ViewBindings.findChildViewById(rootView, id);
      if (music == null) {
        break missingId;
      }

      id = R.id.noGuessingMode;
      MaterialSwitch noGuessingMode = ViewBindings.findChildViewById(rootView, id);
      if (noGuessingMode == null) {
        break missingId;
      }

      id = R.id.openDirectly;
      MaterialSwitch openDirectly = ViewBindings.findChildViewById(rootView, id);
      if (openDirectly == null) {
        break missingId;
      }

      id = R.id.playGames;
      MaterialSwitch playGames = ViewBindings.findChildViewById(rootView, id);
      if (playGames == null) {
        break missingId;
      }

      id = R.id.settingsManagement;
      LinearLayout settingsManagement = ViewBindings.findChildViewById(rootView, id);
      if (settingsManagement == null) {
        break missingId;
      }

      id = R.id.showTimer;
      MaterialSwitch showTimer = ViewBindings.findChildViewById(rootView, id);
      if (showTimer == null) {
        break missingId;
      }

      id = R.id.showWindows;
      MaterialSwitch showWindows = ViewBindings.findChildViewById(rootView, id);
      if (showWindows == null) {
        break missingId;
      }

      id = R.id.soundEffects;
      MaterialSwitch soundEffects = ViewBindings.findChildViewById(rootView, id);
      if (soundEffects == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.useQuestionMark;
      MaterialSwitch useQuestionMark = ViewBindings.findChildViewById(rootView, id);
      if (useQuestionMark == null) {
        break missingId;
      }

      return new ActivityPreferencesBinding((ConstraintLayout) rootView, allowClickNumber,
          automaticFlags, exportSettings, flagWhenTapOnNumbers, gameplayLabel, gameplaySettings,
          generalLabel, generalSettings, hapticFeedback, highlightUnsolvedNumbers, hint,
          immersiveMode, importSettings, music, noGuessingMode, openDirectly, playGames,
          settingsManagement, showTimer, showWindows, soundEffects, toolbar, useQuestionMark);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
