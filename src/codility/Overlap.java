package codility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Overlap {

    public static void main(String[] args){

        Overlap overlap = new Overlap();
        List<Interval> Intervals = new ArrayList();
        Intervals.add(new Interval(3,8));
        Intervals.add(new Interval(2,6));
        Intervals.add(new Interval(1,3));
        overlap.solution(Intervals);
    }

    private void solution(List<Interval> intervals) {

        //sort the Intervals.
       List<Interval> sortedIntervals = intervals.stream().sorted(Comparator.comparing(Interval::getStart)).collect(Collectors.toList());
        List<Interval>  finalIntervals = new ArrayList<>();
       /* for (Interval in :sortedIntervals) {
            System.out.println(in);
        }*/
        // check the second element start is less than the fist interval end
        // if true then its overlapping

        for(int i=1;i<=sortedIntervals.size()-1;i++){
            if(sortedIntervals.get(i).getStart() < sortedIntervals.get(i-1).getEnd() ){
               finalIntervals.add(new Interval(sortedIntervals.get(i-1).getStart(),sortedIntervals.get(i).getEnd()));
            }
        }

        finalIntervals.stream().forEach(i->System.out.println(i));

    }
}

class Interval {

    private int start;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    private int end;


    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
