package arraypractice;

public class Demo3 {

	public static void main(String[] args) {
		
		int[][]age= {{12,13,2},{23,24,6},{45,21,76}};
		
		for(int i=0;i<=age.length-1;i++)
		{
			for(int j=0;j<=age.length-1;j++)
			{
				System.out.print(age[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}