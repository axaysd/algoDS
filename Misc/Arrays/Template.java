import java.util.*;

class 
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T>0)
	    {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            for(int i=0; i<N; i++)
            {
                System.out.print(arr[i]);
                if(i<N-1)
                {
                    System.out.print(" ");
                }
            }
            T--;
        }
        sc.close();
     }
}