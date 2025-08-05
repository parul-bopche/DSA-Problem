class Solution {
    public int findClosest(int x, int y, int z) {
       int Person1 = Math.abs(x-z);
       int Person2 = Math.abs(y-z);
       if(Person1< Person2){
          return 1;
       }else if(Person1>Person2){
       return 2;
       }
       return 0;
    }
}