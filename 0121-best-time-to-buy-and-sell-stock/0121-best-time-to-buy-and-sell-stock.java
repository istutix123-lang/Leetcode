class Solution {
    public int maxProfit(int[] arr) {
        int smaller=arr[0];
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-smaller>profit){
                profit=arr[i]-smaller;
            }
            if(arr[i]<smaller){
                smaller=arr[i];
            }
        }
        return profit;

    }
}