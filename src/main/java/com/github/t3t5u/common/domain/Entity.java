package com.github.t3t5u.common.domain;

import java.io.Serializable;

public interface Entity<E extends Entity<E, IDENTITY>, IDENTITY extends Identity<?>> extends Cloneable, Serializable {
	IDENTITY getIdentity();

	boolean sameIdentityAs(E other);

	E clone();
}
