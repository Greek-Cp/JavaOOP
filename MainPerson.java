package riyan.belajar.java.oop;

import riyan.belajar.java.generic.PersonClas;

public class MainPerson {
    public static void main(String[]args){
        PersonClas Andy = new PersonClas("Andy");
        Andy.setName("Andy");
        Andy.setJob("Software Engginer");
        Andy.age(18);
        //ALice
        PersonClas Alice = new PersonClas("Alice");
        Alice.setJob("Software Engginer");
        Alice.age(19);
        //get Information data
        Andy.getAge();
        Andy.getInformation();
        Alice.getAge();
        Alice.getInformation();
    }
}
