import java.util.ArrayList;

public class Item {

    private  String name;
    private  double price;

    public  String getName() {
        return name;
    }

    public  double getPrice() {
        return price;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static double getCheckoutPrice(ArrayList<Item> items, double taxPercentage) {

        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i).getPrice();
            System.out.println(items.get(i).getName());

        }


        total = total * (1 + taxPercentage);


        return total;

    }


}
