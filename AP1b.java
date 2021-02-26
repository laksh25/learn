public class AP1b {
    public static void main(String[] args){
       
        Cmd_Add c= new Cmd_Add();
        c.add(Integer.parseInt(args[0]),Integer.parseInt(args[1]),
        Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]));
    }    
}
class Cmd_Add{
    void add(int a, int b,int c,int d,int e){
        System.out.println(a+b+c+d+e);
        
    }
}


