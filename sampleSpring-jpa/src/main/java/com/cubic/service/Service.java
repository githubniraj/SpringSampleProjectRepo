package com.cubic.service;

public interface Service<I, O> {
	O create(I input);
}
