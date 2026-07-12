//Print numbers from 1 to 100 using a for loop.
import java.util.Scanner;
class Numbersfrom1to100 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
