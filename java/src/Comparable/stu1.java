package Comparable;

public class stu1 implements Comparable<stu1>
{
    public String name;
    public int id;

    public void display()
   {
        System.out.println("name: " + name + " | id: " + id);
    }

    public stu1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(stu1 o) {
                return this.id - o.id;

          }
}