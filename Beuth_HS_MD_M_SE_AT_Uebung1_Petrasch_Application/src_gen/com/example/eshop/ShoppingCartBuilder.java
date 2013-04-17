package com.example.eshop;
public class ShoppingCartBuilder {
	private ShoppingCart shoppingCart;
	
	public ShoppingCartBuilder () {
		this.shoppingCart = new ShoppingCart();
	}
	public ShoppingCartBuilder state (ShoppingCartState state) {
		shoppingCart.setState(state);
		return this;
	}
	public ShoppingCartBuilder turnover (float turnover) {
		shoppingCart.setTurnover(turnover);
		return this;
	}
	public ShoppingCart build() {
		return shoppingCart;
	}
}
