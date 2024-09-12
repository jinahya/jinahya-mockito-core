package com.github.jinahya.mockito;

import org.mockito.ArgumentMatchers;

public class JinahyaArgumentMatchers {

    // ------------------------------------------------------------------------------------------------------------ long
    public static long negativeLong() {
        return ArgumentMatchers.longThat(v -> v != null && v < 0L);
    }

    public static long positiveLong() {
        return ArgumentMatchers.longThat(v -> v != null && v > 0L);
    }

    public static long nonNegativeLong() {
        return ArgumentMatchers.longThat(v -> v != null && v >= 0L);
    }

    public static long nonPositiveLong() {
        return ArgumentMatchers.longThat(v -> v != null && v <= 0L);
    }

    // -----------------------------------------------------------------------------------------------------------------
    protected JinahyaArgumentMatchers() {
        super();
        final ArgumentMatchers x = new ArgumentMatchers();
    }
}
