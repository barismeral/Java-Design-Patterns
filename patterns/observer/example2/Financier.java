package patterns.observer.example2;

public class Financier implements IFinancier {

   public String financierName;


    @Override
    public void update(Stock stock) {

        System.out.println(stock.getName()+" Finansörün lot değeri: "+stock.getLotValue());

    }
}
