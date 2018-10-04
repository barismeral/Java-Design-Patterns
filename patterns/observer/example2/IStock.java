package patterns.observer.example2;

public interface IStock {


    void addFinacier(IFinancier financier);
    void removeFianancier(IFinancier financier);
    void sendNotify();
}
