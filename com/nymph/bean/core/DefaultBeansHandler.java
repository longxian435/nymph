package com.nymph.bean.core;

import com.nymph.bean.BeansHandler;

public class DefaultBeansHandler implements BeansHandler {

	@Override
	public Object handlerBefore(Object bean) {
		return bean;
	}

	@Override
	public void handlerAfter(Object bean) {
		
	}

}
