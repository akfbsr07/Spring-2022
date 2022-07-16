package day20;

public class VehiclesRunner {

    public static void main(String[] args) {

        Vehicles v1 = new Vehicles("Honda", "Civic", 2021, 130000);
        Vehicles v2 = new Vehicles("Audi","Rs",2022,50000);
        Vehicles v3 = new Vehicles("Mercedes","C300",2020);
        Vehicles v4 = new Vehicles("BMW","M5", 150000.0);
        Vehicles v5 = new Vehicles();

        System.out.println(v1.model);
        System.out.println(v2.make);
        System.out.println(v3.year);
        System.out.println(v4.price);
        System.out.println(v5.year);
        System.out.println(v5.make);
    }

}
