// Minimum Number of Pushes to Type Word II [Medium]
// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/

class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char c : word.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        List<Integer> freqs = new ArrayList<>(frequency.values());
        Collections.sort(freqs, Collections.reverseOrder());
        int totalPushes = 0;
        for (int i = 0; i < freqs.size(); i++) {
            int presses = (i / 8) + 1;
            totalPushes += freqs.get(i) * presses;
        }
        return totalPushes;
    }
}