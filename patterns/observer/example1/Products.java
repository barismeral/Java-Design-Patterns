package patterns.observer.example1;

public enum Products {

    CASE(100),
    MOTHERBOARD(250),
    PSU(125),
    CPU(350),
    GPU(550),
    HDD(150),
    SDD(200),
    RAM(180);

    int price;

    Products(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
