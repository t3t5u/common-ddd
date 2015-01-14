package com.github.t3t5u.common.domain;

import java.io.Serializable;

import com.github.t3t5u.common.expression.BinaryExpression;
import com.google.common.base.Function;

public abstract class Inspector<E extends Entity<E, ?>> extends com.github.t3t5u.common.expression.Inspector implements Visitor<E, Boolean> {
	public Inspector(final boolean external, final Function<com.github.t3t5u.common.expression.Inspector, Function<BinaryExpression<?, ?, ?>, Boolean>> internal) {
		super(external, internal);
	}

	@Override
	public final <T extends Serializable> Boolean visit(final Property<E, T> expression) {
		return inspect(expression);
	}

	protected <T extends Serializable> boolean inspect(final Property<E, T> expression) {
		return getExternal();
	}
}
