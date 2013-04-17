package com.example.eshop;
public class ITest2Builder {
	private ITest2 iTest2;
	
	public ITest2Builder () {
		this.iTest2 = new ITest2();
	}
	public ITest2 build() {
		return iTest2;
	}
}
