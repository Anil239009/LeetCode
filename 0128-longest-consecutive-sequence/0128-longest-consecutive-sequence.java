class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int max_Length=1;
        int prev_element=nums[0];
        int length=1;
        for(int i=0; i<nums.length;i++){
            if(prev_element==nums[i]){
                continue;
            }
            if(nums[i]==(prev_element+1)){
                length++;
            }else{
                length=1;
            }
            prev_element=nums[i];
            max_Length=Math.max(max_Length,length);
        }
        return max_Length;
    }
}