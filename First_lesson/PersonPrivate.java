public class PersonPrivate {
    private String name;
    private int age;
    private double height;
    private double weight;


    public PersonPrivate(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("height:" + height + "M");
        System.out.println("weight:" + weight + "KG");
    }

    public static void main(String[] args) {
        PersonPrivate p = new PersonPrivate("Kong Xien Voon", 24, 1.64, 52);
        p.displayDetails();
    }
}
