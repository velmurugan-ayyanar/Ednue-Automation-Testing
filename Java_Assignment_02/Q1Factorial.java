package Java_Assignment_02;

public class Q1Factorial{
    public static void main(String[] args) {
        System.out.println(checkfactorial(5));
    }

    public static int checkfactorial(int number){
        int factorial =1;
        for(int i=0; i<=number; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
}