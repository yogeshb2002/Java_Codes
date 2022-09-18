import java.util.Scanner;

public class ReverseArray {
    static int rev_list[] = new int[20];
    public static int[] reverse(int List[], int length){
        for(int i = length; i>0; i--){
            rev_list[length-i] = List[i-1];
        }
        return rev_list;
        }
        
    
    public static void main(String[] args){
        int length, i;
        int num[] = new int[20];
        int rev[] = new int[20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        length = obj.nextInt();
        System.out.println("Enter the list elements : ");
        for(i=0; i<length; i++){
            num[i] = obj.nextInt();
        }
        System.out.print("Actual array : ");
        for(i=0; i<length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();

        rev = reverse(num, length);

        System.out.print("The reversed array : ");
        for(i=0; i<length;i++){
            System.out.print(rev[i] + " ");
        }
    }

}
