import java.util.Scanner;
public class AP5 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 3 digits (0-9) you want to find permutaions of..:" +"\n"+
                           "(for any multidigit number, its unit digit will be considered) ");
        Integer n1=s.nextInt();
        Integer n2=s.nextInt();
        Integer n3=s.nextInt();
        // Safety Measure:
        // To make sure we are working with single digit,
        // only unit digit of user's enter number is considered.
        n1=n1%10;
        n2=n2%10;
        n3=n3%10;
        //Lakshay AP5 
        String no1=n1.toString();
        String no2=n2.toString();
        String no3=n3.toString();
        System.out.println("Printing all permutations Of " +no1+ " "+ no2 + " "+ no3+ " " +".....");
        String[] arr={no1,no2,no3};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){
                        if((arr[i]==arr[j]) || (arr[j]==arr[k]) || (arr[i]==arr[k])){
                                continue;
                        }
                        System.out.println(arr[i]+arr[j]+arr[k]);        
                }
            }
        }
        s.close();
    }
}


