package pl.sda.szymon.pogo.structures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleOffer  {

    private String productName;
    private double price;


}
