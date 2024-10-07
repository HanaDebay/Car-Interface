public class Main {
    public static void main(String[] args) {
        FourDoorCar myCar = new FourDoorBMW("3 Series",2024,"Black");
        FourDoorCar myCar1 = new FourDoorFord("Civic",2023,"Green");
        TwoDoorCar myCar3 = new TwoDoorHyundai("Elentra",2024,"White","EP23$",6);
        TwoDoorCar myCar4 = new TwoDoorToyota("Corolla",2024,"Green","C03SFK2",4);
        System.out.println(myCar1.toString());
        System.out.println(myCar.toString());
        System.out.println(myCar4.toString());
        System.out.println(myCar3.toString());
        myCar.start();
        myCar1.repair();
        myCar3.stop();
        System.out.println();


    }
}
//Toyota
//1. Corolla (Sedan)
//2. RAV4 (SUV)
//BMW
//1. 3 Series (Sedan)
//2. X5 (SUV)
//Hyundai
//1. Elantra (Sedan)
//2. Santa Fe (SUV)
//Honda
//1. Civic (Sedan/Hatchback)
//2. CR-V (SUV)