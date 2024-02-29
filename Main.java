package Car_showroom;

import java.util.Scanner;

interface utility {
    public void set_detail();

    public void get_detail();
}

public class Main {
    static void menu() {
        System.out.println();
        System.out.println("** Welcome to car showroom management system ** ");
        System.out.println();
        System.out.println("Enter your choice : ");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].VIEWS SHOWROOMS \t\t\t 5].VIEW EMPLOYEES \t\t\t 6].VIEW CARS");
        System.out.println();

    }

    public static void main(String args[]) {
        menu();
        try (Scanner sc = new Scanner(System.in)) {

            Car car[] = new Car[5];
            showroom show[] = new showroom[5];
            employee emp[] = new employee[5];
            int car_c = 0;
            int show_c =0;
            int emp_c =0;

            int choice = 100;
            while (choice != 0) {
                menu();
                 choice = sc.nextInt();
                while(choice!= 9&& choice!=0){
                switch (choice) {
                    case 1:
                    show[show_c] = new showroom();
                    show[show_c].set_detail();
                    show_c++;
                    System.out.println();
                    System.out.println("1].ADD NEW SHOWROOM");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    choice = sc.nextInt();
                        break;
                    case 2:
                        emp[emp_c] = new employee();
                        emp[emp_c].set_detail();
                        emp_c++;
                        System.out.println();
                        System.out.println("1].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();

                        break;
                    case 3:
                        car[car_c] = new Car();
                        car[car_c].set_detail();
                        car_c++;
                        System.out.println();
                        System.out.println("1].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for(int i=0;i<show_c;i++){
                            show[i].get_detail();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for(int i=0;i<emp_c;i++){
                            emp[i].get_detail();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for(int i=0;i<car_c;i++){
                            car[i].get_detail();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;

                    default:
                        System.out.println("enter valid choice");

                        break;
                }
            }
                
            }

        }

    }
}
