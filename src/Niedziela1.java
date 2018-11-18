import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Niedziela1 {


    public static void main(String[] args) {

        int [][][] array =  {

                {
                    {1,2,3},
                    {1,2},
                    {4,8,9}
                },
                {
                        {1,2}
                }

        };
        int a = array.length;
        System.out.println(a);
        System.out.print("Tablica: [");
        for (int i[][]: array){
            for (int j[]: i){
                System.out.println("");
                for (int k: j){
                    System.out.print(k + " ");
                }
            }
        }
        System.out.println("");
        System.out.println(" ]");



    }


}
