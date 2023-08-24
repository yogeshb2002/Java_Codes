import java.util.Scanner;

class BinarySearch{
    public static void Search(int list[], int key, int first , int last){
        if(first<last){
            int mid = (first+last)/2;
            if(key == list[mid]){
                System.out.println("Postion = "+mid+"Key = "+key);
            }
            else if(first>mid){
                Search(list, key, mid+1, last);
            }
            else{
                Search(list, key, first, mid-1);
            }
        }
    }
    public static void main(String[] args){
        int list[] = new int[100];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length of the list :");
        int list_length = obj.nextInt();
        System.out.println("Enter the elements of the list :");

        for(int iterator=0; iterator<list_length; iterator++){
            list[iterator] = obj.nextInt();
        }

        System.out.println("Enter the key: ");
        int key = obj.nextInt();
        int low = 0;
        int high = list.length -1;
        
        Search(list, key, low, high);
    }
}