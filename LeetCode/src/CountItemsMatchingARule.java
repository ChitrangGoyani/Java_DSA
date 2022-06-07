import java.util.*;
import java.util.Enumeration;

// https://leetcode.com/problems/count-items-matching-a-rule/

// Dont use the items in main function, list input it wrong, but the countMatches function is correct

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> subitems = new ArrayList<>();
        subitems.add(0,"phone");
        subitems.add(1,"blue");
        subitems.add(2,"pixel");
        items.add(0,subitems);
        subitems.add(3,"computer");
        subitems.add(4,"silver");
        subitems.add(5,"lenovo");
//        items.add(1,subitems);
        System.out.println(subitems);
        System.out.println(items);
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int countMatches = 0;
        // we know that there are 3 identifiers,
        // type, color, name
        // so that would be 0,1,2
        // lets make a hashtable to map it
        Hashtable<Integer,String> checker = new Hashtable<Integer,String>();
        checker.put(0,"type");
        checker.put(1,"color");
        checker.put(2,"name");
        System.out.println(checker);
        Enumeration<Integer> e = checker.keys();
        int toCheckIndex = 0;
        while(e.hasMoreElements()){
            int key = e.nextElement();
            System.out.println(checker.get(key));
            if(checker.get(key).equals(ruleKey))
                toCheckIndex = key;
        }
        System.out.println(toCheckIndex);
        for(int i=0; i < items.size(); i++){
            List<String> subitems = items.get(i);
            if(subitems.get(toCheckIndex).equals(ruleValue))
                countMatches++;
        }
        return countMatches;
    }

}
