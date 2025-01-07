package easy.problems;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMatchingInAnArray smia = new StringMatchingInAnArray();
		String[] words = {"mass","as","hero","superhero"};
		System.out.print(smia.stringMatching(words));
	}
	// Leetcode No. 1408
	// T.C : O(n2)  S.C : O(n)
	public List<String> stringMatching(String[] words) {
        String str = String.join(" ", words);
        List<String> res = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(str.indexOf(words[i]) != str.lastIndexOf(words[i])){
                res.add(words[i]);
            }
        }
        return res;
    }
}
