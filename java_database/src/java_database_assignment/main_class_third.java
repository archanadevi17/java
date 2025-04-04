package java_database_assignment;

import java.util.HashMap;

public class main_class_third extends JDBC_Methods {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
    	main_class_third m = new main_class_third();
        m.insert(new Stud(101, "Archa", 95, 100));
        m.insert(new Stud(102, "Rahul", 99, 98));
        m.insert(new Stud(103, "Kaviya", 90, 80)); 
        m.insert(new Stud(104, "Arjun", 100, 100));
        m.insert(new Stud(105, "Priya", 90, 80));
        m.insert(new Stud(106, "Ishu", 80, 60));
        m.insert(new Stud(107, "Vijay", 100, 80));
        m.insert(new Stud(108, "Dhoni", 100, 90));
m.insert(new Stud(109,"Thalapathy",100,100));
m.insert(new Stud(110,"Ram",90,100));
        HashMap<Integer, Stud> hm1 = m.getAllStud();
        for (Stud s : hm1.values()) {
            s.CalAvg();
            m.updateAvg(s.avg, s.sid);
            
        }

        System.out.println("Average update successfully");
    }

//	private HashMap<Integer, Stud> getAllStud() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private void updateAvg(int sid, float avg) {
//		// TODO Auto-generated method stub
//		
//	}
}