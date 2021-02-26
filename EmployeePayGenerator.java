import java.util.Scanner;

public class EmployeePayGenerator {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter no of working hours");
        double hrs= s.nextFloat();
        System.out.println("Enter base pay");
        double basePay=s.nextFloat();
        double pay=0;

        if(basePay<8){
            System.out.println("ERROR!! Base pay is too less!");
        }
        else if(hrs<40){
            pay=hrs*basePay;
            System.out.println("Your Total Pay is: "+ "$"+pay);

        }
        else if(hrs>40 && hrs<=60){
            pay=hrs*basePay +basePay*1.5;
            System.out.println("Your Total Pay is: "+ "$"+pay);

        }
        else if(hrs>60){
            System.out.println("Error!!! no of working hours is exceeded!");    
        }
        s.close();
    }
}

