package cyber.succes.biz;

public class Pss {
	static int a,b
	;
	
			
	
	public static void main (String[]args)
	{
		int x,y,sum;
		System.out.println("hhh");
		Pss obj=new Pss();
		obj.studentinfo();
		obj.studentinfo1("girish", 'a', 88.5f, 200);
		obj.studentinfo1("ankush", 'b', 70, 300);
	}
      public void studentinfo() {
    	  
    	  String name="pravin salve";
    	  char grade='a';
    	  float percentage=85.7f;
    	  int number=100;
    	  System.out.println("name of student is "+name);
     	  System.out.println("Grade is "+grade);
     	  System.out.println("percentage of stu "+percentage);
     	  System.out.println("number of student"+number);
    	  
    	  
	}
      public void studentinfo1(String name,char grade,float percentage,int number) {
    	  
    	  
    	  System.out.println("name of student is "+name);
     	  System.out.println("Grade is "+grade);
     	  System.out.println("percentage of stu "+percentage);
     	  System.out.println("number of student "+number);
      }

}
