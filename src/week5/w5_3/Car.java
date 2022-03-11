package week5.w5_3;

public class Car {
    public Car(){
        Body body = new Body();
        Chassis chassis = new Chassis();
        Engine engine = new Engine();
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();
    }
    class Body {
        public Body() {
            System.out.println("Manufacturing: Body");
        }
    }
    class Chassis {
        public Chassis() {
            System.out.println("Manufacturing: Chassis");
        }
    }
    class Engine {
        public Engine() {
            System.out.println("Manufacturing: Engine");
        }
    }
    class Wheel {
        public Wheel() {
            System.out.println("Manufacturing: Wheel");
        }
    }
    public void printParts(){
        System.out.println("Car parts:");
        System.out.println("\tBody");
        System.out.println("\tChassis");
        System.out.println("\tEngine");
        System.out.println("\t4 Wheel");
    }
}
