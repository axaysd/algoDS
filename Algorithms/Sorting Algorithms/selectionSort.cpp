#include <iostream>
using namespace std;

int* selectionSort(int arr[], int n)
{
    int i, j, min_idx;
    for(i=0; i<n-1; i++)
    {
        min_idx = i;
        for(j=i+1; j<n; j++)
        {
            if(arr[j]<arr[min_idx])
            {
                min_idx = j;
            }
        }
        swap(arr[i], arr[min_idx]);
    }
    return arr;
}

int main()
{
    int n, i;
    cin >> n;
    int arr[n];
    for(i=0; i<n; i++)
    {
        cin >> arr[i];
    }
    int *sortedArr = selectionSort(arr, n);
    cout << "Sorted Array: ";
    for(i=0; i<n; i++)
    {
        cout << sortedArr[i] << " ";
    }
    return 0;
}