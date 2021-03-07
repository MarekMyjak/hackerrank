package hackerrank.countingvalleys;

class CountingValleys {
    static int countingValleys(int n, String s) {
        int result = 0;
        int actual = 0;
        for (char c : s.toCharArray()) {
            if (c == 'D') {
                actual--;
                if (actual == -1) {
                    result++;
                }
            } else {
                actual++;
            }
        }
        return result;
    }
}

