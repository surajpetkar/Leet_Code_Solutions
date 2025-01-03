package medium.problems;

public class numberOfWaysToSplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberOfWaysToSplitArray nowtsa = new numberOfWaysToSplitArray();
		int[] nums = {10,4,-8,7,2,3,1,0,1,1,1,2,3,10,4,-8};
		nowtsa.waysToSplitArray(nums);
	}
	// LeetCode No. 2270
	// TN : O(n)  &  SC : O(1)
	public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long sumTotal=0;
        long sumCurr=0;
        int cnt=0;

        for(int i=0; i<n; i++){
            sumTotal+=nums[i];
        }
        for(int i=0; i<n-1; i++){
            sumCurr+=nums[i];
            if(sumCurr >= sumTotal-sumCurr){
                cnt++;
            }
        }
        return cnt;
    }
}
