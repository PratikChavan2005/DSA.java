public class Main {

    static class VersionControl {
        int badVersion = 4;

        boolean isBadVersion(int version) {
            return version >= badVersion;
        }
    }

    static class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            return left;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 10;
        int result = solution.firstBadVersion(n);

        System.out.println("First bad version: " + result);
    }
}