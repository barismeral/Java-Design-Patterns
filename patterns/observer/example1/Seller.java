package patterns.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class Seller implements Sellervable {

    private List<Customerable> customerList = new ArrayList<>();

    private Products products;
    private int price;

    public void setPrice(int price,Products products){

         products.price=price;
          this.price = price;
         this.products = products;

        sendNotify();
    }










    public int getPrice(){
        return price;
    }

    public Products getProducts(){
        return this.products;
    }



    public Seller(){

    }

    public Seller(Customerable customer){

        customerList.add(customer);
    }


    @Override
    public void addCustomer(Customerable customer) {
        customerList.add(customer);
    }

    @Override
    public void removeCustomer(Customerable customer) {
        customerList.remove(customer);
    }

    @Override
    public void sendNotify() {

        for (Customerable customer : customerList){

            customer.Update(this);

        }

    }
}
