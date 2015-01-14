package com.github.t3t5u.common.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@SuppressWarnings("serial")
public abstract class AbstractValueObject<VO extends ValueObject<VO>> implements ValueObject<VO> {
	@Override
	public boolean sameValueAs(final VO other) {
		return equals(other);
	}

	@Override
	public boolean equals(final Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
