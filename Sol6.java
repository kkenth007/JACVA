package sol6;
import java.util.Scanner;
public class Sol6 {
    public static void main(String[] args) {
        double[] ia = new double[12];
        double sum=0,avg=0;
        Scanner kb = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.print("Enter number " +i+ " : ");
            ia[i]= kb.nextDouble();
            sum += ia[i];
            avg = sum/10;
        }
        System.out.println("Sum : " +sum+"\nAvg : " +avg);
    }   
}
