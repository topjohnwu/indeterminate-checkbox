package com.topjohnwu.widget;

import android.widget.Checkable;

import androidx.annotation.Nullable;

/**
 * Extension to Checkable interface with addition "indeterminate" state
 * represented by <code>getState()</code>. Value meanings:
 *   null = indeterminate state
 *   true = checked state
 *   false = unchecked state
 */
public interface IndeterminateCheckable extends Checkable {

    void setState(@Nullable Boolean state);

    @Nullable
    Boolean getState();
}
