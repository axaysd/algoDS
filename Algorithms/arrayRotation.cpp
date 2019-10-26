#include <iostream>
using namespace std;

void reverse(int arr[], int start, int end)
{
    while(start<end)
    {
        swap(arr[start], arr[end]);
        start++;
        end--;
    }
}

void leftRotate(int arr[], int n, int d)
{
    if(d==0)
    {
        return;
    }
    reverse(arr, 0, d-1);
    reverse(arr, d, n-1);
    reverse(arr, 0, n-1);
}

void rightRotate(int arr[], int n, int d)
{
    if(d==0)
    {
        return;
    }
    reverse(arr, n-d, n-1);
    reverse(arr, 0, n-d-1);
    reverse(arr, 0, n-1);
}

int main()
{
    int arr[10], n, i, d;
    cin >> n >> d;
    for(i=0; i<n; i++)
    {
        cin >> arr[i];
    }
    leftRotate(arr, n, d);
    for(i=0; i<n; i++)
    {
        cout << arr[i] << " ";
    }    
    cout << "\n";
    rightRotate(arr, n, d);
    for(i=0; i<n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << "\n";
    return 0;
}