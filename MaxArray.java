public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {12, 67, 37, 10, 75, 28, 91};
		int max = a[0];
		int min = a[0];
		for(int i=0; i<a.length; i++) {
			
			if(a[i] > max)
				max = a[i];
		
		}
		
		System.out.println("Largest number in given array:" +max);
	

	for(int j=0; j<a.length; j++) {
		
		if(a[j] < min)
			min = a[j];
	}

	System.out.println("Smallest number in given array:"+min);
	}
	
}
