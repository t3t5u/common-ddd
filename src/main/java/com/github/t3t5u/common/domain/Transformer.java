package com.github.t3t5u.common.domain;

import java.io.Serializable;

import com.github.t3t5u.common.expression.Expression;

public abstract class Transformer<E extends Entity<E, ?>> extends com.github.t3t5u.common.expression.Transformer implements Visitor<E, Expression<? extends Serializable>> {
	@Override
	public final <T extends Serializable> Expression<? extends Serializable> visit(final Property<E, T> expression) {
		return transform(expression);
	}

	protected <T extends Serializable> Expression<T> transform(final Property<E, T> expression) {
		return expression;
	}
}
