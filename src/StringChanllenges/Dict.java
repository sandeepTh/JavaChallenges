package StringChanllenges;

import java.util.ArrayList;
import java.util.List;

public class Dict {
    private String word;
    private int total;
    private List list = new ArrayList();

    public Dict(String word) {
        this.word = word;;
        if(list.contains(word)){
            total = total+1;
        }else {
            list.add(word);
            total=1;
        }

    }

    public Dict(String word, int total, List list) {
        this.word = word;
        this.total = total;
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }



    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "word='" + word + '\'' +
                ", total=" + total +
                '}';
    }
}
