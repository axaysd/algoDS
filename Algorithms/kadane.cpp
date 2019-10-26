#include <iostream>
using namespace std;

int main()
{
    int T;
    cin >> T;
    while(T--)
    {
        int n, i;
        cin >> n;
        long long int arr[n];
        for(i=0; i<n; i++)
        {
            cin >> arr[i];            
        }
        int curr_max = arr[0];
        int fin_max = arr[0];
        for(i=1; i<n; i++)
        {
            if(curr_max+arr[i]<arr[i])
            {
                curr_max = arr[i];
            }
            else
            {
                curr_max += arr[i];
            }
            if(curr_max>fin_max)
            {
                fin_max = curr_max;
            }
        }
        cout << fin_max << "\n";
    }
    return 0;
}