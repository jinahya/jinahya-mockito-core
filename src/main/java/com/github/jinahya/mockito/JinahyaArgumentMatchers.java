package com.github.jinahya.mockito;

import org.mockito.ArgumentMatchers;

import java.util.Objects;
import java.util.function.Predicate;

public class JinahyaArgumentMatchers {

    public static <T> T from(final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ArgumentMatchers.argThat(predicate::test);
    }

    // ------------------------------------------------------------------------------------------------------------ int
    public static Predicate<Integer> NEGATIVE_INT_NULLABLE = v -> {
        return v == null || v < 0;
    };
    public static Predicate<Integer> NEGATIVE_INT_NONNULL = v -> {
        return v != null && v < 0;
    };

    public static int negativeInt(final boolean nullable) {
        return ArgumentMatchers.intThat(v -> {
            if (nullable) {
                return v == null || v < 0;
            } else {
                return v != null && v < 0;
            }
        });
    }

    public static int negativeInt() {
        return negativeInt(false);
    }

    public static int positiveInt() {
        return ArgumentMatchers.intThat(v -> v != null && v > 0L);
    }

    public static int nonNegativeInt() {
        return ArgumentMatchers.intThat(v -> v != null && v >= 0L);
    }

    public static int nonPositiveInt() {
        return ArgumentMatchers.intThat(v -> v != null && v <= 0L);
    }

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
