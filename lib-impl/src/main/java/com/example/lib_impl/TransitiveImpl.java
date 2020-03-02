package com.example.lib_impl;

import com.example.lib_api.TransitiveApi;

public class TransitiveImpl implements TransitiveApi {

	@Override
	public void doSomething() {
		throw new RuntimeException("try to set breakpoint here");
	}
}
