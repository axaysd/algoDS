#include <iostream>
using namespace std;

int* bubbleSort(int arr[], int n)
{
    int i, j;
    bool swapped = false;
    for(i=0; i<n-1; i++)
    {
        for(j=0; j<n-i-1; j++)
        {
            if(arr[j]>arr[j+1])
            {
                swap(arr[j], arr[j+1]);
                swapped = true;
            }
        }
        if(!swapped)
        {
            break;
        }
    }
    return arr;
}

int main()
{
    int n, i, j;
    bool swapped = false;
    cin >> n;
    int arr[n];
    for(i=0; i<n; i++)
    {
        cin >> arr[i];
    }
    int *sortedArr = bubbleSort(arr, n);
    cout << "Sorted Array: ";
    for(i=0; i<n; i++)
    {
        cout << sortedArr[i] << " ";
    }
    return 0;
}