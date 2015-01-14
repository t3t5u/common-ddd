package com.github.t3t5u.common.domain;

import java.io.Serializable;

public interface ValueObject<VO extends ValueObject<VO>> extends Serializable {
	boolean sameValueAs(VO other);
}
