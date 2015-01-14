package com.github.t3t5u.common.domain;

import com.github.t3t5u.common.expression.AbstractExpression;
import com.github.t3t5u.common.expression.Expression;
import com.github.t3t5u.common.expression.Visitor;

@SuppressWarnings("serial")
public abstract class AbstractSpecification<E extends Entity<E, ?>> extends AbstractExpression<Boolean> implements Specification<E> {
	private final Expression<Boolean> expression;

	protected AbstractSpecification(final Expression<Boolean> expression) {
		super(Boolean.class);
		this.expression = expression;
	}

	@Override
	public Boolean evaluate() {
		return (expression != null) && expression.evaluate();
	}

	@Override
	public <R> R accept(final Visitor<R> visitor) {
		return expression != null ? expression.accept(visitor) : null;
	}
}
