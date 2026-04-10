
public class Algoritimos {

    public static boolean hasDuplicate(int[] nums){
        for(int i = 0; i <= nums.length -1; i++ ){
            int ponteiro = nums[i];
            for(int iinside = i +1 ; iinside <= nums.length -1; iinside++){
                if(nums[iinside] == ponteiro){
                    return true;
                };
            }
        }

        return false;
    }

    /*
    Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false
     An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
     */

    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        int[] unicode = new int[26];

        // Posso ordenar ... seria a melhor maneira de nao passar de novo
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        for(char a1 : aChar ){
            int x = a1 - 'a';
            unicode[x] = unicode[x]+1;
        }

        for(char b1 : bChar ){
            int x = b1 - 'a';
            unicode[x] = unicode[x]-1;
        }

        for(int alfa: unicode){
            if(alfa != 0){
                return false;
            }
        }

        return true;

    }

}
