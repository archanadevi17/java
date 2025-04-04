package collection;

public class Student1
{
    public String name;
    public int id;


   public void display()
    {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public Student1(String name, int id) {
        this.name = name;
        this.id = id;
    }
}