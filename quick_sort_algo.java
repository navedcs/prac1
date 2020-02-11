
public class quick_sort_algo {

	public static int partitioanarr(int arr[], int l,int h)
	{
		int i=l-1;
		int pivot = arr[h];
		for(int k=l; k<=h; k++)
		{
			
			if(arr[k]<pivot)
			{
				i++;
				int tt=arr[i];
				arr[i]=arr[k];
				arr[k]=tt;
			}
			 
		}
		
		int tt=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=tt;
		return i+1;
	}
	public static void Qsort(int arr[], int l, int h)
	{
		if(l<h)
		{	
			int p=partitioanarr(arr, l, h);
			Qsort(arr, 0,p-1);
			Qsort(arr, p+1, h);
		}
	}

	public static void main(String[] args) 
	{ 
		int arr[] ={10, 20, 5,-30,80,-90,15,18,70};
		int n=arr.length;
		
		System.out.println("s\n"+"before sort \n");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
		System.out.println("\n \n"+"after sort \n");
		Qsort(arr, 0, n-1);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+"  ");
		}
	} 
	
	
}
