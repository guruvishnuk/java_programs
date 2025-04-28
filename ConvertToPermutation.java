import java.util.*;

public class ConvertToPermutation{
   public static int minOperationToPermutation(int N,int[] A){
	Arrays.sort(A);
       int operations=0;
	for(int i=0;i<N;i++)
	{
		if(A[i]<i+1){
		operations += (i+1- A[i]);
		A[i]=i+1;
	}
	}
	return operations;
}

public static void main(String[] args)
{
 int  N=5;
 int[] A={1,1,3,3,4};

 System.out.println(minOperationToPermutation(N, A));
}
}
