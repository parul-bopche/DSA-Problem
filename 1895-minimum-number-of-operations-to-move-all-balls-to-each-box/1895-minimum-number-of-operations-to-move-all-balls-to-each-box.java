class Solution {
    public int[] minOperations(String boxes) {
      int[] arr = new int[boxes.length()];
     for (int i = 0; i < boxes.length(); i++){
    arr[i] = boxes.charAt(i) - '0';
     }
    ArrayList<Integer> res = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        int cnt = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==1){
                cnt =  cnt + Math.abs(j-i);
         }
        }
        res.add(cnt);
    }
       int[] result = new int[res.size()];
       for(int i=0;i<res.size();i++){
        result[i]= res.get(i);
       }
       return result;
    }
}