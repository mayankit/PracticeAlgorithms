package com.mayankit.www.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharacterTest {

    private LongestSubstringWithoutRepeatingCharacter ls = new LongestSubstringWithoutRepeatingCharacter();

    @Test
    public void testCase1(){

        assertEquals(3, ls.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testCase2(){

        assertEquals(1, ls.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testCase3(){

        assertEquals(3, ls.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testCase4(){

        assertEquals(1, ls.lengthOfLongestSubstring(" "));
    }



}