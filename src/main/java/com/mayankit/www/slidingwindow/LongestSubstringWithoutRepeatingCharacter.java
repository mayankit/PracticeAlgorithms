package com.mayankit.www.slidingwindow;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s){
        /**
         * Step 1: Initialize the window to zero ie left and right = 0
         */

        int left = 0;
        int right = 0;

        int longest = 0;

        Set<Character> set = new HashSet<>();

        /**
         * Step 2:  Loop till end
         */

        while(right < s.length()){

            /**
             * Since we already have the character, We start shrinking window
             */
            char ch = s.charAt(right);

            if(set.contains(ch)){
                //Step 5: Go on till the condition is valid
                while(left < right && set.contains(ch)){
                     //step 6: Start bookkeeping
                    longest = Math.max(right - left, longest);

                    /**
                     * Step 7: Update condition remove the left most element from the window
                     */
                    set.remove(s.charAt(left));
                    left++;
                }

            }else{
                // Step 3 & 4 bookkeeping Add the right character to the set
                set.add(ch);
                right++;
            }
        }

        return Math.max(right - left, longest);
    }
}
