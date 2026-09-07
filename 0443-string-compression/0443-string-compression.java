class Solution {

    public int compress(char[] chars) {

        int readIndex = 0;
        int writeIndex = 0;

        while (readIndex < chars.length) {

            char currentChar = chars[readIndex];
            int count = 0;

            // Count duplicate characters
            while (readIndex < chars.length &&
                   currentChar == chars[readIndex]) {

                readIndex++;
                count++;
            }

            // Write the character
            chars[writeIndex] = currentChar;
            writeIndex++;

            // Write count only if greater than 1
            if (count > 1) {

                String countStr = String.valueOf(count);

                for (char digit : countStr.toCharArray()) {
                    chars[writeIndex] = digit;
                    writeIndex++;
                }
            }
        }

        return writeIndex;
    }
}


