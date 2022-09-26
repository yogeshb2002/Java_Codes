import java.util.Arrays;

class KthSmallest{
    public static void main(String[] args){
        int lis[] = new int[]{34, 43, 21, 35, 17, 37, 12};
        int K = 3;
        Arrays.sort(lis);
        System.out.println("Kth smallest element : "+lis[K-1]);
    }
}