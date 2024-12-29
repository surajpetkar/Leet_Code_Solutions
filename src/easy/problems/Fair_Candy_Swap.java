package easy.problems;

import java.util.HashSet;
import java.util.Set;

public class Fair_Candy_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fair_Candy_Swap fcs = new Fair_Candy_Swap();
		int[] alice = {1,1};
		int[] bob = {2,2};
		int[] arr = fcs.fairCandySwap(alice, bob);
		for(int i: arr) {
			System.err.println(i);
		}
	}
	// LeetCode No. 888
	// T.C : O(n+m)  &  S.C : O(n)
	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < aliceSizes.length; i++) {
            sumA += aliceSizes[i];
            setA.add(aliceSizes[i]);
        }
        for (int i = 0; i < bobSizes.length; i++)
            sumB += bobSizes[i];
        int dif = (sumA - sumB) / 2;
        for (int i = 0; i < bobSizes.length; i++) {
            int targetA = bobSizes[i] + dif;
            if (setA.contains(targetA))
                return new int[]{targetA, bobSizes[i]};
        }
        return null;
    }
}
