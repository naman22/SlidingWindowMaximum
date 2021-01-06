package oops;

public class vehicle {
    int wheels;
    vehicle(int wheels){
        this.wheels = wheels;
    }

    public static void main(String[] args) {
        vehicle car =new vehicle(4);
        System.out.println(car.wheels+" wheels");
    }
}
