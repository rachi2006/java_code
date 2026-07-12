import java.util.Scanner;
public class check {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        float persentage = sc.nextFloat();
        System.out.println("your name is "+ name + "and your age is" + age + " and your persentage is" + persentage);
        if(age > 18){
            System.out.println("your can vote");
            }
        else{
            System.err.println("your age is less than 18");

            }
            sc.close();
        }

    }
    
