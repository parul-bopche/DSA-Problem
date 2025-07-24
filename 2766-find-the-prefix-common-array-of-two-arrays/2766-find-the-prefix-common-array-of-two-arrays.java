class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        int n = A.length;
        int[] res = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] == B[i]) {
                if (!setA.contains(A[i])) {
                    count++;
                }
            } else {
                if (setB.contains(A[i])) {
                    count++;
                }
                if (setA.contains(B[i])) {
                    count++;
                }
            }

            setA.add(A[i]);
            setB.add(B[i]);
            res[i] = count;
        }

        return res;
    }
}
