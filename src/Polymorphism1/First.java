package Polymorphism1;

public class First {

	public static void main(String[] args) {
		First obj=new First();
		obj.add(23, 32);
		obj.add();
		obj.add(12,32);

	}
      public void add()
      {
    	  int a=10;
    	  int b=20;
    	  int sum=a+b;
    	  System.out.println(sum);
      }
      public void add(int a,int b)
      {   int sum=a+b;
      System.out.println(sum);
    	  
      }
      public void add(float a,float b)
      {
    	  float sum=a+b;
    	  System.out.println(sum);
      }
}
