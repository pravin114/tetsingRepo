package arraypractice;

public class Demo5 {

	public static void main(String[] args) {
		String mystring="Good Morning";
		String s=" ";
		String[] output=mystring.split(s);
		System.out.println(output[0]);
		System.out.println(output[1]);

         String pss="i love you";
         String jss=" ";
        		 String[]outputs=pss.split(jss);
        		 System.out.print(outputs[1]+" ");
        		 System.out.println(outputs[2]);
	}

}
