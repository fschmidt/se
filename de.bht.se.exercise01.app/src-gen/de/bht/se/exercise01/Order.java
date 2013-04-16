package de.bht.se.exercise01;
	public class Order 
	{
	private java.util.Date creatingDate;
	private java.util.Date dueDate;
	private  state;
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

	public  getState() { 
		return this.state;
	}
	
	public void setState( state) { 
		this.state = state;
	}
} 
