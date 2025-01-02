package easy.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsfromTwoSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UncommonWordsfromTwoSentences uwfts = new UncommonWordsfromTwoSentences();
		String[] str = uwfts.uncommonFromSentences(new String("this apple is sweet"), new String("this apple is sour"));
		for(String s: str) {
			System.err.println(s);
		}
	}
	// LeetCode No. 884
	// TN : O(n)  &  SC : O(n)
	public String[] uncommonFromSentences(String s1, String s2) {
        String hold = s1.concat(" "+s2);
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String s : hold.split(" ")){
            if(!map.containsKey(s))
                map.put(s,1);
            else
                map.replace(s,map.get(s)+1);
        }
        for (Map.Entry<String,Integer> mapElement : map.entrySet()) {
            if(mapElement.getValue() == 1)
                ans.add(mapElement.getKey());
        }
        return ans.toArray(new String[0]);
    }
}
