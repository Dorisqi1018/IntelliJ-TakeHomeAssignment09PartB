
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();


        boolean end = true;
        while (end) {
            System.out.print("Hello! What things did you buy? " );
            String name = in.next();
            System.out.print("What is the price of the thing? " );
            double price = in.nextDouble();

            Item p = new Item(name, price);
            items.add(p);

            System.out.println("Do you want to go on? (Please enter true or false.)");
            end = in.nextBoolean();

        }

        System.out.println("What is the tax percentage?");
        double taxPercentage = in.nextDouble();


        System.out.println("Hello! Your total price is " +
                Item.getCheckoutPrice(items, taxPercentage) + " dollars.");


    }
}
