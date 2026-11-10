class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            Integer[] rowArray = new Integer[i + 1];
            Arrays.fill(rowArray, 1);
            List<Integer> row = Arrays.asList(rowArray);
            for (int j = 1; j < i; j++) {
                List<Integer> prevRow = triangle.get(i - 1);
                row.set(j, prevRow.get(j - 1) + prevRow.get(j));
            }
            triangle.add(row);
        }
        return triangle;
    }
}