import java.util.*;

//Binary Search

class Search{
	int binarySearch(int[] arr,int x,int lo,int hi) {
		
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]<x) {
				lo=mid+1;
			}
			if(arr[mid]>x) {
				hi=mid-1;
			}
		}
		return -1;
		
	}
}


public class SearchBinary {
    	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {4,10,3,5,0,1,15,9};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("enter the element");
		int x=sc.nextInt();
		
		int lo=0;
		
		int hi=arr.length;
		Search s=new Search();
	int result=s.binarySearch(arr,x,lo,hi);

		
if(result==-1)	{
	while(result==-1) {
	x++;
	 result=s.binarySearch(arr, x, lo, hi);
	if(result!=-1) {
	System.out.println("element not found in the array");
	 System.out.println("The index of the element "+x+" is "+result);
	 break;
	}
	}
	
}
else
	System.out.print("index of the number "+x+" is "+result);

System.out.println();
System.out.println();

//bubble Sort in Ascending order



for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}
}

System.out.print(Arrays.toString(arr));

System.out.println();
System.out.println();



//bubble Sort in Descending order



for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]<arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}
}

System.out.print(Arrays.toString(arr));

	}
}
