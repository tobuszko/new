package Lab4;

public class ClassHierarchy {

    public static void main(String[] args) {
       /* System.out.println("Konstruktor dla A");
        new A();

        System.out.println("Konstruktor dla B");
        new B();

        System.out.println("Konstruktor dla C");
        new C();

        System.out.println("___________________________________");


        System.out.println("Konstruktor dla A z true");
        new A(true);

        System.out.println("Konstruktor dla B z true");
        new B(true );

        System.out.println("Konstruktor dla C z true");
        new C(true);


        System.out.println("___________________________________");

        System.out.println("Konstruktor dla A z false");
        new A(false);

        System.out.println("Konstruktor dla B z false");
        new B(false );
*/
       // System.out.println("Konstruktor dla C z false");
        new C();



    }
}



    class A {

        A(){
            System.out.println("Jestem egzemlarzem klasy A" );
        }

        A(boolean a) {
            if (a == false){
                System.out.println("Jestem egzemlarzem klasy: " + this.getClass().getName());
            }
        }


    }

    class B extends A {
        B(){
            System.out.println("Jestem egzemlarzem klasy B");
        }

        B(boolean a){
            super(a);
        }
    }

    class C extends B {
        C(){
            System.out.println("Jestem egzemlarzem klasy C");
        }

        C(boolean a){
            super(a);
        }

    }



