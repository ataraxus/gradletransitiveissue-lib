package com.example.lib;

import com.example.lib_api.TransitiveApi;
import com.example.lib_impl.TransitiveImpl;

public class TransitiveFactory {
	public static TransitiveApi create() {
		return new TransitiveImpl();
	}
}
