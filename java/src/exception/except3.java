package exception;

public class except3 {

    public static void main(String[] args) {
        int a = 10, b = 2, c;
        int arr[] = new int[9];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;

     
        try {
            System.out.println(arr[9]);
        }
        catch (ArithmeticException ae) {
            System.out.println("ArithmeticException");
        }
        catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("ArrayIndexOutOfBoundsException");
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
