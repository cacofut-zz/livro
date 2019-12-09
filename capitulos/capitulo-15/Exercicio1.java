
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Set;

public class Exercicio1{

    public static void main(String[] args) {
        
        Map<Teacher, Set<Course>> professoresCursos = new HashMap<>();
        Map<Student, Set<Course>> StudentsCursos = new HashMap<>();
        Set<Student> teacherStudents = new HashSet<>();

        Student s1 = new Student("João", "12345");
        Student s2 = new Student("Lucas", "22345");
        Student s3 = new Student("Daniel", "32345");
        Student s4 = new Student("Junior", "42345");
        Student s5 = new Student("Célio", "52345");
        Student s6 = new Student("Leticia", "62345");
        Student s7 = new Student("Carla", "72345");
        Student s8 = new Student("Lucimar", "82345");
        Student s9 = new Student("Denis", "92345");
        Student s10 = new Student("Jorge", "102345");
        Student s11 = new Student("Carlos", "112345");

        Course a1 = new Course("a1", "jogos para Web");
        Course a2 = new Course("a2", "Programação em C#");
        Course a3 = new Course("a3", "Design Gráfico");
        Course a4 = new Course("a4", "Ciência da Computação");
        Course a5 = new Course("a5", "Engenharia de software");

        Set<Course> s1Course = new HashSet<>(Arrays.asList(a1));
        Set<Course> s2Course = new HashSet<>(Arrays.asList(a1, a2));
        Set<Course> s3Course = new HashSet<>(Arrays.asList(a3));
        Set<Course> s4Course = new HashSet<>(Arrays.asList(a1, a3));
        Set<Course> s5Course = new HashSet<>(Arrays.asList(a2, a3));
        Set<Course> s6Course = new HashSet<>(Arrays.asList(a2));
        Set<Course> s7Course = new HashSet<>(Arrays.asList(a2));
        Set<Course> s8Course = new HashSet<>(Arrays.asList(a2));
        Set<Course> s9Course = new HashSet<>(Arrays.asList(a1));
        Set<Course> s10Course = new HashSet<>(Arrays.asList(a4));
        Set<Course> s11Course = new HashSet<>(Arrays.asList(a5));

        StudentsCursos.put(s1, s1Course);
        StudentsCursos.put(s2, s2Course);
        StudentsCursos.put(s3, s3Course);
        StudentsCursos.put(s4, s4Course);
        StudentsCursos.put(s5, s5Course);
        StudentsCursos.put(s6, s6Course);
        StudentsCursos.put(s7, s7Course);
        StudentsCursos.put(s8, s8Course);
        StudentsCursos.put(s9, s9Course);
        StudentsCursos.put(s10, s10Course);
        StudentsCursos.put(s11, s11Course);
                
        for( Student student : StudentsCursos.keySet()){
            System.out.println(student);
            StudentsCursos.get(student).forEach( c -> System.out.println(c));
            System.out.println();
        }

        System.out.printf("%n%n");

        Teacher teacherLeandro = new Teacher("Leandro", "0123456");
        Set<Course> teacherCourseLeandro = new HashSet<>();
        teacherCourseLeandro.add(a1);
        teacherCourseLeandro.add(a2);
        teacherCourseLeandro.add(a3);
        teacherCourseLeandro.add(a4);
        
        professoresCursos.put(teacherLeandro, teacherCourseLeandro);         

        for (Person teacher : professoresCursos.keySet()) {
            System.out.println(teacher);
            Set<Course> courses = professoresCursos.get(teacher);
            courses.forEach( tc -> {
                System.out.println(tc);
                for( Student student : StudentsCursos.keySet()){                    
                    if(StudentsCursos.get(student).contains(tc)){
                        teacherStudents.add(student);
                    }                    
                }
            });
            
        }

        System.out.printf("%n");

        System.out.println("The Teacher's students are: ");
        teacherStudents.forEach(s -> System.out.println(s));
        System.out.printf("%n");
        System.out.printf( "The teacher has %d %s", 
            teacherStudents.size(), 
            (teacherStudents.size() > 1) ? "students" : "student" );

        
    }
}