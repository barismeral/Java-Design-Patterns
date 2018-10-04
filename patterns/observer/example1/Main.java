package patterns.observer.example1;

public class Main {


    public static void main(String[] args) {

        Seller seller = new Seller();

        Customer baris = new Customer("Barış Meral");

        seller.addCustomer(baris);

         Customer james = new Customer("James Gosling");

         seller.addCustomer(james);




      seller.setPrice(250,Products.RAM);
      seller.setPrice(100,Products.PSU);









    }

}
