package HomeWork1;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course(new Cross(300),
                new Cross(800), new Water(5));

        Team team1 = new Team("Team 1", new Cat("Barsik"),
                new Dog("Bobik"), new Dog("Sharik"));




        course1.doIt(team1);


        System.out.println("\n===== RESULTS =====\n");
        team1.showResults();
        System.out.println();

    }
}
