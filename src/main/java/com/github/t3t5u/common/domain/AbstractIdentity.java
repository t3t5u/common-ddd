package com.github.t3t5u.common.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@SuppressWarnings("serial")
public abstract class AbstractIdentity<VALUE> implements Identity<VALUE> {
	private final VALUE value;

	protected AbstractIdentity(final VALUE value) {
		this.value = value;
	}

	@Override
	public VALUE getValue() {
		return value;
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean equals(final Object o) {
		return (o == this) || ((o instanceof Identity) && new EqualsBuilder().append(getValue(), ((Identity<VALUE>) o).getValue()).build());
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getValue()).build();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append(getValue()).build();
	}
}
