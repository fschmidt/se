// This class is a test driver for the generated Code (in src_gen)
public class Main {

   /**
    * @param args
    */
   public static void main(String[] args) {
      // create Customer
      Customer meier = new Customer();
      meier.setName("Meier");
      meier.setAddress("Kleistpark 2");

      // show Customer
      System.out.println("Customer: name=" + meier.getName() + " address=" + meier.getAddress());

      // create Employee
      Customer mueller = new CustomerBuilder().name("Müller").address("some Address").number(42).build();

      // show Employee
      System.out.println("Employee: name=" + mueller.getName() + " number=" + mueller.getNumber());

   }

}
