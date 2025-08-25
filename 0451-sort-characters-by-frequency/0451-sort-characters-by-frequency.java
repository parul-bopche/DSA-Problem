class Solution {
    public String frequencySort(String s) {
        //sbse pehle to map bana de
        Map<Character,Integer> freq = new HashMap<>();
        for(char c: s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        //chal ab max heap bana kyuki decedinf
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a,b)->freq.get(b)-freq.get(a)
        );
        maxHeap.addAll(freq.keySet());

        //chal ab build kr result ko
          StringBuilder sb = new StringBuilder();
          while(!maxHeap.isEmpty()){
            char c = maxHeap.poll();
            int count = freq.get(c);
            for(int i=0;i<count;i++){
                sb.append(c);
            }
          }
          return sb.toString();
    }
}