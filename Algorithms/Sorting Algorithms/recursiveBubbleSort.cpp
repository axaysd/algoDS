#include <iostream>
using namespace std;

int* recBubbleSort(int arr[], int n)
{
    int i, j;
    if(n==1)
    {
        return arr;
    }
    for(i=0; i<n-1; i++)
    {
        if(arr[i]>arr[i+1])
        {
            swap(arr[i], arr[i+1]);
        }
    }
    recBubbleSort(arr, n-1);
}

int main()
{
    int i, n;
    cin >> n;
    int arr[n];
    for(i=0; i<n; i++)
    {
        cin >> arr[i];
    }
    int *sortedArr = recBubbleSort(arr, n);
    cout << "Sorted Array: ";
    for(i=0; i<n; i++)
    {
        cout << sortedArr[i] << " ";
    }
    return 0;
}