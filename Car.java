package Car_showroom;

import java.util.Scanner;

public class Car extends showroom implements utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void set_detail(){
        System.out.println("Enter car details");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println();
            System.out.print("CAR NAME: ");
            car_name = sc.nextLine();
            System.out.print(("CAR COLOR: "));
            car_color = sc.nextLine();
            System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
            car_fuel_type = sc.nextLine();            
            sc.nextLine();
            System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
            car_type = sc.nextLine();
            System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
            car_transmission = sc.nextLine(); 
            System.out.print("CAR PRICE: ");
            car_price = sc.nextInt();
            totel_stock_cars++;
        }
       


    }
    @Override
    public void get_detail(){
        System.out.println("NAME: "+car_name);
        System.out.println("COLOR: "+car_color);
        System.out.println("FUEL TYPE: "+car_fuel_type);
        System.out.println("PRICE: "+car_price);
        System.out.println("CAR TYPE: "+car_type);
        System.out.println("TRANSMISSION: "+car_transmission);
    }
}
