package comparator;

import java.util.Comparator;

public class stu2 implements Comparator <stu2>
{
    public String name;
    public int id;

    public void display()
   {
        System.out.println("name: " + name + " | id: " + id);
    }

    public stu2(String name, int id) {
        this.name = name;
        this.id = id;
    }


	@Override
	public int compare(stu2 o1, stu2 o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}