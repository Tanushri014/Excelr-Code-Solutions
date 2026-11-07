package day6assignment;

public class Car2 {

    // Composition: Car owns its Engine
    private Engine engine;

    // Aggregation: Car receives an existing Driver
    private Driver driver;

    Car2(Driver driver) {

        // Engine object is created inside Car
        this.engine = new Engine();

        // Existing Driver object is passed from outside
        this.driver = driver;
    }

    public void showDetails() {

        engine.start();
        driver.drive();
    }
}