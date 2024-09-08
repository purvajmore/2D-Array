package PersonObject;

import java.util.Arrays;
import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {

        Person[] personArray = new Person[5];

        Person person1 = new Person(10,"a");
        Person person2 = new Person(20,"b");
        Person person3 = new Person(30,"c");
        Person person4 = new Person(40,"d");
        Person person5 = new Person(50,"e");

        personArray[0] = person1;
        personArray[1] = person2;
        personArray[2] = person3;
        personArray[3] = person4;
        personArray[4] = person5;

        search(personArray, person1);

    }
    public static void search(Person[] personArray, Person person)
    {
        for(Person p : personArray)
        {
            if(p.equals(person))
            {
                System.out.println("found");
                return;
            }
        }
        System.out.println("Not found");
        
    }

}
