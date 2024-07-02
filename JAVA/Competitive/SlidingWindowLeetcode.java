public class SlidingWindowLeetcode {

    //https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/?envType=daily-question&envId=2024-06-24

    // Q2. https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/?envType=daily-question&envId=2024-06-23
    // solve using Treemap or Dequeue
    class Solution {
        public int minKBitFlips(int[] nums, int k) {
            int state=0;
            int flips=0;
            boolean flag[]=new boolean[nums.length+1];
            for(int i=0;i<nums.length;i++){
            
                if(i-k>=0){
                     if(flag[i-k]==true)
                     {
                        state=1-state;
                        
                     }
                }
                 if(nums[i]==state){
                        if(i+k>nums.length)
                return -1;
                    flips++;state=1-state;
                    flag[i]=true;
                 }
            }
            return flips;
        }
    }    

    
}
