import java.util.Scanner;
public class switch_2 {
    public static void main(String[] args) {
        int number;
        int j=3;
        int i=3;
        int [][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input number between 1-2: ");
        number = scan.nextInt();
        switch(number){
            case 1:
                i=3;
                j=4;
                break;
            case 2:
                i=2;
                j=3;
                break;
            default:
                System.out.println("invalid! Please input number between 1-2");
                break;
        }
        matrix = new int[i][j];
        for (int z =0; z <matrix.length;z++){
            for(int h=0; h<matrix[z].length;h++ ){
                System.out.print("Please key in the number row "+(z+1) +" and column "+ (h+1)+":");
                matrix  [z][h]=scan.nextInt();
            }

        }

        for (int z =0; z <matrix.length;z++){
            for(int h=0; h<matrix[z].length;h++ ){
                System.out.print(matrix  [z][h]+"\t");
                
            }
            System.out.println("");
        }

    }
}
