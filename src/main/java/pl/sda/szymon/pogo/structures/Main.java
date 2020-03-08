package pl.sda.szymon.pogo.structures;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("ASFaG", "asfvbg", 15),
                new Person("ASsdfFG", "asczxvbfg", 24),
                new Person("ASasFG", "asfvvbg", 43),
                new Person("ASFqwefG", "asfgsd", 89),
                new Person("ASghhFG", "asfdsfg", 16),
                new Person("ASweFG", "asfzxbg", 23)
        ));
        list.forEach(System.out::println); // wypisanie jedno pod drugim
        System.out.println(); // jedna linia przerwy
        Collections.sort(list); // w przypaku comparable nie jest wymagany comparator

        list.forEach(System.out::println); //  wypisanie jedno pod drugim
        System.out.println(); //jedna linia przerwy


        List<SaleOffer> list1 = new ArrayList<>();

        list1.add(new SaleOffer("kompot", 2.1));
        list1.add(new SaleOffer("kompsdfot", 7.2));
        list1.add(new SaleOffer("kompoqwert", 2.5));
        list1.add(new SaleOffer("ksdfompot", 3.6));

        Scanner scan = new Scanner(System.in);

        String komenda;
        do {
            System.out.println("Podaj komendę : ");
            komenda = scan.nextLine();
            if (komenda.equalsIgnoreCase("listuj")) {
                list.forEach(System.out::println);
                System.out.println();
            } else if (komenda.equalsIgnoreCase("sortuj malejąco")) {
                Collections.sort(list1, new Comperator(true));
            } else if (komenda.equalsIgnoreCase("sortuj rosnąco")) {
                Collections.sort(list1, new Comperator(false));
            } else if (komenda.startsWith("dodaj")) {

                String[] slowa = komenda.split(" ");
                String productName = slowa[1];
                Double price = Double.parseDouble(slowa[2]);

                SaleOffer saleOffer = new SaleOffer(productName, price);
                list1.add(saleOffer);
                System.out.println("Dodano :" + saleOffer);


            } else if (!komenda.equalsIgnoreCase("quit")) {
                System.err.println("Nie rozpoznałem komendy");
            }
        } while (!komenda.equalsIgnoreCase("quit"));
    }
}
