#include <iostream>
using namespace std;

struct ListNode
{
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

class Solution
{
public:
    ListNode *reverseKGroup(ListNode *head, int k)
    {
        ListNode *temp = head;
        ListNode *prevLast = nullptr;
        while (temp != nullptr)
        {
            ListNode *kthNode = getKthNode(temp, k);
            if (kthNode == nullptr)
            {
                if (prevLast)
                {
                    prevLast->next = temp; // Link the remaining nodes as they are
                }
                break;
            }

            ListNode *nextNode = kthNode->next;
            kthNode->next = nullptr;
            ListNode *reversedHead = reverseList(temp);
            if (temp == head)
            {
                head = reversedHead;
            }
            else
            {
                prevLast->next = reversedHead;
            }

            prevLast = temp;
            temp = nextNode;
        }

        return head;
    }

private:
    ListNode *reverseList(ListNode *head)
    {
        ListNode *prev = nullptr;
        ListNode *current = head;
        ListNode *next = nullptr;

        while (current != nullptr)
        {
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    ListNode *getKthNode(ListNode *temp, int k)
    {
        k -= 1;

        while (temp != nullptr && k > 0)
        {
            k--;
            temp = temp->next;
        }

        return temp;
    }
};

void printList(ListNode *head)
{
    while (head != nullptr)
    {
        cout << head->val << " ";
        head = head->next;
    }
    cout << endl;
}

void deleteList(ListNode *head)
{
    while (head != nullptr)
    {
        ListNode *temp = head;
        head = head->next;
        delete temp;
    }
}

int main()
{
    ListNode *list1 = new ListNode(1);
    list1->next = new ListNode(2);
    list1->next->next = new ListNode(3);
    list1->next->next->next = new ListNode(4);
    list1->next->next->next->next = new ListNode(5);

    cout << "Original list: ";
    printList(list1);

    // Create an instance of the Solution class
    Solution solution;

    // Reverse the list in groups of 2
    ListNode *reversedList = solution.reverseKGroup(list1, 2);

    // Print reversed list
    cout << "Reversed list (group of 2): ";
    printList(reversedList);

    // Free memory
    deleteList(reversedList);

    return 0;
}
