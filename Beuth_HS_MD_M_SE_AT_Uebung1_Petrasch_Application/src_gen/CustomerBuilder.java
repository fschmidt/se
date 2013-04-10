	public class CustomerBuilder {
	
		private Customer customer;
		
		public CustomerBuilder () {
			this.customer = new Customer();
		}
		public CustomerBuilder name (java.lang.String name) {
			customer.setName(name);
			return this;
		}
		public CustomerBuilder number (int number) {
			customer.setNumber(number);
			return this;
		}
		public CustomerBuilder address (java.lang.String address) {
			customer.setAddress(address);
			return this;
		}
		public CustomerBuilder creationDate (java.util.Date creationDate) {
			customer.setCreationDate(creationDate);
			return this;
		}
		public CustomerBuilder preferred (boolean preferred) {
			customer.setPreferred(preferred);
			return this;
		}
		public Customer build() {
			return customer;
		}
	}
