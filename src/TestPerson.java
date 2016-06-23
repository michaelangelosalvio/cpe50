public class TestPerson {
    public static void main(String[] args) {

        Person child = new Person();

        child.setFirstName("John");
        child.setLastName("Doe");

        /**
         * Set father
         */

        Person father = new Person();
        father.setFirstName("Philip");
        father.setLastName("Doe");
        child.setFather(father);

        /**
         * set mother
         */

        Person mother = new Person();
        mother.setFirstName("Maria");
        mother.setLastName("Yu");
        child.setMother(mother);

        /**
         * Display Details
         */

        System.out.println("Child : " + child.getLastName() + ", " + child.getFirstName() );
        System.out.println("Mother : " + child.getMother().getLastName() + ", " + child.getMother().getFirstName() );
        System.out.println("Father : " + child.getFather().getLastName() + ", " + child.getFather().getFirstName() );

    }
}
