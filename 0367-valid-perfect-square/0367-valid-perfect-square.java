class Solution {
    public boolean isPerfectSquare(int num) {
         for(int i=-1;i<num;i++){
           if((long) i*i==num){
            return true;
           }  
         }
         return false;
    }
}