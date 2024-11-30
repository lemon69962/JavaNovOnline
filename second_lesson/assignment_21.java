package second_lesson;

import java.util.Scanner;

public class assignment_21 {

    private class carDetails{
        private String carName;
        private String carModel;
        private double carPrice;

        public carDetails(String carName, String carModel, double carPrice) {
            this.carName = carName;
            this.carModel = carModel;
            this.carPrice = carPrice;
        }

        public void displayDetails() {
            System.out.println("Car Name: " + carName);
            System.out.println("Car Model: " + carModel);
            System.out.println("Car Price: RM" + carPrice);
        }
    }
    private carDetails Details(Scanner sc){
        System.out.print("Enter Car Name: ");
        String carName = sc.nextLine();

        System.out.print("Enter Car Model: ");
        String carModel = sc.nextLine();

        System.out.print("Enter Car Price: ");
        double carPrice = sc.nextDouble();
        sc.nextLine(); 

        return new carDetails(carName, carModel, carPrice);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        assignment_21 obj = new assignment_21();
        carDetails car1 = obj.Details(sc);
        carDetails car2 = obj.Details(sc);
        carDetails car3 = obj.Details(sc);

        double averagePrice = (car1.carPrice + car2.carPrice + car3.carPrice) / 3;
        System.out.println("The average price of the cars is: RM" + averagePrice);
        String result = (averagePrice >=1000000) ? "The car is expensive" : (averagePrice >=50000 || averagePrice <=99999) ? "the cars are normal price" : "the cars are cheap";
    }

}
