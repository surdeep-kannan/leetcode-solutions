// Rotate Array [Medium]
// https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        if (k == 0) return;
        boolean[] visited = new boolean[n];
        int count = 0; 
        int start = 0;
        while (count < n) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                visited[current] = true;
                count++;
            } while (current != start);
            start++;
            while (start < n && visited[start]) {
                start++;
            }
        }
    }
}