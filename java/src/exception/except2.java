package exception;

public class except2
{
    public static void main(String[] args) {
        int a = 10, b = 2, c;
        try {
            System.out.println(a / (2 - b));
        }
        catch (Exception e) {
            System.out.println("in catch");
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("end of the program");
    }

}
