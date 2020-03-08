package pl.sda.szymon.pogo.structures;

import java.util.Comparator;

public class Comperator implements Comparator<SaleOffer> {
    private boolean malejaco;

    public Comperator(boolean malejaco) {
        this.malejaco = malejaco;
    }

    @Override
    public int compare(SaleOffer so1,SaleOffer so2){
        if(malejaco){
            return Double.compare(so1.getPrice(), so2.getPrice());
        }else {
            return Double.compare(so2.getPrice(), so1.getPrice());
        }
//        return (Double.compare(so1.getPrice(),so2.getPrice()) * (malejaco ? 1 : -1));
    }
}
