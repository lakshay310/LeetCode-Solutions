class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ls = new ArrayList<>();
        for (int num : arr) {
            ls.add(num);
        }
        while (ls.size() > k) {
            int maxDiff = -1;
            int maxIdx = -1;
            for (int i = 0; i < ls.size(); i++) {
                int diff = Math.abs(ls.get(i) - x);
                if (diff > maxDiff) {
                    maxDiff = diff;
                    maxIdx = i;
                } else if (diff == maxDiff && ls.get(i) > ls.get(maxIdx)) {
                    maxIdx = i;
                }
            }
            ls.remove(maxIdx); 
        }
        return ls;
    }
}