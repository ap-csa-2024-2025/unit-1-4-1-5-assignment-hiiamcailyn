public class Problem3
{
    public static void main (String[] args)
    {
        int number 5678;
        int digit1 = (number % 10);
        number /=10;
        int digit2 = (number % 10);
        number /=10;
        int digit3 = (number % 10);
        number /=10;
        int digit4 = (number % 10);
        number /=10;
        System.out.println(digit4);
        System.out.println(digit3);
        System.out.println(digit2);
        System.out.println(digit1);
    }
}

