class Solution {
    public int countElements(int[] nums) {
     int smaller = Integer.MAX_VALUE;
     int largest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }if(nums[i]<smaller){
                smaller=nums[i];
            }
        }
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]>smaller && nums[j]<largest){
                count++;
            }
        }
        return count;
    }
}