class Solution {
    public int[] singleNumber(int[] nums) {
       int XOR = 0;
       for(int num:nums){
        XOR^= num;
       } 
       int rightMostSetBit = XOR&(-XOR);
       int num1 =0 ; int num2 = 0;
       for(int num : nums){
        if((num & rightMostSetBit)==0){
            num1^=num;
        }else{
            num2^=num;
        }
       }
       return new int[]{num1,num2};
    }
}