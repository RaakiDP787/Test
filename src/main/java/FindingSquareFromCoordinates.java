import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

public class FindingSquareFromCoordinates {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] x = {20, 10, 20, 10};
        int[] y = {10, 20, 20, 10};

        double distance1 = sqrt(((x[0+1]-x[0])*(x[0+1]-x[0]))+((y[0+1]-y[0])*y[0+1]-y[0]));
        double distance2;
        int square;
        for (int i = 1; i < x.length;i++){
            distance2 = sqrt(((x[i+1]-x[i])*(x[i+1]-x[i]))+((y[i+1]-y[i])*y[i+1]-y[i]));
            if(distance2!=distance1){

            }

        }
    }
}
