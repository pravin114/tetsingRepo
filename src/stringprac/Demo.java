package stringprac;
import java.util.Arrays;
public class Demo {

	public static void main(String[] args) {
		String name = "pravin";      
	   String name1="pravi";
		
				String name6=new String("salve");
				
				//
				System.out.println(name==name1);
				System.out.println(name.equals(name6));
				System.out.println(name6.replace('s', 'p'));
				//System.out.println(name.split(name6));	
				String m6= "My,test";
				System.out.println(m6);
				//System.out.println(m6.split(","));
				
                   System.out.println(name6.concat( m6));  
                   System.out.println(m6.hashCode());
                   
	}
 
}
