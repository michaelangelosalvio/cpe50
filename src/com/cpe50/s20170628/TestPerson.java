package com.cpe50.s20170628;

/**
 * Created by msalvio on 28/06/17.
 */
public class TestPerson {
    public static void main(String[] args) {

        /**
         * Instantiate everything
         */

        Person person = new Person();
        Person mother = new Person();
        Person father = new Person();
        Person fatherOfMother = new Person();
        Person fatherOfFather = new Person();
        Person motherOfFather  = new Person();
        Pet petOfFatherOfMother = new Pet();
        Pet petOfFather = new Pet();

        /**
         * Set Names
         */

        person.setFirstName("Joey");
        person.setLastName("Rodriguez");

        mother.setFirstName("Michelle");
        mother.setLastName("Rodriguez");

        fatherOfMother.setFirstName("Jose");
        fatherOfMother.setLastName("Santos");

        father.setFirstName("Frederick");
        father.setLastName("Rodriguez");

        fatherOfFather.setFirstName("Roming");
        fatherOfFather.setLastName("Rodriguez");

        motherOfFather.setFirstName("Basing");
        motherOfFather.setLastName("Rodriguez");

        petOfFather.setName("Chu-Chu");
        petOfFather.setType("Chow-Chow");

        petOfFatherOfMother.setName("Chi-Chi");
        petOfFatherOfMother.setType("Great Dane");

        /**
         * Make Connection
         */

        person.setFather(father);
        person.setMother(mother);

        mother.setFather(fatherOfMother);

        father.setFather(fatherOfFather);
        father.setMother(motherOfFather);

        fatherOfMother.setPet(petOfFatherOfMother);

        father.setPet(petOfFather);


        displayPerson(person);
        displayPerson(person.getMother());
        displayPerson(person.getMother().getFather());

        displayPerson(person.getFather());
        displayPerson(person.getFather().getMother());
        displayPerson(person.getFather().getFather());


    }

    public static void displayPerson(Person person){
        System.out.println("==================================");
        System.out.println("Name : " + person.getLastName() + ", " + person.getFirstName());

        if ( person.getMother() != null ) {
            System.out.println("Mother : " + person.getMother().getLastName() + ", " + person.getMother().getFirstName());
        }

        if ( person.getFather() != null ) {
            System.out.println("Father : " + person.getFather().getLastName() + ", " + person.getFather().getFirstName());
        }

        if ( person.getPet() != null ) {
            System.out.println("Pet : " + person.getPet().getName() + "("+ person.getPet().getType() +")" );
        }

        System.out.println("==================================");
        System.out.println();
    }
}
