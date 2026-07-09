// Last updated: 7/9/2026, 10:07:34 AM
#include <stdlib.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int* result = (int*)malloc(2 * sizeof(int));
    *returnSize = 2; // We always return 2 indices

    for (int i = 0; i < numsSize - 1; i++) {
        for (int j = i + 1; j < numsSize; j++) {
            if (nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
                return result; // Found the answer, return immediately
            }
        }
    }

    return NULL; // In case no solution is found (shouldn't happen as per problem)
}
