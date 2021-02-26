import java.util.Scanner;
public class AP2 {
    public static void main(String[] args){
        System.out.println("Enter the number till where you want to find sum of reciprocals: ");
        Scanner s= new Scanner(System.in);
        double n= s.nextDouble();
        double sum=0;
        for(double i=1; i<=n;i++){
            sum=sum+1/i;
        }
        System.out.print("Sum of: ");
        double i=1;
        while(i<n){
        System.out.print("1/"+(int)i+ "+ ");
        i++;
        }
        if(i==n){
            System.out.print("1/"+(int)i+"= ");
        }
        System.out.println(sum);
        s.close();
    }
    
}
