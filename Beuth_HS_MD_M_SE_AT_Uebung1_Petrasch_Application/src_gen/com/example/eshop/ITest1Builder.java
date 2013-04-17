package com.example.eshop;
public class ITest1Builder {
	private ITest1 iTest1;
	
	public ITest1Builder () {
		this.iTest1 = new ITest1();
	}
	public ITest1 build() {
		return iTest1;
	}
}
