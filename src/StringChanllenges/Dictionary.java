package StringChanllenges;

import java.util.*;
import java.util.stream.Collectors;

public class Dictionary {

    public Map<String, List<Dict>> processDictionary(String s) {

        HashMap<String, Dict> inputMap = new HashMap<>();
        String[] words = s.split(" ");
        List<String> list = new ArrayList<>();

        for (String element : words) {
            if (inputMap.containsKey(element)) {
                Dict temp = inputMap.get(element);
                temp.setTotal(temp.getTotal() + 1);
            } else {
                inputMap.put(element, new Dict(element));
            }
        }
        return getwordCount(inputMap);
    }

    public Map<String, List<Dict>> getwordCount(HashMap<String, Dict> inputMap) {

        Map<String, List<Dict>> result =
                inputMap.values().
                        stream()
                        .collect(Collectors.groupingBy(Dict::getWord));
        System.out.println(result.toString());
        return result;
    }

}




class DictionaryMainDriver {

    public static void main(String[] args){
        Dictionary d = new Dictionary();
        Map<String,List<Dict>> result =
                d.processDictionary("Hi Hi sandeep sandeep Hello Hi hi sandeep san the the why why how come communi should be dis way much less and they are able to");
        //d.getwordCount(result);

    }




}

