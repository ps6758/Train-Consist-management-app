import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial train: " + trainConsist);

        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at index 2: " + trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After removing first and last bogies: " + trainConsist);
        System.out.println("Final ordered consist: " + trainConsist);
    }
}