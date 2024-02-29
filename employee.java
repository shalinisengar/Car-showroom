package Car_showroom;

import java.util.Scanner;
import java.util.UUID;

public class employee extends showroom implements utility {

    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
@Override
    public void set_detail() {
        try (Scanner sc = new Scanner(System.in)) {
            UUID uuid = UUID.randomUUID();
            emp_id = String.valueOf(uuid);
            System.out.println("enter employee detail");
            System.out.println();
            System.out.println(" employee name");
            emp_name = sc.nextLine();
             System.out.println(" department");
            emp_department = sc.nextLine();
            System.out.println("employee age");
            emp_age = sc.nextInt();
           
        }

    }
@Override
    public void get_detail() {
        System.out.println("ID : " + emp_id);
        System.out.println("name : " + emp_name);
        System.out.println("age : " + emp_age);
        System.out.println("department : " + emp_department);
        System.out.println("showroom name : " + showroom_name);

    }
}
