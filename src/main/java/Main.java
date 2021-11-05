import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Student s1 = new Student("Tom Kane", 20, new LocalDate(2001, 5, 12), 123455);
        Student s2 = new Student("John Doe", 21, new LocalDate(2000, 6, 14), 232313);
        Student s3 = new Student("Alan Pope", 22, new LocalDate(1999, 2, 20), 12837123);
        Student s4 = new Student("Sam Hope", 23, new LocalDate(1998, 4, 12), 1276813);

        Module m1 = new Module("Graphics", "CT417");
        Module m2 = new Module("Algorithms", "CT731");
        Module m3 = new Module("Modern Philosophy", "PH180");
        Module m4 = new Module("Mathematics", "MA321");


        Course c1 = new Course("Maths", new DateTime(2021, 9, 7, 0, 0), new DateTime(2022, 5, 7, 0, 0));
        Course c2 = new Course("Philosophy", new DateTime(2021, 9, 7, 0, 0), new DateTime(2022, 5, 7, 0, 0));
        Course c3 = new Course("Computer Science", new DateTime(2021, 9, 7, 0, 0), new DateTime(2022, 5, 7, 0, 0));

        ArrayList<Student> studentListFull = new ArrayList<Student>();
        ArrayList<Module> moduleListFull = new ArrayList<Module>();
        ArrayList<Course> courseListFull = new ArrayList<Course>();
        ArrayList<Student> halfStudent = new ArrayList<Student>();
        halfStudent.add(s2);
        halfStudent.add(s3);

        ArrayList<Student> halfStudent2 = new ArrayList<Student>();
        halfStudent.add(s1);
        halfStudent.add(s4);

        s1.setModuleList(List.of(m1,m3));
        s2.setModuleList(List.of(m1,m2));
        s3.setModuleList(List.of(m1,m4));
        s4.setModuleList(List.of(m1,m2,m3, m4));

        s1.setCourseList(List.of(c1, c2));
        s1.setCourseList(List.of(c2, c3));
        s1.setCourseList(List.of(c2));

        m1.setStudentList(halfStudent);
        m2.setStudentList(halfStudent2);
        m3.setStudentList(halfStudent);
        m4.setStudentList(studentListFull);

        m1.setCourseList(courseListFull);
        m2.setCourseList(courseListFull);
        m3.setCourseList(courseListFull);
        m4.setCourseList(courseListFull);

        c1.setStudentList(halfStudent);
        c2.setStudentList(halfStudent2);
        c3.setStudentList(studentListFull);

        c1.setModuleList(List.of(m1,m3));
        c2.setModuleList(List.of(m1,m2));
        c3.setModuleList(List.of(m1,m4));

        studentListFull.add(s1);
        studentListFull.add(s2);
        studentListFull.add(s3);
        studentListFull.add(s4);

        moduleListFull.add(m1);
        moduleListFull.add(m2);
        moduleListFull.add(m3);
        moduleListFull.add(m4);

        courseListFull.add(c1);
        courseListFull.add(c2);
        courseListFull.add(c3);





        for( int i =0; i< studentListFull.size(); i++){
            System.out.println(studentListFull.get(i).toString());
        }

        for( int i =0; i< moduleListFull.size(); i++){
            System.out.println(moduleListFull.get(i).toString());
        }
        for( int i =0; i< courseListFull.size(); i++){
            System.out.println(courseListFull.get(i).toString());
        }

    }

}
