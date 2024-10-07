import java.util.Objects;

//Today's Goal:
//
//Car <Interface>
//-> FourDoorCar <Abstract Class>
//->->FourDoorToyota <Class>
//->->FourDoorBMW <Class>
//->->FourDoorFord<Class>
//->->FourDoorHyundai <Class>
//-> TwoDoorCar <Abstract Class>
//->->TwoDoorToyota <Class>
//->->TwoDoorBMW <Class>
//->->TwoDoorFord <Class>
//->->TwoDoorHyundai <Class>
//1- Create Car Interface:
//
//it should have run, stop, repair functions.
//###################################################
//- model
//- year
//- color
//- engineType ### TwoDoorCar
//- transmission
//- numberOfDoors (fixed to 4)
//- seatingCapacity
//##################################################
//Deadline 3.15pm
public interface Car {
    void start();
    void stop();
    void repair();
}
abstract class FourDoorCar implements Car{

        String model;
        int year;
        String color;
        public FourDoorCar(String model, int year, String color){
            this.model = model;
            this.color = color;
            this.year = year;

        }

    @Override
    public void start() {
        System.out.println("The Car driven");

    }

    @Override
    public void stop() {
        System.out.println("The car is stopped");
    }

    @Override
    public void repair() {
        System.out.println("The Car is repairing");
    }

    @Override
    public String toString() {
        return "FourDoorCar{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FourDoorCar that = (FourDoorCar) o;
        return year == that.year && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}
abstract class TwoDoorCar implements Car{
    String model;
    int year;
    String color;
    String enginType;
    int seatingCapacity;

    public TwoDoorCar(String model, int year, String color, String enginType, int seatingCapacity) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.enginType = enginType;
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public void start() {
        System.out.println("The Car has started");

    }

    @Override
    public void stop() {
        System.out.println("The car has stopped");
    }

    @Override
    public void repair() {
        System.out.println("The Car has repaired");
    }

    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", enginType='" + enginType + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoDoorCar that = (TwoDoorCar) o;
        return year == that.year && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}



class FourDoorToyota extends FourDoorCar{


    public FourDoorToyota(String model, int year, String color) {
        super(model, year, color);
    }

    @Override
    public String toString() {
        return "FourDoorToyota{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                "} " ;
    }
}
class FourDoorBMW extends FourDoorCar{

    public FourDoorBMW(String model, int year, String color) {
        super(model, year, color);
    }

    @Override
    public String toString() {
        return "FourDoorBMW{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                "} " ;
    }
}
class FourDoorFord extends FourDoorCar{

    public FourDoorFord(String model, int year, String color) {
        super(model, year, color);
    }

    @Override
    public String toString() {
        return "FourDoorFord{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                "} " ;
    }
}
class FourDoorHyundai extends FourDoorCar{

    public FourDoorHyundai(String model, int year, String color) {
        super(model, year, color);
    }

    @Override
    public String toString() {
        return "FourDoorHyundai{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                "} " ;
    }
}
class TwoDoorToyota extends TwoDoorCar{

    public TwoDoorToyota(String model, int year, String color, String enginType, int seatingCapacity) {
        super(model, year, color, enginType, seatingCapacity);
    }

    @Override
    public String toString() {
        return "TwoDoorToyota{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", enginType='" + enginType + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                "} " ;
    }
}
class TwoDoorBMW extends TwoDoorCar{

    public TwoDoorBMW(String model, int year, String color, String enginType, int seatingCapacity) {
        super(model, year, color, enginType, seatingCapacity);
    }

    @Override
    public String toString() {
        return "TwoDoorBMW{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", enginType='" + enginType + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                "} " ;
    }
}
class TwoDoorFord extends TwoDoorCar{

    public TwoDoorFord(String model, int year, String color, String enginType, int seatingCapacity) {
        super(model, year, color, enginType, seatingCapacity);
    }
}
class TwoDoorHyundai extends TwoDoorCar{

    public TwoDoorHyundai(String model, int year, String color, String enginType, int seatingCapacity) {
        super(model, year, color, enginType, seatingCapacity);
    }

    @Override
    public String toString() {
        return "TwoDoorHyundai{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", enginType='" + enginType + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                "} " ;
    }
}
