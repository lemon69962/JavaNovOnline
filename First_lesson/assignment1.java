public class assignment1 {
    private String carName;
    private int carYear;
    private double carPrice;

    public assignment1(String carName, int carYear, double carPrice){
        this.carName = carName;
        this.carYear = carYear;
        this.carPrice = carPrice;
    }
    public void displayDetails(){
        double calPrice = carPrice * carYear;
        System.out.println("Car Name: " + carName);
        System.out.println("Car Year: " + carYear);
        System.out.println("Car Price: RM" + carPrice);
        System.out.println("Calculation Price: RM" + calPrice);
    }
    public static void main(String[] args) {
        assignment1 p = new assignment1("Toyota", 2021, 100000);
        p.displayDetails();
    }

}
