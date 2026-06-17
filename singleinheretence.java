import java.util.*;
 class parent{
    public void display(){
    System.out.println("Hello");
    }
}
 class child extends parent{
    public void display2(){
    System.out.println("Hello divya");
    }
}
public class Main{
    public static void main(String[]args){
        child obj = new child();
        obj.display();
        obj.display2();
    }
}
