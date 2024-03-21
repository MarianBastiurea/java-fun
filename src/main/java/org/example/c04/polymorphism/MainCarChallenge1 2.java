package org.example.c04.polymorphism;

public class MainCarChallenge1 {
    public static void main(String[] args) {

        CarChallenge1 car1 = new CarChallenge1("2022 Blue Ferrari 296 GTS");
        runRace(car1);

        CarChallenge1 ferrari = new GasPoweredCar1("2022 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(ferrari);

        CarChallenge1 tesla = new ElectricCar("2022 Red Tesla Model 3",
                568, 75);
        runRace(tesla);

        CarChallenge1 ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale",
                16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(CarChallenge1 car1) {

        car1.startEngine();
        car1.drive();
    }
}
