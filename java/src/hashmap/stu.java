package hashmap;


public class stu {
    String name;
    int id;

    public void display() {
        System.out.print("name: " + name + " id: " + id);
    }

    public stu(String name, int id) {
        this.id = id;
        this.name = name;
    }
}
