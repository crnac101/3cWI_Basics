package OO.Car;

import java.util.Scanner;


public class Car {

    public int fuelConsumption;
    public int fuelAmount;
    public int fuelVolume;
    public String brand;
    public String model;
    public String serialNumber;
    public String color;


    public Car(int fuelConsumption, int fuelAmount, int fuelVolume, String brand, String model, String serialNumber, String color) {
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.fuelVolume = fuelVolume;
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
    }


    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println(serialNumber + " Is currently diving");
    }

    public void brake() {
        String brake;
        brake = "I am breaking";
        System.out.println(brake);
    }


    public void honk() {
        System.out.println("Please enter the Amount of times you want to honk");
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();

        for (int amountOfRepetitions = 0; amountOfRepetitions < amount; amountOfRepetitions++) {
            System.out.println("Honk");
        }
    }

    public void getRemainingRange() {
        int remainingRange = this.fuelAmount / fuelConsumption;
        System.out.println("You have " + remainingRange * 100 + "km of Range remaining");
    }
//getters

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return Engine;
    }

    //setters

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
