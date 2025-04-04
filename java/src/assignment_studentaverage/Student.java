package assignment_studentaverage;

public class Student {
    String name;
    int id;
    int mark_cc;
    int mark_ml;
    float avg;

    public float avg()
   {
        this.avg = (this.mark_cc + this.mark_ml) / 2;
        System.out.println("The average score by " + this.name + " is " + this.avg);
        return this.avg;
    }

    public Student(String name, int id, int mark_cc, int mark_ml)
    {
        this.id = id;
        this.name = name;
        this.mark_cc = mark_cc;
        this.mark_ml = mark_ml;
    }
}