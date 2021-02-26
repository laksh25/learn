import java.util.Scanner;
public class AP7{
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a sentence you want to reverse: ");
        String inp_String= s.nextLine();
        
        String[] str= inp_String.split(" ");
        String rev=""; 
        for(int i=0;i<str.length; i++) {
            for(int j=str[i].length()-1;j>=0;j--){
                
                rev=rev+str[i].charAt(j); 
            }
            rev=rev+" ";
            }
            String res= rev.substring(0,rev.length()-1);
            System.out.println(res);
            // System.out.println(inp_String.length());
            // System.out.println(res.length());
            
            
       s.close();
    }
}