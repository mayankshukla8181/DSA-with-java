
class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
   // trim() beech ke spaces ko remove nahi karta.
      //split() String ko chhote parts/words mein todta hai.
        String answer = "";
    // Hum ek empty String bana rahe hain jiska naam answer
        int left = 0;
        int right = words.length - 1;

        while (right >= left) {

            answer = answer + words[right];

            if (right != left) {
                answer = answer + " ";
            }

            right--;
        }

        return answer;
    }
}