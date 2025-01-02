package medium.problems;

public class CountVowelStringsInRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountVowelStringsInRanges cvsir = new CountVowelStringsInRanges();
		String[] words = {"aba","bcb","ece","aa","e"}; 
		int[][] queries = {{0,2},{1,4},{1,1}};
		for(int r : cvsir.vowelStrings(words, queries)) {
			System.out.print(r+" ");
		}
	}
	// LeetCode No. 2559
	// T.C : O(n)  &  S.C : O(n)
	public int[] vowelStrings(String[] words, int[][] queries) {
        int i=0, sum=0;
        int[] vwords = new int[words.length];
        int[] res = new int[queries.length];
        for(String s : words){
            int slen = s.length();
            if((s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') && (s.charAt(slen-1) == 'a' || s.charAt(slen-1) == 'e' || s.charAt(slen-1) == 'i' || s.charAt(slen-1) == 'o' || s.charAt(slen-1) == 'u')){
                sum++;
            }
            vwords[i++] = sum;
        }
        for (int j = 0; j < queries.length; j++) {
            int[] currentQuery = queries[j];
            res[j] =
                vwords[currentQuery[1]] -
                (currentQuery[0] == 0 ? 0 : vwords[currentQuery[0] - 1]);
        }
        return res;
	}
}
