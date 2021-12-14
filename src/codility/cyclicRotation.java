package codility;

public class cyclicRotation {

    public static void main(String[] args){
        cyclicRotation cr = new cyclicRotation();
        cr.solution(new int[]{3,5,9,6},3 );
    }

    private int[] solution(int[] A, int k) {

        for(int i=0; i<k;i++){
            int lastValue = A[A.length-1];

            for(int j=A.length-2;j>=0;j--){

                A[j+1]=A[j];
            }

            A[0]=lastValue;

        }
        return A;
    }
}
