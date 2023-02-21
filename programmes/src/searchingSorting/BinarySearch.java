package searchingSorting;

public class BinarySearch {
	public static void binarSearch(int arr[],int first,int last, int key)
	{
	int mid=(first+last)/2;
	  while(first<=last)
	  {
		  if(arr[mid]<key)
		  {
			  first =mid+1;
		  }
		  else if(arr[mid]==key)
		  {
			  System.out.println(mid);
			  break;
		  }
		  else
		  {
			  last=mid-1;
		  }
		  mid=(first+last)/2;
	  }
	  if(first>last){
		  System.out.println("not");
	  }
	 
	}
	

	public static void main(String[] args) {
		int arr[] ={10,20,30,40,50};
		int key=30;
		int first =0;
		
		int last=arr.length-1;
		binarSearch(arr,first,last,key);
		
		

	}

}


//using binary search to find the key element and return the index
