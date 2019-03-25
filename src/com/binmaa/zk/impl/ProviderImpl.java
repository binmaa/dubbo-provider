package com.binmaa.zk.impl;

import com.binmaa.zk.Provider;

public class ProviderImpl implements Provider {

	@Override
	public String provider(String msg) {
		return String.format("provider收到consumer请求%s", msg);
	}

}
