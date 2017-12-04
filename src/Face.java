
public class Face {

	int [][] Arr = new int [5][5];
	Arr [1][1] = 0;
	Arr[1][3]=0;
	Arr[2][2]=4;
	Arr[3][0]=1;
	Arr[4][1]=1;
	Arr[4][2]=1;
	Arr[4][3]=1;
	Arr[3][4]=1;
	
	
	
	
	
	
	
	public static void print2d(int[][] arr) {
		for (int i =0; i < arr.length; i++) {
			for (int j =0; j< arr[i].length; j++){
				System.out.println(arr);
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
}
