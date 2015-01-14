package com.github.t3t5u.common.domain;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@SuppressWarnings("serial")
public abstract class AbstractEntity<E extends Entity<E, IDENTITY>, IDENTITY extends Identity<?>> implements Entity<E, IDENTITY> {
	private final IDENTITY identity;

	protected AbstractEntity(final IDENTITY identity) {
		this.identity = identity;
	}

	@Override
	public IDENTITY getIdentity() {
		return identity;
	}

	@Override
	public boolean sameIdentityAs(final E other) {
		return (other == this) || ((other != null) && getIdentity().equals(other.getIdentity()));
	}

	@Override
	public String toString() {
		return new ReflectionToStringBuilder(this).build();
	}

	@Override
	@SuppressWarnings("unchecked")
	public E clone() {
		return (E) SerializationUtils.clone(this);
	}
}
