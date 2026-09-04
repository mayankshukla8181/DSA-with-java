class Solution {
    public String removeOccurrences(String s, String part) {
        /*kb tk same 2 step krenege 
        jbtk part exist krta hs string me*/
        while(s.contains(part)){
            // search a part inside s
          int index = s.indexOf(part);;
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return s;
     }
}