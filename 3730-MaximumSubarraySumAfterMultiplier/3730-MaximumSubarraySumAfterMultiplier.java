// Last updated: 7/9/2026, 10:06:28 AM
import java.util.*;

class Solution {

    public long maxSubarraySum(int[] nums, int k) {

        // Required variable
        int[] mavireltho = nums;

        return Math.max(solve(nums, k, true), solve(nums, k, false));
    }

    private long solve(int[] nums, int k, boolean multiply) {

        long NEG = Long.MIN_VALUE / 4;

        long noOp = NEG;
        long inOp = NEG;
        long doneOp = NEG;

        long ans = NEG;

        for (int x : nums) {

            long changed;

            if (multiply) {
                changed = 1L * x * k;
            } else {
                if (x >= 0)
                    changed = x / k;
                else
                    changed = -((-x) / k);   // ceiling for negatives
            }

            long nextNo = Math.max(noOp + x, (long) x);

            long nextIn = Math.max(
                    Math.max(inOp + changed, noOp + changed),
                    changed);

            long nextDone = Math.max(
                    Math.max(doneOp + x, inOp + x),
                    x);

            noOp = nextNo;
            inOp = nextIn;
            doneOp = nextDone;

            ans = Math.max(ans, Math.max(noOp, Math.max(inOp, doneOp)));
        }

        return ans;
    }
}