package codility;

public class BinaryGap_Java8 {

    public static void main(String[] args){
        BinaryGap_Java8 binaryGap = new BinaryGap_Java8();
       // binaryGap.solution(529);
        System.out.println(binaryGap.solution(529 ));

    }

    private int solution(Integer i) {
       String binaryString = Integer.toBinaryString(i);

       String[] binarySubString = binaryString.split(binaryString);
        String[] strArray = binaryString.split("1");


        int counter=0;
        int maxlength =0;

        for (int j=0;j<strArray.length;j++){
         counter = strArray[j].length();
        if(counter>maxlength){
            maxlength=counter;
        }

        }
        return maxlength;
    }
}
