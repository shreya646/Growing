class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);

        long max = 0;

        // Iterating over the set avoids redundant checks for duplicate numbers
        for (int num : set) {
            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                long currentCount = 1;

                // Use a separate variable to traverse the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentCount++;
                }

                max = Math.max(max, currentCount);
            }
        }
        return (int) max;
    }
}