
import java.util.Scanner;
public class Jagged {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a size of row 1 of array: ");
        int row=scanner.nextInt();
        int number[][]=new int[row][];
        for (int i=0;i<number.length;i++){
            System.out.println("Enter a size of row "+(i+2)+" : ");
            int rows=scanner.nextInt();
            number[i]=new int[rows];
            System.out.println("Enter a elements of row "+(i+1)+" :");
            for (int j=0;j<number[i].length;j++){
                number[i][j]=scanner.nextInt();
            }
        }
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number[i].length;j++){
                System.out.print(number[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i=0;i<number.length;i++){
            int largestNUm=number[i][0];
            for (int j=0;j<number[i].length;j++){
                if(number[i][j]>largestNUm) {
                    largestNUm=number[i][j];
                }
            }
            System.out.println("Largest number of row "+(i+1)+" :"+largestNUm);
        }
    }
}