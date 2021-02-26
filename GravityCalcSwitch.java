import java.util.Scanner;
public class GravityCalcSwitch {
    public static void main(String[] args ){
        GravityCalcSwitch obj= new GravityCalcSwitch();
        obj.gravCalcSwitch();   
    }
    /** This code wil/L/ t/A//K/e input that u/S/er /H//A/s given : distance and velocit/Y/  */
    void gravCalcSwitch(){
        System.out.println("Select what Operation you want to perform (1 or 2): ");
        System.out.println("1:) Run Gravity Calculator");
        System.out.println("2:) Exit");
        Scanner s= new Scanner(System.in);
        int ch= s.nextInt();
    /** This code wil/L/ t/A//K/e input that u/S/er /H//A/s given : distance and velocit/Y/  */
        switch(ch){
            case 1: double x;
            double vi;
            double xi;
            Scanner s1= new Scanner(System.in);
            System.out.println("____Enter initial position___ ");
            xi= s1.nextDouble();
            System.out.println("___Enter initial velocity____ ");
            vi= s1.nextDouble();
            x=0.5*(9.81)*(10*10)+ vi+ xi;
            System.out.println("____Object Position after falling for 10 seconds.....:____ "+ x+ "m");
            break;

            case 2: System.out.println("*****Exiting******");
            System.exit(0);
            break;
            default: System.out.println("!!!!!!!Enter a valid choice!!!!!!!!");
        }
    /** This code wil/L/ t/A//K/e input that u/S/er /H//A/s given : distance and velocit/Y/  */
        s.close();
    }
}


