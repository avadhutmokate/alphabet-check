import java.util.Scanner;
class AplhabetCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character ");

        char ch = sc.next().charAt(0);
        String op =
        (ch>=65 && ch<=122)?
        ("is an alphabet"):
        ("not an alphabet");

        System.out.println(op);
    }
}