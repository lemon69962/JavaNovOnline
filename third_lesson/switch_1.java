import java.util.*;

public class switch_1{
    public static void main(String[] args){
        int number;
        String day=null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a day number:");
        number=sc.nextInt();
        switch(number){
            case 1:
                day = "monday";
                break;
            
            case 2:
                day ="tuesday";
                break;

            case 3:
                day ="wednesday";
                break;

            case 4:
                day ="thursday";
                break;
            
            case 5:
                day ="friday";
                break;

            case 6:
                day ="saturday";
                break;

            case 7:
                day ="sunday";
                break;
            
            default:
                System.out.println("Please key in number between 1-7");
        }
        System.out.println("The day is "+ day);
    
    }
}