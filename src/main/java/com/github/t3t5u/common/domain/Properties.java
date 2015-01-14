package com.github.t3t5u.common.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.github.t3t5u.common.expression.Literalizer;

public final class Properties {
	private Properties() {
	}

	public static <E extends Entity<E, ?>> Property<E, Boolean> asBoolean(final Literalizer<E, Boolean> literalizer) {
		return new Property<E, Boolean>(Boolean.class, literalizer);
	}

	public static <E extends Entity<E, ?>> Property<E, BigDecimal> asBigDecimal(final Literalizer<E, BigDecimal> literalizer) {
		return new Property<E, BigDecimal>(BigDecimal.class, literalizer);
	}

	public static <E extends Entity<E, ?>> Property<E, Byte> asByte(final Literalizer<E, Byte> literalizer) {
		return new Property<E, Byte>(Byte.class, literalizer);
	}

	public static <E extends Entity<E, ?>> Property<E, Short> asShort(final Literalizer<E, Short> literalizer) {
		return new Property<E, Short>(Short.class, literalizer);
	}

	public static <E extends Entity<E, ?>> Property<E, Integer> asInteger(final Literalizer<E, Integer> literalizer) {
		return new Property<E, Integer>(Integer.class, literalizer);
	}

	public static <E extends Entity<E, ?>> Property<E, Long> asLong(final Literalizer<E, Long> literalizer) {
		return new Property<E, Long>(Long.class, literalizer);
	}

	public static <E extends Entity<E, ?>> Property<E, Float> asFloat(final Literalizer<E, Float> literalizer) {
		return new Property<E, Float>(Float.class, literalizer);
	}

	public static <E extends Entity<E, ?>> Property<E, Double> asDouble(final Literalizer<E, Double> literalizer) {
		return new Property<E, Double>(Double.class, literalizer);
	}

	public static <E extends Entity<E, ?>> Property<E, Character> asCharacter(final Literalizer<E, Character> literalizer) {
		return new Property<E, Character>(Character.class, literalizer);
	}

	public static <E extends Entity<E, ?>> Property<E, String> asString(final Literalizer<E, String> literalizer) {
		return new Property<E, String>(String.class, literalizer);
	}

	public static <E extends Entity<E, ?>, T extends Enum<T>> Property<E, T> asEnum(final Class<T> expressionClass, final Literalizer<E, T> literalizer) {
		return new Property<E, T>(expressionClass, literalizer);
	}

	public static <E extends Entity<E, ?>> Property<E, Date> asDate(final Literalizer<E, Date> literalizer) {
		return new Property<E, Date>(Date.class, literalizer);
	}
}
