package Car_showroom;

import java.util.Scanner;

public class showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_number_employee;
    int totel_stock_cars;
    String manager_name;

    public void set_detail(){

        try (
            Scanner sc = new Scanner(System.in)) {
            System.out.println("enter showroom details");
System.out.println();
            System.out.println("showroom name :");
            showroom_name = sc.nextLine();
            System.out.println("showroom address : ");
            showroom_address = sc.nextLine();
            System.out.println("manager name : ");
            manager_name = sc.nextLine();
            System.out.println("total numbers of employee : ");
            total_number_employee = sc.nextInt();
            System.out.println("total cars in stock : ");
            totel_stock_cars = sc.nextInt();
           
        }
        }
    public void get_detail(){
        System.out.println("Showroom name : "+showroom_name);
        System.out.println();
        System.out.println("Showroom address : "+showroom_address);
        System.out.println();
        System.out.println("Total employee : "+total_number_employee);
        System.out.println();
        System.out.println("Total cars in stock : "+totel_stock_cars);
        System.out.println();
        System.out.println("manager name : "+manager_name);
        System.out.println();

    }
}
