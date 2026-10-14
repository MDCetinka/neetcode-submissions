class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){ return false; }

        Map<Character, Integer> sLetters = new HashMap<>();

        char[] sArray = s.toCharArray();

        for(int i = 0; i< sArray.length ; i++){
            char currentChar= sArray[i];
            sLetters.put(currentChar , sLetters.getOrDefault(currentChar, 0) + 1);
        }


        Map<Character, Integer> tLetters = new HashMap<>();

        char[] tArray = t.toCharArray();

        for(int i = 0; i< tArray.length ; i++){
            char currentChar = tArray[i];
            tLetters.put( currentChar , tLetters.getOrDefault( currentChar , 0) +1);
                    
             
        }

        return sLetters.equals(tLetters); 

    }




}
