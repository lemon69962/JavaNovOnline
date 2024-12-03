import java.util.Scanner;
public class encapsulation {
    
    private String name;
    private int age;
    private double height,weight;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public double getBMI(double height,double weight){
        double bmi = weight/((height/100)*(height/100));
        return bmi;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        encapsulation ep = new encapsulation();
        System.out.print("Please key in the name: ");
        String name = scan.nextLine();
        System.out.print("Please key in the age: ");
        int age = scan.nextInt();
        System.out.print("Please key in the height(cm): ");
        double height = scan.nextDouble();
        System.out.print("Please key in the weight(kg): ");
        double weight = scan.nextDouble();
        ep.setName(name);
        ep.setAge(age);
        double bmi = ep.getBMI(height, weight);
        System.out.println("The person name is "+ name +" and he/she is "+ age+" years old and he/she bmi is "+ bmi+".");

    }

}
