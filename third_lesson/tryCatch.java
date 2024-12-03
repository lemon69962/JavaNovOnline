import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        int number;
        int[][] matrix;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Please input number between 1-2: ");
            number = scan.nextInt();

            if (number == 1) {
                matrix = new int[3][4];  
                for (int z = 0; z < matrix.length; z++) {
                    for (int h = 0; h < matrix[z].length; h++) {
                        System.out.print("Please key in the number for row " + (z + 1) + " and column " + (h + 1) + ": ");
                        matrix[z][h] = scan.nextInt();
                    }
                }
                for (int z = 0; z < matrix.length; z++) {
                    for (int h = 0; h < matrix[z].length; h++) {
                        System.out.print(matrix[z][h] + "  ");
                    }
                    System.out.println();
                }
            } else if (number == 2) {
                matrix = new int[2][3];  
                
                
                for (int z = 0; z < 3; z++) { 
                    for (int h = 0; h < 4; h++) {  
                        System.out.print("Please key in the number for row " + (z + 1) + " and column " + (h + 1) + ": ");
                        matrix[z][h] = scan.nextInt();
                          
                    }
                }
                for (int z = 0; z < matrix.length; z++) {
                    for (int h = 0; h < matrix[z].length; h++) {
                        System.out.print(matrix[z][h] + "  ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid input. Please choose either 1 or 2.");
                
            }

            

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds! Please check your input. Details: " );
        }  finally {
            System.out.println("Nice to meet you!");
            scan.close();
        }
    }
}
