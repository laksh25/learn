public class AP9{
    public static void main(String[] args){
        //System.out.println("Enter Principal Amount, Rate and Time in the same order as mentioned: ");
        Financial_Calc obj= new Financial_Calc();
        obj.calc(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
    }
}

class Financial_Calc{
    void calc(double p, double r, double t){
        double SI=p*r*t;
        System.out.println("Simple Interest for specified data in (P*R*T) format is :"+SI);

        double CI=p*Math.pow(1+r,t); //n=1 (for yearly)
        System.out.println("Yearly Compound Interest is: "+CI);

        double v=p*Math.pow((1+r),t);
        System.out.println("Final Value of Investment is: "+v);
    }
}


