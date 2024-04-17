class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length==0){
        //     return 0;
        // }
        // Arrays.sort(nums);
        // int max_Length=1;
        // int prev_element=nums[0];
        // int length=1;
        // for(int i=0; i<nums.length;i++){
        //     if(prev_element==nums[i]){
        //         continue;
        //     }
        //     if(nums[i]==(prev_element+1)){
        //         length++;
        //     }else{
        //         length=1;
        //     }
        //     prev_element=nums[i];
        //     max_Length=Math.max(max_Length,length);
        // }
        // return max_Length;
        
        int n=nums.length;
        if(n==0) return 0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0; i<n;i++){
            hs.add(nums[i]);
        }
        int max_length=1;
        for(Integer element:hs){
            int prev=element-1;
            if(!hs.contains(prev)){
                int length=1;
                int next=element+1;
                while(hs.contains(next)){
                    length++;
                    next++;
                }
                 max_length= Math.max(max_length,length);
            }
           
        }
        
        return max_length;
    }
}