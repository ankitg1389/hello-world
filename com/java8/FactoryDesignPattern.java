import java.util.Objects;

abstract class Vehicle{
    abstract int getWheel();
    public String toString(){
        return "No of wheels: " + this.getWheel();
    }
}

class Car extends Vehicle {
    int wheel;
    Car(int wheel) {
        this.wheel = wheel;
    }
    @Override
    int getWheel() {
        return this.wheel;
    }
}

class Bike extends Vehicle {
    int wheel;
    Bike(int wheel) {
        this.wheel = wheel;
    }
    @Override
    int getWheel() {
        return this.wheel;
    }
}

class VehicleFactory{
    public static Vehicle getInstance(String type, int wheel){
        if (Objects.equals(type, "car")) {
            return new Car(wheel);
        } else if (Objects.equals(type, "bike")) {
            return new Bike(wheel);
        }
        return null;
    }
}

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);
        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        System.out.println(bike);
    }
}
