package abstarction;

public class main_work
{

    public static void main(String[] args)
      {
        bank b;

        b = new hdfc();
        System.out.println("hdfc :" + b.getrate());

        b = new canara();
        System.out.println("canara :" + b.getrate());
      }
}