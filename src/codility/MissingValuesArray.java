package codility;

import java.util.ArrayList;
import java.util.List;

public class MissingValuesArray {

    public static void main(String[] ar){

        MissingValuesArray missingValuesArray = new MissingValuesArray();
        missingValuesArray.solution(new int[]{10,20,30});

    }

    private Integer[] solution(int[] A) {

        List<Integer> missingArrayList = new ArrayList<Integer>();

        for(int i=1;i<=A.length-1;i++){

            int k= A[i];
            int l= A[i-1];
            int sizeOfNewArray= k-l;
            for(int j=1;j<sizeOfNewArray;j++){
                if(l<k-1)
                l = l+1;
                missingArrayList.add(l);

            }
        }
        Integer[] missingArrayelem = new Integer[missingArrayList.size()];
         missingArrayList.toArray(missingArrayelem);
        for (Integer e:missingArrayelem) {
            System.out.print(e);
        }
        return missingArrayelem;
    }


}
