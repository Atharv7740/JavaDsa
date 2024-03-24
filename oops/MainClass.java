package oops;

public class MainClass {
    public static void main(String[] args) {
        Complex x=new Complex();
        x.a=10;
        x.b=20;
        x.print();
    }
}

class Complex{
    int a,b;
    void print(){
        System.out.println(a +" + i" + b);

    }
}
