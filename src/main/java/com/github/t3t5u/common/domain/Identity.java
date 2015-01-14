package com.github.t3t5u.common.domain;

import java.io.Serializable;

public interface Identity<VALUE> extends Serializable {
	VALUE getValue();
}
