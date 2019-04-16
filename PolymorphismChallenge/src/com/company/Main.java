package com.company;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders, boolean engine) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Starting the generic car's engine";
    }

    public String accelerate() {
        return "Accelerating the generic car";
    }

    public String brake() {
        return "Applying the generic car's brakes";
    }

    public String getName() {
        return name;
    }
}

class TeslaModelS extends Car {

    public TeslaModelS(String name, int cylinders, boolean engine) {
        super(name, cylinders, engine);
    }

    @Override
    public String startEngine() {
        return "Starting the electric motors!";
    }

    @Override
    public String accelerate() {
        return "Enabling ludicrous mode. Hold on!";
    }

    @Override
    public String brake() {
        return "Applying the regenerative brakes!";
    }


}

class VolkswagenGTI extends Car {

    public VolkswagenGTI(String name, int cylinders, boolean engine) {
        super(name, cylinders, engine);
    }

    @Override
    public String startEngine() {
        return "Starting the 4 cylinder turbo engine.";
    }

    @Override
    public String accelerate() {
        return "Accelerating! Let's spin up that turbo!";
    }

    @Override
    public String brake() {
        return "Putting those Brembo brakes to use!";
    }
}

class ToyotaPrius extends Car {

    public ToyotaPrius(String name, int cylinders, boolean engine) {
        super(name, cylinders, engine);
    }

    @Override
    public String startEngine() {
        return "Starting the hybrid engine";
    }

    @Override
    public String accelerate() {
        return "Accelerating! Don't worry, we won't be pulling many G's";
    }

    @Override
    public String brake() {
        return "Braking! Have no fear, we weren't moving very fast";
    }
}


public class Main {

    public static void main(String[] args) {

        TeslaModelS modelS = new TeslaModelS("Tesla Model S", 0, false);
        VolkswagenGTI gTI = new VolkswagenGTI("Volkswagen GTI", 4, true);
        ToyotaPrius prius = new ToyotaPrius("Toyota Prius", 4, true);

        System.out.println(modelS.getName() + "\n" + modelS.startEngine() + "\n" + modelS.accelerate() + "\n" + modelS.brake() + "\n");
        System.out.println(gTI.getName() + "\n" + gTI.startEngine() + "\n" + gTI.accelerate() + "\n" + gTI.brake() + "\n");
        System.out.println(prius.getName() + "\n" + prius.startEngine() + "\n" + prius.accelerate() + "\n" + prius.brake() + "\n");

    }
}
