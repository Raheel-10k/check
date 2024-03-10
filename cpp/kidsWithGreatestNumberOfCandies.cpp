#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<bool> kidsWithCandies(vector<int> &candies, int extraCandies) {
        int maxCandies=0;
        int n=candies.size();
        vector<bool> result(n, false);
        for(int i=0;i<n;i++) {
            maxCandies=max(maxCandies, candies[i]);
        }

        for(int i=0;i<n;i++) {
            result[i]= (candies[i]+extraCandies >= maxCandies);
        }
        return result;
    }
};

int main() {
    Solution solution;

    // Example 1
    vector<int> candies1;
    candies1.push_back(2);
    candies1.push_back(3);
    candies1.push_back(5);
    candies1.push_back(1);
    candies1.push_back(3);
    int extraCandies1 = 3;
    vector<bool> result1 = solution.kidsWithCandies(candies1, extraCandies1);

    cout << "[";
    for (int i = 0; i < result1.size(); ++i) {
        cout << (result1[i] ? "true" : "false");
        if (i < result1.size() - 1) {
            cout << ",";
        }
    }
    cout << "]" << endl;

    return 0;
}
