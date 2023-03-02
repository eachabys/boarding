import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class lazydog {
    public static void main(String[] args){
        String input1="the quick brown ;!fox jumps over the lazy dog b";
        String s = "abcdefghijklmnopqrstuvwxyz";
        List<String> alphabet = new ArrayList<String>(Arrays.asList(s.split("")));       
        List<String> myinput = new ArrayList<String>(Arrays.asList(input1.split("")));
        Collections.sort(myinput);

        List<String> distinput=myinput.stream().distinct().collect(Collectors.toList());
     
        while(distinput.size()>26){
            distinput.remove(0);
        }
        //System.out.println(distinput);
        if (distinput.equals(alphabet)==true){
            System.out.println(true);
        }
        else{
            System.out.println(false);}
        

    }
    
}
