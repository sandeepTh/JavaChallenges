package codility;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    public static void main(String[] args){
        BinaryGap binaryGap = new BinaryGap();
       System.out.println(binaryGap.solution(9 ));

    }

    public int solution(int A) {

        //1. COnvert it to Binary form
       String binaryValue = Integer.toBinaryString(A);


        int counter =0;
        int maxCounter =0;
        boolean started = false;

        for(int i=0;i<binaryValue.length();i++){
            String c = binaryValue.substring(i,i+1);
            //System.out.println(c);



            if(c.equals("1")){
                if(started){
                    if(counter>maxCounter){
                        maxCounter = counter;
                    }
                }
                counter=0;
                started =true;
            }
            if(c.equals("0")){
                    counter++;
            }
        }
        return maxCounter;

    }
}
