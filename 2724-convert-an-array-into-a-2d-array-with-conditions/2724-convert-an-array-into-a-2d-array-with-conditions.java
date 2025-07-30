class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] freq = new int[201]; 
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums) {
            int rowIndex = freq[num]; 

            
            if (result.size() <= rowIndex) {
                result.add(new ArrayList<>());
            }

           
            result.get(rowIndex).add(num);

           
            freq[num]++;
        }

        return result;
    }
}
