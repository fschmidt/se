package de.bht.se.exercise01;
	public class Order 
	{
	private java.util.Date creatingDate;
	private java.util.Date dueDate;
	private OrderState state;
	private Customer customer;
	
	private java.util.List<Product> orderedProducts;
	
	public Order () {
	}

	public double getTotal() { 
	}

	public java.util.Date getCreatingDate() { 
		return this.creatingDate;
	}
	
	public void setCreatingDate(java.util.Date creatingDate) { 
		this.creatingDate = creatingDate;
	}

	public java.util.Date getDueDate() { 
		return this.dueDate;
	}
	
	public void setDueDate(java.util.Date dueDate) { 
		this.dueDate = dueDate;
	}

	public OrderState getState() { 
		return this.state;
	}
	
	public void setState(OrderState state) { 
		this.state = state;
	}

	public Customer getCustomer() { 
		return this.customer;
	}
	
	public void setCustomer (Customer customer) { 
		this.customer = customer;
	}
	
	public java.util.List<Product> getAllOrderedProducts() { 
		return this.orderedProducts;
	}
	
	public void set(java.util.List<Product> orderedProducts) { 
		this.orderedProducts = orderedProducts;
	}
	
} 
