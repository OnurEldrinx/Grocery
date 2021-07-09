import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        final double pearUnitPrice,appleUnitPrice,tomatoUnitPrice,bananaUnitPrice,eggplantUnitPrice;
        Scanner keyboard = new Scanner(System.in);

        // per kg
        pearUnitPrice = 2.14;
        appleUnitPrice = 3.67;
        tomatoUnitPrice = 1.11;
        bananaUnitPrice = 0.95;
        eggplantUnitPrice = 5.00;

        System.out.print("How many kilos of pears do you want: ");
        double pearWeight = keyboard.nextDouble();

        System.out.print("How many kilos of apples do you want: ");
        double appleWeight = keyboard.nextDouble();

        System.out.print("How many kilos of tomatoes do you want: ");
        double tomatoWeight = keyboard.nextDouble();

        System.out.print("How many kilos of bananas do you want: ");
        double bananaWeight = keyboard.nextDouble();

        System.out.print("How many kilos of eggplants do you want: ");
        double eggplantWeight = keyboard.nextDouble();

        double totalPrice = (pearUnitPrice * pearWeight) + (appleUnitPrice * appleWeight)
                          + (tomatoUnitPrice * tomatoWeight) + (bananaUnitPrice * bananaWeight) + (eggplantUnitPrice * eggplantWeight);


        System.out.println("********* SUMMARY *********");
        System.out.println("-> Pear     : " + pearWeight + " kg");
        System.out.println("-> Apple    : " + appleWeight + " kg");
        System.out.println("-> Tomato   : " + tomatoWeight + " kg");
        System.out.println("-> Banana   : " + bananaWeight + " kg");
        System.out.println("-> Eggplant : " + eggplantWeight + " kg");
        System.out.println("***************************");
        System.out.println("-> Total Payment : " + totalPrice + " $");
        System.out.println("***************************");




    }
}
