#include "iostream"
using namespace std;

class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int s1 = nums1.size(), s2 = nums2.size(), i=0,j=0,k=0;
        vector<int> result(s1+s2);

        while(i<s1 && j<s2) {
            if(nums1[i]<=nums2[j]) {
                result[k++]=nums1[i++];
            }
            else {
                result[k++]=nums2[j++];
            }
        }

        while(i<s1) {
            result[k++]=nums1[i++];
        }

        while(j<s2) {
            result[k++]=nums2[j++];
        }

        if((s1 + s2) % 2 == 1) {
            return (double)result[(s1 + s2) / 2];
        } else {
            return (double)(result[(s1 + s2) / 2 - 1] + result[(s1 + s2) / 2]) / 2;
        }
    }
};