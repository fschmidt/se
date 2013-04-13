package com.example.eshop;
public class ShoppingCart 
	{
	private ShoppingCartState state;
	private float turnover;
	public ShoppingCart () {
	}

	public ShoppingCartState getState() { 
		return this.state;
	}
	
	public void setState(ShoppingCartState state) { 
		this.state = state;
	}

	public float getTurnover() { 
		return this.turnover;
	}
	
	public void setTurnover(float turnover) { 
		this.turnover = turnover;
	}
} 
