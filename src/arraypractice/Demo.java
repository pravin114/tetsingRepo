package arraypractice;

public class Demo {

	

	public static void main(String[] args) {
		//String institute[]=new String[5];
		
		//institute[0]="velocity";
		//institute[1]="corporate";
		//institute[2]="training";
		//institute[3]="center";
		String institute []= {"velocity","corporate","training","center"};
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(institute[i]);
		}
		
		int p[]= {1,23,23,6};
		for(int j=0;j<=3;j++)
		{
			System.out.println(p[j]);
		}
		String m6= "My,test";
		System.out.println(m6);
		System.out.println(m6.split(","));
		
         
		
	}

}
