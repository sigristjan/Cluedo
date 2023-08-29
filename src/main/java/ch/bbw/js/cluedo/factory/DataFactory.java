package ch.bbw.js.cluedo.factory;

import ch.bbw.js.cluedo.model.Person;

import java.util.List;

public class DataFactory {
    public static List<Person> people = List.of(
            new Person("Hans", "Blond", 32, 1.72),
            new Person("Peter", "Grau", 65, 1.67),
            new Person("Greta", "Braun", 24, 1.81)
    );
}
