
public class Face {

	
	public static void main(String[] args) {
	int arr [][];
	
	arr = new int [5][5];
	arr [1][1] = 0;
	arr[1][3]=0;
	arr[2][2]=4;
	arr[3][0]=1;
	arr[4][1]=1;
	arr[4][2]=1;
	arr[4][3]=1;
	arr[3][4]=1;
	
	
	System.out.println(arr);
	
	}
	
	
	
	
	
	
	public static void print2d(int[][] arr) {
		for (int i =0; i < arr.length; i++) {
			for (int j =0; j< arr[i].length; j++){
				System.out.println(arr);
			}
			System.out.println();
		}
	}
	
	
	
}
