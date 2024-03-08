class Solution {
   public void rotate (int [] arr, int k){
       if(k>arr.length){
           k=k%arr.length;
       }
       int nums[]=new int[arr.length];
       for(int i=0;i<k;i++){
           nums[i]=arr[arr.length-k+i];
       }
       
       int j=0;
       for(int  i=k;i<arr.length;i++){
           nums[i]=arr[j];
           j++;
       }
       System.arraycopy(nums,0,arr,0,arr.length);
   }
}