
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class timeseries{
    public static void main(String[] args){
        int[] timestamps= new int[] {1,2,2,2,6,12,32,33,34,37};
        int requests=3;
        List<Boolean> response = new ArrayList<>();
        response.add(true);        
        List<Integer> temp = new ArrayList<>();
        temp.add(timestamps[0]);
        for (int i=1;i<timestamps.length;i++){
            //System.out.println(timestamps[i]);
            if (temp.size()<requests){
                response.add(true);
                temp.add(timestamps[i]);
            }
            else{
                if (temp.get(0)<(timestamps[i]-5+1)){
                    response.add(true);
                    temp.remove(0);
                    temp.add(timestamps[i]);
                }
                else{
                    response.add(false);
                    temp.remove(0);
                    temp.add(timestamps[i]);
                }
            }
        }
        System.out.println(response);
    }
}