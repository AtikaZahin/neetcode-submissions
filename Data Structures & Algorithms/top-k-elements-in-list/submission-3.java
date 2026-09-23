class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer>map = new HashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> ar= new ArrayList<>(map.entrySet());
        ar.sort((a,b)-> Integer.compare(b.getValue(),a.getValue()));
        int []r = new int [k];
        for (int i=0;i<k;i++){
            r[i]= ar.get(i).getKey();
        }

        return r;

    }
}