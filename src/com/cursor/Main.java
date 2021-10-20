package com.cursor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Vasil", 25, Person.Gender.MALE));
        list.add(new Person("Ivan", 13, Person.Gender.MALE));
        list.add(new Person("Volodymyr", 31, Person.Gender.MALE));
        list.add(new Person("Ira", 40, Person.Gender.FEMALE));
        list.add(new Person("Dana", 15, Person.Gender.FEMALE));
        list.add(new Person("Katya", 66, Person.Gender.FEMALE));
        list.add(new Person("Igor", 83, Person.Gender.MALE));
        list.add(new Person("Zinoviy", 63, Person.Gender.MALE));

        list.stream()
                .filter(x -> x.getAge() > 18 && x.getAge() < 60)
                .forEach(System.out::println);

        Set<String> setFromPreviousList = list.stream()
                .map(x -> x.getName() + "-" + x.getGender().toString()
                        .replaceAll("FEMALE", "f").replaceAll("MALE", "m"))
                .collect(Collectors.toCollection(() -> new HashSet<>()));

        setFromPreviousList.forEach(System.out::println);
    }
}


