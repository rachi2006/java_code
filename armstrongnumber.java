import java.util.Scanner;

class armstrongnumber {
    public static void firstfunction(int num){
        int storednumber = num;
        int sum = 0;
        
        while(num > 0){
          int digit = num % 10;
          sum += (digit * digit* digit);
          num = num / 10;
        }
          if(sum == storednumber){
              System.out.println(storednumber + " is armstrong number");
          }else{
              System.out.println(storednumber+ " is not a armstrong number");
          }
          return;
          
    }
    
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		firstfunction(num);
		
	}
}
