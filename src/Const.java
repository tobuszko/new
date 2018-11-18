public class Const {

    public static void main(String[] args) {
        new A();
        new A(true);

        new B();

    }
}


class A {

    A (){
        System.out.println("Działa konstrukor klasy Lab4.A");
    }

    A (boolean arg){
        System.out.println("Działa konstrukor klasy Lab4.A z argumentem: " + arg);
    }

}

class B extends A {

    B (){
        super(true);
        System.out.println("Działa konstrukor klasy Lab4.B");
    }

}



