class Solution {

    static boolean compareFreq(int count1[], int count2[]) {

        for (int i = 0; i < 26; i++) {

            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        // If s1 is bigger than s2, answer is impossible
        if (s1.length() > s2.length()) {
            return false;
        }

        // Frequency of s1
        int count1[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);
            int index = ch - 'a';

            count1[index]++;
        }

        int windowLength = s1.length();

        // Frequency of first window of s2
        int count2[] = new int[26];

        for (int i = 0; i < windowLength; i++) {

            char ch = s2.charAt(i);
            int index = ch - 'a';

            count2[index]++;
        }

        // Check first window
        if (compareFreq(count1, count2)) {
            return true;
        }

        // Sliding window
        for (int i = windowLength; i < s2.length(); i++) {

            // Add new character
            char newChar = s2.charAt(i);
            int newCharIndex = newChar - 'a';

            count2[newCharIndex]++;

            // Remove old character
            char oldChar = s2.charAt(i - windowLength);
            int oldCharIndex = oldChar - 'a';

            count2[oldCharIndex]--;

            // Check current window
            if (compareFreq(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}