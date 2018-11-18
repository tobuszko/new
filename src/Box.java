import java.awt.*;

public class Box {

    int x1 =0, y1=0, x2=0, y2=0;


    Box  (int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;

    }

    Box  (Point topLeft, Point bottomRight){
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
    }


    Box  (Point topLeft, int w, int h){
        this(topLeft.x, topLeft.y, topLeft.x + w, topLeft.y + h);
    }

    void printBox () {
        System.out.println("Box: <" + x1 + "," + y1 + " ,  " + x2 + "," + y2 + ">");
    }



    public static void main(String[] args) {


        Box rect = new Box(25,25,50,50);
        System.out.println("Wywołanie  buildBox z współrzędnymi rect.buildBox(25,25) i (50,50");
        //rect.buildBox(25,25,50, 50);
        rect.printBox();

        System.out.println("Wywołanie  buildBox z punktami rect.buildBox(10,10) i (20,20");
        Box rect1 = new Box(new Point(10, 10), new Point(20, 20));
        //rect.buildBox(new Point(10, 10), new Point(20, 20));
        rect1.printBox();

        System.out.println("Wywołanie  buildBox z punktamem rect.buildBox(10,10) i szerokością 50 oraz wykokosćią 50");
        //rect.buildBox(new Point(10, 10), 50, 50);
        Box rect2 = new Box(new Point(10, 10), 50, 50);
        rect2.printBox();

    }
}
