import java.util.*;

class new2{
    public static int firstfunction(int num){
      return num * num;
    }
    
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result = firstfunction(num);
		System.out.println(result);
		
	}
}