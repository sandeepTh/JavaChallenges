package codility;

import java.util.*;
import java.util.stream.Collectors;

public class Stream_Utility {



    public static void main(String[] args){

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,21,"A"));
        personList.add(new Person(2,25,"B"));
        personList.add(new Person(3,30,"C"));
        personList.add(new Person(4,35,"D"));
        personList.add(new Person(5,40,"E"));

        Stream_Utility stream_utility = new Stream_Utility();

    //1. Find Max age.
      System.out.println(stream_utility.maxAage(personList));


    //2. Get the person who has the age > 30
        stream_utility.filterPerson(personList);


    //3. Sort the Person by Name


    //4. Get the average people Age
        stream_utility.avgAage(personList);
    }

    public void sortByName(List<Person> personList){
        personList.stream()
                .sorted(Comparator.comparing(Person::getName));
    }

    public void avgAage(List<Person> personList){

            OptionalDouble avgperson = personList.stream()
                .mapToInt(Person::getAge).average();

    }

    public int maxAage(List<Person> personList){

        Optional<Person> person = personList.stream()
                .max(Comparator.comparing(Person::getAge));

        OptionalDouble avgperson = personList.stream()
                        .mapToInt(Person::getAge).average();



        return person.get().getAge();
    }


    public void filterPerson(List<Person> personList){

        personList.stream()
                .filter(p->p.getAge()>30)
                    .collect(Collectors.toList())
                .forEach(p-> System.out.println(p.getAge()+" :+ "+ p.getName()));


    }

}

class Person{

    private int id;
    private int age;
    private String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}