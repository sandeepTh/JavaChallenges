package codility;

public class SpootBeeker {


    public static void main(String[] args){
        SpootBeeker spootBeeker = new SpootBeeker();
        spootBeeker.solution(new int[]{2, 8, 1, 12});

    }
    public int solution(int[] A) {

        //add to the highest element in the array.
        int maxElement = 0;
        int secondMaxElement =0;

        int counter =0;
        for(int i=0;i<A.length;i++){
            counter = A[i];
            if(counter>maxElement){
                maxElement=counter;
            }
         //add to the adjacent Element in array staring from left-> right
            if(i>0){
                if(A[i-1]>0)
                if(A[i-1]>A[i]){


                }
                A[i+1]++;
                A[i]--;
                //get the Second highest element in the array
                // then add to the right or left.
                //check if left or right exists and if it does get the postion of maxElement.



            }




        }

        //System.out.println("MaxElemen"+maxElement);


        return 0;
    }
}
