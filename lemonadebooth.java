import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class lemonadebooth{
    public static void main(String[] args){
        int[] bills= new int[] {5,5,10,10,20};//{5,5,5,10,20};
        boolean checkout1=checkout(bills);
        System.out.println(checkout1);
    }
    public static boolean checkout(int[] bills){
        List<Integer> change = new ArrayList<>();
        //System.out.println(Arrays.toString(bills));
        //System.out.println(change);
        for (int i=0;i<bills.length;i++){
            //System.out.println(bills[i]);
            if (bills[i]==5){
                change.add(5);
            }
            if (bills[i]==10){
                if (change.contains(5)){
                    change.add(10);
                    change.remove(Integer.valueOf(5));
                }
                else{
                    return false;
                }
            }

            if (bills[i]==20){
                if (change.contains(5)){
                    change.remove(Integer.valueOf(5));
                    if(change.contains(10)){
                        change.remove(Integer.valueOf(5));
                        change.add(20); }                   
                    else{
                        System.out.println(change);
                        if (change.contains(5)){
                            change.remove(Integer.valueOf(5));
                            if (change.contains(5)){
                                change.remove(Integer.valueOf(5));
                                change.add(20);
                            }
                            else{
                                return false;
                            }
                        }
                        else{
                            return false;
                        }
                        }                   
                }
                else{
                    //since no bill $5 and we need a change of $15 for which we need at least 1 bill of $5
                    return false;
                }
            }
        }
        return true;

    }
}