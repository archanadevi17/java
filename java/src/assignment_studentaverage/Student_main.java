package assignment_studentaverage;

public class Student_main
  {

    public static void main(String[] args)
     {
        float max;
        int i = 0;
        float[] s = new float[3];

        Student Archana = new Student("Archana", 101, 89, 90);
        s[0] = Archana.avg();
        Student Rahul = new Student("Rahul", 102, 80, 92);
        s[1] = Rahul.avg();
        Student Kaviya = new Student("Kaviya", 107, 79, 95);
        s[2] = Kaviya.avg();

        max = s[0];

        for (int j = 0; j < s.length; j++)
        {
            if (s[j] > max)
           {
                max = s[j];
                i = j;
            }
        }

        System.out.println("With " + max + " is the highest scorer");
    }
}
