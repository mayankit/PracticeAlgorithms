package com.mayankit.www.slidingwindow;

/**
 * This is a dummy class. Where I am writing the dummy algorithm for the
 * Sliding window technique. In all the other classes, I will Write
 * the solution using this technique and Following this pseudo algorithm
 *
 * And I am sure it will be a fun to do exercise
 */
public class AnySlidingWindowProblem {

    public int solve(String s){
        /**
         * Step 1: Initilize the window of size zero. if lefy and right equal to zero
         */

        int left = 0;
        int right = 0;

        int longest = 0;
        /**
         * Step 2: Go on till the end
         */
        while(right < s.length()){

            /**
             * Step 3:  Do some book keeping to update the state of window
             */

            /**
             *
             * Step 4: Expand the window
             */
            right++;

            /**
             * Step 5: Go on till the condition is not valid
             */

            while(left < right /* and Condition is valid*/){

                /**
                 * Step 6: Do the bookkeeping and keep in mind the optimization requierments
                 */

                longest = Math.max(right-left, longest);

                /**
                 * Step 7: update the condition
                 * Step 8: remove the left most element from the window
                 */
                left++;
            }
        }
            return longest;
    }
}
