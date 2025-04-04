package assignment_studentaverage;

public class avgstudent_usingarrayofobject {

    public static Student findmax(Student[] s) {
        Student amax = new Student(null, 0, 0, 0);
        amax.avg = 0;
       
        for (Student a : s)
          {
            if (a.avg > amax.avg)
     {
                amax.avg = a.avg;
                amax.name = a.name;
           }
        }
        return amax;
    }

    public static void main(String[] args) {
        Student[] s = new Student[3];

        s[0] = new Student("Archana", 101, 89, 90);
        s[0].avg();
        s[1] = new Student("Rahul", 102, 80, 92);
        s[1].avg();
        s[2] = new Student("Kaviya", 107, 79, 95);
        s[2].avg();

        Student a = findmax(s);
        System.out.print("With " + a.avg + ", " + a.name + " is the highest scorer.");
    }
}