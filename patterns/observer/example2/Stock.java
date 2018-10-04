package patterns.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class Stock implements IStock{

    private String name;
    private int lotValue;
    private List<IFinancier> financiers;

    public Stock(){

    }

    public Stock(String name,int lotValue){
        setName(name);
        setLotValue(lotValue);
    }

    {
        financiers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        sendNotify();
    }

    public int getLotValue() {
        return lotValue;
    }

    public void setLotValue(int lotValue) {
        this.lotValue = lotValue;
        sendNotify();
    }

    @Override
    public void addFinacier(IFinancier financier) {
        financiers.add(financier);
    }

    @Override
    public void removeFianancier(IFinancier financier) {
        financiers.remove(financier);
    }

    @Override
    public void sendNotify() {

        for (IFinancier financier : financiers){

            financier.update(this);
        }

    }
}
