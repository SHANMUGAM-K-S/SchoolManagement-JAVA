
public class LinearSearch {
	
	
	public static void binary(int []arr,int x,int l,int r) {
		int mid=l+(r-1)/2;
		while(r>=l) {
			if(arr[mid]==x) {
				System.out.println(arr[mid]);
				break;
			}else if(arr[mid]<x){
				l=mid+1;
				
			}else {
				r=mid-1;
			}
			mid = (r + l)/2;  
		}
		  if ( l > r ){  
		      System.out.println("Element is not found!");  
		   }  
		
	}

	public static void main(String[] args) {
//		int []arr= {10,20,30,40,50,60};
//		int len=arr.length;
//		int x=50, i=0;
//		for( i=0;i<len;i++) {
//			if(arr[i]==x) {
//				break;
//			}
//			
//		}
//		
//		if(i==x) {
//			System.out.println("-1");
//		}else {
//			System.out.println(i);
//		}

		
		
		
//		Binary Search
	
		
		int []arr= {2,5,6,10,20,30,60};
		int len=arr.length;
		int x=20,l=0,r=len-1;
		
	
		
	}

}
