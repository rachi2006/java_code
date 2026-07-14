//import java.util.Scanner;
class buterfly {
	public static void main (String[] args) throws java.lang.Exception {
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		for(int i=0; i<=6;i++){
		    for(int j=0; j<=i; j++){
		        System.out.print("*");
		    }
		    
		    int spaces = 2 * (6-i);
		    for(int j=0; j<=spaces; j++){
		        System.out.print(" ");
		    }
		    
		    for(int j=0; j <=i; j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		for(int i=6; i>=1;i--){
		    for(int j=0; j<=i; j++){
		        System.out.print("*");
		    }
		    
		    int spaces = 2 * (6-i);
		    for(int j=0; j<=spaces; j++){
		        System.out.print(" ");
		    }
		    
		    for(int j=0; j <=i; j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}

	}
}
