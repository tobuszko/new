import java.awt.*;

public class FourDPoint extends Point {

    int w;
    int z;


    public FourDPoint(int x, int y, int w, int z) {
        super(x, y);
        this.w = w;
        this.z = z;
    }

    public static void main(String[] args) {

        FourDPoint fourDPoint = new FourDPoint(10, 20, 30,40);
        System.out.println("Nowy czterowymiarowy punkt:");
        System.out.println("x wynosi:" + fourDPoint.x);
        System.out.println("y wynosi:" + fourDPoint.y);
        System.out.println("w wynosi:" + fourDPoint.w);
        System.out.println("z wynosi:" + fourDPoint.z);

    }




}
