import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Course {
    private String name;
    private int numStudents;

    public Course(String name, int numStudents){
        this.name = name;
        this.numStudents = numStudents;
    }

    public String getName() {
        return name;
    }

    public int getNumStudents() {
        return numStudents;
    }
}

public class CourseExample {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course("Python", 45));
        courses.add(new Course("JavaScript", 150));
        courses.add(new Course("Java 8", 113));
        courses.add(new Course("C", 55));

        courses.sort(Comparator.comparing(c -> c.getNumStudents()));
        courses.forEach(c -> System.out.println(c.getName()));
        //
        courses.sort(Comparator.comparing(Course::getNumStudents)); //pode usar comparingInt
        courses.forEach(System.out::println);
        //
        courses.forEach(c -> System.out.println(c.getName()));
        //
        System.out.println("Marcador: ");
        courses.stream()
                .filter(c -> c.getNumStudents() >= 100)
                .forEach(c -> System.out.println(c.getName()));
        System.out.println("end Marcador: ");
        //
        courses.stream()
                .filter(c -> c.getNumStudents() >= 100)
                .map(c -> c.getNumStudents())
                .forEach(total -> System.out.println(total));

        courses.stream()
                .filter(c -> c.getNumStudents() >= 100)
                .map(Course::getNumStudents)
                .forEach(System.out::println);
        //
        courses.stream()
                .filter(c -> c.getNumStudents() >= 100)
                .map(Course::getNumStudents)
                .forEach(System.out::println);
        //
        int sum = courses.stream().filter(c -> c.getNumStudents() >= 100).mapToInt(Course::getNumStudents).sum();
        System.out.println(sum);
        /*
        //exercises
        cursos.sort(Comparator.comparingInt(c -> c.getNumStudents()));
        cursos.sort(Comparator.comparingInt(Curso::getNumStudents));
        //
        System.out.println("exercises: ");
        cursos.stream()
                .filter(c -> c.getNumStudents() > 50)
                .forEach(c -> System.out.println(c.getName()));
        //
        Stream<String> nomes =
                cursos.stream()
                    .map(Curso::getName);
        nomes.forEach(System.out::println);
        //
        cursos.stream()
                .filter(c -> c.getNumStudents() > 50)
                .map(Curso::getNumStudents)
                .forEach(System.out::println);
         */
        //
        System.out.println("Optional Starts");
        Optional<Course> optionalCourse = courses.stream()
                .filter(c -> c.getNumStudents() >= 100)
                .findAny();
        optionalCourse.ifPresent(c -> System.out.println(c.getName()));
        Course course = optionalCourse.orElse(null);
        System.out.println(course.getName());
        //
        courses.stream()
                .filter(c -> c.getNumStudents() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getName()));
        //
        OptionalDouble average = courses.stream()
                .filter(c -> c.getNumStudents() >= 100)
                .map(Course::getNumStudents)
                .average();
        System.out.println(average.getAsDouble());
        System.out.println("Optional Ends");
        //---------------------------------
        System.out.println("Collect Starts");
        List<Course> result = courses.stream()
                .filter(c -> c.getNumStudents() >= 100)
                .collect(Collectors.toList());
        result.stream()
                .forEach(c -> System.out.println(c.getName()));
        List<Course> colectedCourse = courses.stream()
                .filter(c -> c.getNumStudents() >= 100)
                .collect(Collectors.toList());
        colectedCourse.stream()
                .forEach(c -> System.out.println(c.getName()));
        //
        Map<String, Integer> map = courses.stream()
                .filter(c -> c.getNumStudents() >= 100)
                .collect(Collectors.toMap( c -> c.getName(), c -> c.getNumStudents()));
        System.out.println(map);
        //

        courses.stream() //courses.parallelStream()
                .filter(c -> c.getNumStudents() >= 100)
                .collect(Collectors.toMap( c -> c.getName(), c -> c.getNumStudents()))
                .forEach((name, numStudents) -> System.out.println(name + " has " + numStudents + " students."));
        System.out.println("Collect Ends");
        /*
        //exercises
        System.out.println("exercises: ");
        cursos.stream()
                .filter(c -> c.getNumStudents() > 50)
                .findFirst()
                .ifPresent(c -> System.out.println(c.getName()));
        //
        OptionalDouble coursesAverage = course.stream()
                .mapToInt(Course::getNumStudents)
                .average();
        System.out.println(coursesAverage);
        //
        List<Course> colectedCoursesAverage = course.stream()
                .filter(c -> c.getNumStudents() > 50)
                .collect(Collectors.toList());
        colectedCoursesAverage.forEach(c -> System.out.println(c.getName()));
        System.out.println("end exercises!");
         */
        Arrays.asList('k','l','m').forEach( m -> System.out.println(m));

        OptionalInt x = IntStream.of(1, -3, 5, 6)
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println(x.getAsInt());
        //
        IntStream y = IntStream.of(1, -3, 5, 8);
                y.filter(n -> n % 2 == 0)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
