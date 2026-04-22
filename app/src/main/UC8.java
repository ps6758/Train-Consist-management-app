package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bogie {
    String name;
    public int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class UC8 {

    // Method to filter bogies
    public static List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        List<Bogie> filtered = filterBogies(bogies, 60);

        System.out.println("Filtered Bogies (capacity > 60):");
        filtered.forEach(System.out::println);
    }
}