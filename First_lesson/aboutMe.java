public class aboutMe {


    public void info(){
        String name = "Kong Xien Voon";
        int age = 24;
        System.out.println("My name is  " + name);
        System.out.println("I am " + age + " years old");
    }
    
    public void info2(){
        double height = 1.64;
        boolean isStudent = true;
        long netWorth = 250000000L;
    
            
        System.out.println("I am " + height + "m tall");
        System.out.println("I am a student: " + isStudent);
        System.out.println("My net worth is RM" + netWorth);

    }

     public static void main(String[] args) {
        aboutMe hi = new aboutMe();
        hi.info();
        hi.info2();  
            
    
    
     }
    
}
