package searchingSorting;

public class LinearSearch {
	public static int linearsearch(int arr[],int key){
		for(int i=0; i<arr.length;i++){
			if(arr[i]==key)
				return i;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int key=4;
		System.out.println(linearsearch(arr,key));
		

	}

}

//using linear search to find index of the given key.