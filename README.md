# Find-the-First-Missing-Positive
Given an unsorted integer array nums, find the smallest missing positive integer.  You must implement an algorithm that runs in O(n) time and uses constant extra space.
Explanation:
We try to place each number in its correct position: for number x, we want it at index x - 1.

After rearranging, we scan the array again to find the first position i such that nums[i] != i + 1. That’s the missing number.

This approach ensures O(n) time and uses only constant space.....
