package patterns.observer.example1;

public interface Sellervable {

    void addCustomer(Customerable customer);
    void removeCustomer(Customerable customer);
    void sendNotify();

    }

