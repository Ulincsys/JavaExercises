/**
 * Java. Level 2. Lesson 1. Example of homework
 * Preparatory actions:
 * 1. Making animals.jar based on code in lesson 1:
 *    - compile sourse file
 *      > javac hw1/animals/*.java
 *    - make package using command:
 *      > jar -cvf animals.jar hw1/animals/*.class
 * 2. Making obstances.jar from classes track, wall, water in the same way
 * 3. Move both packages to lib/ directory
 *    > move animals.jar lib
 *    > move obstances.jar lib
 * 4. Compile using this command:
 *    > javac -cp lib/animals.jar;lib/obstances.jar;. HW1Lesson.java
 *    Run compiled program this way:
 *    > java -cp lib/animals.jar;lib/obstances.jar;. HW1Lesson
 * 5. Or put both packages to [JDK]/jre/lib/ext
 *    and compile and run this way:
 *    > javac HW1Lesson.java
 *    > java HW1Lesson
 *
 * @author Sergey Iryupin
 * @version 0.3.3 dated Oct 28, 2017
 * @task 1
 * @mark
 */
import hw1.animals.*;
import hw1.obstances.*;
import hw1.*;

class HW1Lesson {

    public static void main(String[] args) {
        Course cource = new Course(new Doable[] { // creating an obstacle course
            new Track(50),
            new Water(50),
            new Wall(2)});
        Team team = new Team("Animals", new Animal[] { // creating a team
            new Cat("Murzik"),
            new Cat("Barsik"),
            new Hen("Izzy"),
            new Hippo("Hippopo")});

        System.out.println(team); // to show team list
        cource.doIt(team);        // ask the team to pass the obstacle course
        team.showResults();       // to show results
    }
}