package second_lesson;
import java.util.Scanner;

public class assignment_2 {
    private String carName;
    private String carModel;
    private double carPrice;

    public assignment_2(String carName, String carModel, double carPrice) {
        this.carName = carName;
        this.carModel = carModel;
        this.carPrice = carPrice;
    }

    
    public void displayDetails() {
        System.out.println("Car Name: " + carName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Price: RM" + carPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        assignment_2[] cars = new assignment_2[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Car Name: ");
            String carName = sc.nextLine();

            System.out.println("Enter Car Model: ");
            String carModel = sc.nextLine();

            System.out.println("Enter Car Price: ");
            double carPrice = sc.nextDouble();
            sc.nextLine(); 

            
            cars[i] = new assignment_2(carName, carModel, carPrice);
        }

        
        for (int i = 0; i < 3; i++) {
            System.out.println("Car " + (i + 1) + " Details:");
            cars[i].displayDetails();
            System.out.println();
        }

        sc.close();
    }
}
