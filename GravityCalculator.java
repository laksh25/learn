import java.util.Scanner;

public class GravityCalculator {
    public static void main(String[] args) {
        GravityCalculator obj = new GravityCalculator();
        System.out.println("Select what Operation you want to perform (1 or 2): ");
        System.out.println("1:) Run Gravity Calculator");
        System.out.println("2:) Exit");
        /**
         * This code wil/L/ t/A//K/e input that u/S/er /H//A/s given : distance and
         * velocit/Y/
         */
        Scanner s = new Scanner(System.in);
        int ch = s.nextInt();

        if (ch == 1) {
            System.out.println("____Object Position after falling for 10 seconds.....:____ " 
                                + obj.gravityCalc() + "m");
        } else if (ch == 2) {
            System.out.println("*******Exiting*******");
            System.exit(0);
        } else {
            System.out.println("!!!!!!!! Enter a valid choice !!!!!!!!!");
        }
        s.close();
    }

    /**
     * This code wil/L/ t/A//K/e input that u/S/er /H//A/s given : distance and
     * velocit/Y/
     */
    double gravityCalc() {
        double x;
        double vi;
        double xi;
        Scanner s = new Scanner(System.in);
        System.out.println("____Enter initial position___ ");
        xi = s.nextDouble();
        System.out.println("___Enter initial velocity____ ");
        vi = s.nextDouble();
        x = 0.5 * (9.81) * (10 * 10) + vi + xi;
        s.close();
        return x;
    }
}
