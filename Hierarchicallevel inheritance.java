import java.util.*;
 class parent{
    public void display1(){
    System.out.println("Hello");
    }
}
 class child1 extends parent{
    public void display2(){
    System.out.println("Hello divya");
    }
}
class child2 extends parent{
    public void display3(){
    System.out.println("Hello bharathi");
    }
}

public class Main{
    public static void main(String[]args){
        child2 obj = new child2();
        obj.display1();
        
        obj.display3();
        
    }
}
