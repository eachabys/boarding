import java.util.ArrayList;
import java.util.*;

import java.util.HashMap; // import the HashMap class

public class strings {
    public static void main(String[] args){
        String s="10#11#12"; //jkab
        ArrayList<String> newl = new ArrayList<String>();
        HashMap<String, String> alpha = new HashMap<String, String>();
        alpha.put("1", "a");alpha.put("2", "b");alpha.put("3", "c");alpha.put("4", "d");
        alpha.put("5", "e");alpha.put("6", "f");alpha.put("7", "g");alpha.put("8", "h");
        alpha.put("9", "i");alpha.put("10", "j");alpha.put("11", "k");alpha.put("12", "l");
        String s1="";
        String s2="";
        String s3="";
        char m='a'; 
        int p=0;

        for (int i=s.length();i>0;i--){
            s1=s.substring(i-1,i);
            if (s1.equals("#")){
                s2=s.substring(i-3,i-1);

                s3=alpha.get(s2);
                
                newl.add(s3);
                i=i-2;
            }
            else{
                s3=alpha.get(s1);
                newl.add(s3);
            }
        }
        Collections.reverse(newl);
        s3 = String.join("", newl);
        System.out.println(s3);

        


        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> strings = new ArrayList<Integer>();
        nums.add(13);
        nums.add(3);
        nums.add(45);
        
        for (int i=0;i<nums.size();i++){
            if (nums.get(i)>9)
            {s=Integer.toString(nums.get(i));
                for (int j=0;j<s.length();j++){
                    m=s.charAt(j);
                    p=Integer.parseInt(String.valueOf(m));
                    strings.add(p);
                }
            
            }
            else{
                strings.add(nums.get(i));
            }

        
        }
        //System.out.println(strings);

    }
}
       