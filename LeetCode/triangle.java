// Triangle [Medium]
// https://leetcode.com/problems/triangle/

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        List<Integer> dp = new ArrayList<>(triangle.get(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int best = Math.min(dp.get(j), dp.get(j + 1));
                dp.set(j, triangle.get(i).get(j) + best);
            }
        }
        return dp.get(0);
    }
}