
import java.util.Scanner;
public class UI {
	public void start(){
		int a, b, c, d, p;
		Scanner in = new Scanner(System.in);
		
	//	while(true){			
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			p = in.nextInt();	
		if(check(a,b,c,d,p)){
			String shape = Shape(a,b,c,d,p);
			System.out.println("The highest priority shape is "+ shape +". \n");
		}
		else{
			System.out.println("Input Error!\n");
		}		
		//}
		
	}	
	public boolean check(int a, int b, int c, int d, int p){
		if(a<=0 || b<=0 || c<=0 || d<=0 || p <=0 
		 	|| a>200 || b>200 || c>200 || d>200 || p>90)
			return false;
		else 
			return true; 
	}
	public String Shape(int a, int b, int c, int d, int p){
		String shape; 
		if(a==b && b==c && c==d && p==90)
			shape = "square";
		else if(a==c && b==d && p==90)
			shape = "rhombus";
		else if(a==b && b==c && c==d)
			shape = "rectangle";
		else if((a==c || b==d) && p==90)
			shape = "harrier-shape";
		else if(a==c && b==d)
			shape = "parallelogram";
		else if(((double)a/c)==((double)b/d))
			shape = "trapezium";
		else
			shape = "quadrilateral";

		return shape;
	}
}
