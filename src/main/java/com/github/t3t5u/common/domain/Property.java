package com.github.t3t5u.common.domain;

import java.io.Serializable;

import com.github.t3t5u.common.expression.AbstractExpression;
import com.github.t3t5u.common.expression.Literalizer;

@SuppressWarnings("serial")
public class Property<E extends Entity<E, ?>, T extends Serializable> extends AbstractExpression<T> {
	private final Literalizer<E, T> literalizer;

	Property(final Class<T> expressionClass, final Literalizer<E, T> literalizer) {
		super(expressionClass);
		this.literalizer = literalizer;
	}

	public Literalizer<E, T> getLiteralizer() {
		return literalizer;
	}

	@Override
	public T evaluate() {
		return null;
	}

	@Override
	@Deprecated
	@SuppressWarnings("unchecked")
	public <R> R accept(final com.github.t3t5u.common.expression.Visitor<R> visitor) {
		return visitor instanceof Visitor ? ((Visitor<E, R>) visitor).visit(this) : null;
	}
}
