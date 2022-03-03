package academy.learnprogramming;

class Car {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;

    public Car(String name, int cylinder) {
        this.name = name;
        this.engine = true;
        this.cylinder = cylinder;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String StartEngine() {
        return " Car --> startEngine()";

    }

    public String Accelerate() {
        return " Car -> accelerate()";
    }
    public String Brake(){
        return "Car -> brake()";
    }

}

class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String StartEngine() {
        return " Mitsubishi --> startEngine()";
    }

    @Override
    public String Accelerate() {
        return " Mitsubishi --> Accelerate()";
    }

    @Override
    public String Brake() {
        return" Mitsubishi --> Brake()";
    }
}
class Holden extends Car{
    public Holden(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String StartEngine() {
        return getClass().getSimpleName() +"--> StartEngine()";
    }


    @Override
    public String Accelerate() {
        return getClass().getSimpleName()+ " --> Accelerate()";
    }

    @Override
    public String Brake() {
        return getClass().getSimpleName()+ " --> Brake()";
    }
}

 class Ford extends Car{
    public Ford(String name, int cylinder) {
        super(name, cylinder);
    }


    @Override
    public String StartEngine() {
        return " Ford --> startEngine()";
    }

    @Override
    public String Accelerate() {
        return " Ford --> Accelerate()";
    }

    @Override
    public String Brake() {
        return" Ford --> Brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car = new Car("Base Car", 8);
        System.out.println(car.StartEngine());
        System.out.println(car.Accelerate());
        System.out.println(car.Brake());

        Mitsubishi mitsubishi = new Mitsubishi("OutLander VRW 4WD",6);
        System.out.println(mitsubishi.StartEngine());
        System.out.println(mitsubishi.Accelerate());
        System.out.println(mitsubishi.Brake());

        Ford ford = new Ford("Ford Falcon",6);
        System.out.println(ford.StartEngine());
        System.out.println(ford.Accelerate());
        System.out.println(ford.Brake());

        Holden holden = new Holden("Holden Commodore",6);
        System.out.println(holden.StartEngine());
        System.out.println(holden.Accelerate());
        System.out.println(holden.Brake());


    }


}
