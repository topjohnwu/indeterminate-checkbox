package com.topjohnwu.widget;

import android.content.res.ColorStateList;
import android.util.StateSet;
import android.view.View;
import android.widget.CompoundButton;

import androidx.annotation.DrawableRes;
import androidx.core.widget.CompoundButtonCompat;

import com.google.android.material.color.MaterialColors;

class Utils {

    public static void setButtonDrawable(CompoundButton view, @DrawableRes int drawable) {
        if (!(view instanceof IndeterminateCheckable)) {
            throw new IllegalArgumentException("view must implement IndeterminateCheckable");
        }
        view.setButtonDrawable(drawable);
        CompoundButtonCompat.setButtonTintList(view, createIndeterminateColorStateList(view));
    }

    private static ColorStateList createIndeterminateColorStateList(View view) {

        final int[][] states = new int[][]{
                new int[]{-android.R.attr.state_enabled},
                new int[]{R.attr.state_indeterminate},
                new int[]{android.R.attr.state_checked},
                StateSet.WILD_CARD
        };

        int colorControlActivated = MaterialColors.getColor(view, R.attr.colorControlActivated);
        int colorIndeterminate = MaterialColors.getColor(view, R.attr.colorControlIndeterminate, colorControlActivated);
        int colorSurface = MaterialColors.getColor(view, R.attr.colorSurface);
        int colorOnSurface = MaterialColors.getColor(view, R.attr.colorOnSurface);

        int checked = MaterialColors.layer(colorSurface, colorControlActivated, MaterialColors.ALPHA_FULL);
        int indeterminate = MaterialColors.layer(colorSurface, colorIndeterminate, MaterialColors.ALPHA_FULL);
        int unchecked = MaterialColors.layer(colorSurface, colorOnSurface, MaterialColors.ALPHA_MEDIUM);
        int disabled = MaterialColors.layer(colorSurface, colorOnSurface, MaterialColors.ALPHA_DISABLED);

        final int[] colors = new int[]{
                disabled,
                indeterminate,
                checked,
                unchecked
        };

        return new ColorStateList(states, colors);
    }
}
