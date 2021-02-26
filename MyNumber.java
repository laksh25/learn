import java.util.Scanner;
public class MyNumber {
    void numConversion(){
        Scanner s= new Scanner(System.in);
        System.out.println("****Enter any decimal number*****");
        Double num= s.nextDouble();
        String snum= num.toString();
        String deci="";
        int dec,round=0;
        for(int i=0; i<snum.length();i++){
            if(snum.charAt(i)=='.'){
                deci=snum.substring(i+1,i+2); //Lakshay AA2 
                dec=Integer.parseInt(deci);
                if(dec>=5){
                    round=Integer.parseInt(snum.substring(0,i))+1;
                }
                else{
                    round=Integer.parseInt(snum.substring(0,i));
                }
            }
        }
        System.out.println("Round value of: "+num+"--->"+round);
        double numd=num;
        int numInteger=(int)numd;
        System.out.println();
        System.out.println("Floor value of: "+num+"--->"+numInteger);
        numInteger=(int)numd+1;
        System.out.println();
        System.out.println("Ceiling value of: "+num+"--->"+numInteger);
        s.close();
    }
    public static void main(String[] args) {
        MyNumber obj= new MyNumber();
        obj.numConversion();
    }
}



