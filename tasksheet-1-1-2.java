class ArithmeticTask {

    public static void main (String[] args){
          
        int result = 1; // result is now 3
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result -= 1; // result is now 2
        System.out.println(result);

        result *= 5; // result is now 10
        System.out.println(result);

        result /= 2; // result is now 5
        System.out.println(result);

        result %= 2; // result is now 1
        System.out.println(result);
        result &= 1; // result now is 1
        System.out.println(result);
        result |= 6; // result now is 7
        System.out.println(result);
        result ^= 19; // result now is 20
        System.out.println(result);
        result >>= 2; //result is now 5
        System.out.println(result);
        result <<=2; //result is now 20
        System.out.println(result);

    }
}