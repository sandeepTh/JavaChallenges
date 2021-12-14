package codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingInteger {

    public static void main(String[] args){

        MissingInteger missingInteger = new MissingInteger();
       System.out.println(missingInteger.solution(new int[] {6,7}));
    }


    public int solution(int[] A) {

        List<Integer> nums = new ArrayList<>();

        for(int i=2;i<=A.length+1;i++){
            nums.add(i);
        }

        for (int a:A) {
            nums.remove(new Integer(a));
        }

        return nums.iterator().next();
    }
}
