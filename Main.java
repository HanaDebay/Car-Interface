import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FourDoorCar myCar = new FourDoorBMW("3 Series",2020,"Black",5000);
        FourDoorCar myCar1 = new FourDoorFord("Civic",2023,"Green",3000);
        TwoDoorCar myCar3 = new TwoDoorHyundai("Elentra",2024,"White","EP23$",2000);
        TwoDoorCar myCar4 = new TwoDoorToyota("Corolla",2024,"Green","C03SFK2",2500);
        System.out.println(myCar1.toString());
        System.out.println(myCar.toString());
        System.out.println(myCar4.toString());
        System.out.println(myCar3.toString());
        myCar.start();
        myCar1.repair();
        myCar3.stop();
        System.out.println();
        System.out.println("The Selling Price: "+myCar.sell(1000,50));
        Dealer dealer = new Dealer("Hana",2000);
        dealer.dealerMenu();
        ArrayList<Dealer> initialDealers = new ArrayList<>();
        initialDealers.add(new Dealer("Hana",2000));
        Dealers dealers = new Dealers(initialDealers);
        dealers.dealersMenu();

    }
}