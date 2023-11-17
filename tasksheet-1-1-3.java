class tasksheet {
    public static void main(String[] args) {
        int Check_number = 10;
        for ( int i = 1 ; i<=Check_number;i++){
              String message = (i%2==0) ? i+" is even number" : i+" is odd number";
            System.out.println(message);
        }
    }
}
