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
class child2 extends child1{
    public void display3(){
    System.out.println("Hello bharathi");
    }
}
class child3 extends child2 {
    public void display4(){
    System.out.println("Hello ram  ");
    }
}
public class Main{
    public static void main(String[]args){
        child3 obj = new child3();
        obj.display1();
        obj.display2();
        obj.display3();
        obj.display4();
    }
}
