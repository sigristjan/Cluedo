package ch.bbw.js.cluedo.model;

import java.util.List;

public class DataHolder {
    public static List<Person> people = List.of(
            new Person("Hans", "Blond", 32, 1.72),
            new Person("Peter", "Grau", 65, 1.67),
            new Person("Greta", "Braun", 24, 1.81)
    );

    public static List<Weapon> weapons = List.of(
            new Weapon("Revolver", "Stahl", 0.8),
            new Weapon("Seil", "Hanf-Schnur", 1.2),
            new Weapon("Rohr", "Stahl", 2.0)
    );

    public static List<Room> rooms = List.of(
            new Room(20, 2, 4, "Weiss"),
            new Room(16, 1, 2, "Grau"),
            new Room(25, 2, 3, "Weiss")
    );
}
