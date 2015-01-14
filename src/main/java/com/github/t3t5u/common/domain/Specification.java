package com.github.t3t5u.common.domain;

import com.github.t3t5u.common.expression.Expression;

public interface Specification<E extends Entity<E, ?>> extends Expression<Boolean> {
	boolean isSatisfiedBy(E candidate);
}
