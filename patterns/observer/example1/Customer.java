package patterns.observer.example1;


public class Customer implements Customerable {

    private String customerName;

    public Customer(){

    }
    public Customer(String customerName){
        this.customerName = customerName;
    }


    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return customerName;
    }


    @Override
    public void Update(Seller seller) {
        System.out.println("Dear "+getCustomerName()+", "+seller.getProducts()+"'s new Price = $"+seller.getProducts().price);
    }
}
