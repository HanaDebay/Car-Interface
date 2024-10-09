import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public interface Car {
    void start();
    void stop();
    void repair();
    double sell(double mileage, double power);
}

abstract class FourDoorCar implements Car {
    String model;
    int year;
    String color;
    double basePrice;

    public FourDoorCar(String model, int year, String color, double basePrice) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.basePrice = basePrice;
    }

    @Override
    public double sell(double mileage, double power) {
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - year;
        double depreciationValue = (basePrice * 0.15 * age) + (mileage * 0.01) - (power * 0.1);
        return Math.max(0, basePrice - depreciationValue);
    }

    @Override
    public void start() {
        System.out.println(model + " has started.");
    }

    @Override
    public void stop() {
        System.out.println(model + " has stopped.");
    }

    @Override
    public void repair() {
        System.out.println(model + " is being repaired.");
    }

    @Override
    public String toString() {
        return "FourDoorCar{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}

class FourDoorToyota extends FourDoorCar {
    public FourDoorToyota(String model, int year, String color, double basePrice) {
        super(model, year, color, basePrice);
    }

    @Override
    public String toString() {
        return "FourDoorToyota{" + super.toString() + '}';
    }
}

class FourDoorBMW extends FourDoorCar {
    public FourDoorBMW(String model, int year, String color, double basePrice) {
        super(model, year, color, basePrice);
    }

    @Override
    public String toString() {
        return "FourDoorBMW{" + super.toString() + '}';
    }
}

class FourDoorFord extends FourDoorCar {
    public FourDoorFord(String model, int year, String color, double basePrice) {
        super(model, year, color, basePrice);
    }

    @Override
    public String toString() {
        return "FourDoorFord{" + super.toString() + '}';
    }
}

class FourDoorHyundai extends FourDoorCar {
    public FourDoorHyundai(String model, int year, String color, double basePrice) {
        super(model, year, color, basePrice);
    }

    @Override
    public String toString() {
        return "FourDoorHyundai{" + super.toString() + '}';
    }
}

abstract class TwoDoorCar implements Car {
    String model;
    int year;
    String color;
    String engineType;
    double basePrice;

    public TwoDoorCar(String model, int year, String color, String engineType, double basePrice) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineType = engineType;
        this.basePrice = basePrice;
    }

    @Override
    public double sell(double mileage, double power) {
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - year;
        double depreciationValue = (basePrice * 0.15 * age) + (mileage * 0.01) - (power * 0.1);
        return Math.max(0, basePrice - depreciationValue);
    }

    @Override
    public void start() {
        System.out.println(model + " has started.");
    }

    @Override
    public void stop() {
        System.out.println(model + " has stopped.");
    }

    @Override
    public void repair() {
        System.out.println(model + " is being repaired.");
    }

    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}

class TwoDoorToyota extends TwoDoorCar {
    public TwoDoorToyota(String model, int year, String color, String engineType, double basePrice) {
        super(model, year, color, engineType, basePrice);
    }

    @Override
    public String toString() {
        return "TwoDoorToyota{" + super.toString() + '}';
    }
}

class TwoDoorBMW extends TwoDoorCar {
    public TwoDoorBMW(String model, int year, String color, String engineType, double basePrice) {
        super(model, year, color, engineType, basePrice);
    }

    @Override
    public String toString() {
        return "TwoDoorBMW{" + super.toString() + '}';
    }
}

class TwoDoorFord extends TwoDoorCar {
    public TwoDoorFord(String model, int year, String color, String engineType, double basePrice) {
        super(model, year, color, engineType, basePrice);
    }

    @Override
    public String toString() {
        return "TwoDoorFord{" + super.toString() + '}';
    }
}

class TwoDoorHyundai extends TwoDoorCar {
    public TwoDoorHyundai(String model, int year, String color, String engineType, double basePrice) {
        super(model, year, color, engineType, basePrice);
    }

    @Override
    public String toString() {
        return "TwoDoorHyundai{" + super.toString() + '}';
    }
}

class Dealer {
    private String name;
    private double money;
    private List<Car> cars;

    public Dealer(String name, double money) {
        this.name = name;
        this.money = money;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCar(Car car) {
        cars.add(car);
        System.out.println(car + " added to the dealer.");
    }
    public void showCars() {

        if (cars.isEmpty()) {
            System.out.println("No cars available.");
        } else {
            for (int i = 0; i < cars.size(); i++) {
                System.out.println("Cars available at " + name + ":");
                System.out.println(cars.get(i));
            }
        }
    }


    public void sellCar(int index, double mileage, double power) {
        if (index >= 0 && index < cars.size()) {
            Car car = cars.get(index);
            double sellingPrice = car.sell(mileage, power);
            if (sellingPrice <= money) {
                money -= sellingPrice;
                cars.remove(index);
                System.out.println("Car sold for $" + sellingPrice + ". Remaining money: $" + money);
            } else {
                System.out.println("Not enough money to buy this car.");
            }
        } else {
            System.out.println("Invalid car index.");
        }
    }

    public void dealerMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nDealer Menu:");
            System.out.println("1. Show Cars");
            System.out.println("2. Add Car");
            System.out.println("3. Sell Car");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showCars();
                    break;
                case 2:
                    // Example for adding a car
                    System.out.print("Enter model: ");
                    String model = scanner.next();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter color: ");
                    String color = scanner.next();
                    System.out.print("Enter base price: ");
                    double basePrice = scanner.nextDouble();
                    addCar(new FourDoorToyota(model, year, color, basePrice));
                    break;
                case 3:
                    showCars();
                    System.out.print("Select car index to sell: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter mileage: ");
                    double mileage = scanner.nextDouble();
                    System.out.print("Enter power: ");
                    double power = scanner.nextDouble();
                    sellCar(index, mileage, power);
                    break;
                case 4:
                    System.out.println("Exiting dealer menu.");
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}
//2- Create Dealers class and store Dealer arraylist  in it.
// also there should be dealersMenu() function to run program
//
//When I run program I should see an options to see existing dealers or create new dealers.
// in the Dealer class we already have menu function so when I select existing dealer
// I need to go in that dealer and work on with that menu.
// if I exit O should be able to return main Dealers class menu and able to select
// from the menu again existing dealers create new dealer.
class Dealers {
    ArrayList<Dealer> dealersList;
    public Dealers(ArrayList<Dealer> dealersList){
        this.dealersList = new ArrayList<>();
    }
    public void dealersMenu(){
        Scanner scanner = new Scanner(System.in);
        String options;

        do{
            System.out.println("Dealers Menu");
            System.out.println("============");
            System.out.println("1. View Existing Dealers");
            System.out.println("2. Create New Dealer");
            System.out.println("3. Exit");
            options = scanner.nextLine();
            switch (options){
                case "1":
                    viewExistingDealers();
                    break;
                case "2":
                    createNewDealer();
                    break;
                case "3":
                    System.out.println("Exiting . . .");
                    break;
                default:
                    System.out.println("Invalid Choice, Please try again");
            }
        }while (!options.equals("3"));
    }
    private void viewExistingDealers() {
        if (dealersList.isEmpty()) {
            System.out.println("No existing dealers.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dealersList.size(); i++) {
          System.out.println((i + 1) + ". " + dealersList.get(i).getName());
        }
        System.out.println("Select a dealer to view its menu or enter 0 to return:");

        int dealerChoice = Integer.parseInt(scanner.nextLine());
        if (dealerChoice > 0 && dealerChoice <= dealersList.size()) {
            dealersList.get(dealerChoice - 1).dealerMenu();
        } else {
            System.out.println("Returning to main menu...");
        }
    }

    private void createNewDealer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Dealer Name:");
        String dealerName = scanner.nextLine();
        System.out.println("Dealer " + dealerName + " created successfully.");
    }

}




