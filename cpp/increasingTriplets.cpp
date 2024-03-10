#include "iostream"
#include "vector"
using namespace std;

class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        int n=nums.size();
        if (n<3) {
            return false;
        }

        int minVal=INT_MAX;
        int secondMin=INT_MAX;

        for(int i=0;i<n;i++) {
            if(nums[i]<=minVal) {
                minVal=nums[i];
            } 
            else if(nums[i]<=secondMin) {
                secondMin=nums[i];
            } 
            else {
                return true;
            }
        }

        return false;
    }
};//same template from leetcode

int main() {
    Solution sol;

    vector<int> nums1;
    nums1.push_back(1);
    nums1.push_back(2);
    nums1.push_back(3);
    nums1.push_back(4);
    nums1.push_back(5);
    cout << "Example 1: " << (sol.increasingTriplet(nums1) ? "true" : "false") << endl;

    vector<int> nums2;
    nums2.push_back(5);
    nums2.push_back(4);
    nums2.push_back(3);
    nums2.push_back(2);
    nums2.push_back(1);
    cout << "Example 2: " << (sol.increasingTriplet(nums2) ? "true" : "false") << endl;

    // Example 3
    vector<int> nums3;
    nums3.push_back(2);
    nums3.push_back(1);
    nums3.push_back(5);
    nums3.push_back(0);
    nums3.push_back(4);
    nums3.push_back(6);
    cout << "Example 3: " << (sol.increasingTriplet(nums3) ? "true" : "false") << endl;

    return 0;
}//examples from leetcode.
