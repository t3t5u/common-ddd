package com.github.t3t5u.common.domain;

import java.io.Serializable;

public interface Visitor<E extends Entity<E, ?>, R> extends com.github.t3t5u.common.expression.Visitor<R> {
	<T extends Serializable> R visit(Property<E, T> expression);
}
