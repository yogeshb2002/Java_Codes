import java.util.Scanner;
class HCF{
    public static void main(String[] args){
        int num1, num2;
        int hcf = 1;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        num1 = obj.nextInt();
        num2 = obj.nextInt();

        for(int i = 1; i<=num1 || i <= num2 ; i++){
            if(num1%i == 0 && num2%i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF of "+ num1+" and "+num2+" is "+hcf);

    }
}