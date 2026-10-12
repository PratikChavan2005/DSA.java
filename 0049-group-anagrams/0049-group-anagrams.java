class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // 1. Convert str to a character array

            char[] charr = str.toCharArray();
            // 2. Sort the character array
            Arrays.sort(charr);
            // 3. Convert it into a String key

            String key = new String(charr);
            // 4. Add str to the correct group

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        // 5. Return all grouped lists
        return new ArrayList<>(map.values());
    }
}