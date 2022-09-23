class ReverseStr{
    public static void main(String[] args){
        String str = "ollo";
        String rev="";
        for(int i = 0; i < str.length() ; i++){
            rev = str.charAt(i)+rev;
        }
        System.out.println("Reversed String : "+rev);
        if(str.equals(rev)){
            System.out.println("String is Pallindrome...");
        }
        else{
            System.out.println("String is not Pallindrome...");
        }
    }
}