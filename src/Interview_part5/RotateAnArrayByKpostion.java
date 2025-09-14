package Interview_part5;

import java.util.Iterator;

public class RotateAnArrayByKpostion {

	public static void main(String[] args) {
		int n[]= {3,32,7,3};//32,7,3,3
		int l=n.length;
		int k=1;
		
		k=k%l;
		
		swap(n,0,l-1);
		swap(n,0,k-1);
		swap(n,k,l-1);
		
	for (int i : n) {
		System.out.print(i+" ");
	}
		
	}
	
	public static void swap(int[]ar,int y,int z )
	{
		while(y<z)
		{
			int temp=ar[y];
			 ar[y]=ar[z];
			ar[z]=temp;
			y++;
			z--;
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
