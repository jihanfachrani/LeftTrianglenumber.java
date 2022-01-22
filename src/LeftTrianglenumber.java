
public class LeftTrianglenumber {

	public static void main(String[] args) {
		
		 int x = 5;
	       for (int i = 1; i <= 5; i++){
	           for (int j = x - 1; j >= 1; j--){
	               System.out.print(" ");
	           }
	           for(int a = i; a > 0; a--){
	               System.out.print(a);
	           }
	           System.out.println();
	           x -= 1;
	       }
	  }
	
}