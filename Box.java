public class Box
{
    public static void main(String[] args){
        Box  b= new Box();

        
        System.out.println("Volume of first box is: ");
        b.volume(10,4,5);
        System.out.println("Volume of second box is: ");
        b.volume(15,10,6); 
    }
    void volume(int l, int b, int h){
        int Vol=l*b*h;
        System.out.println(Vol);
    }
    
}


