package com.cpe50.s20170714;

/**
 * Created by msalvio on 14/07/17.
 */
public class Person {
    private String name;
    private Person[] parents, friends;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person[] getParents() {
        return parents;
    }

    public void setParents(Person[] parents) {
        this.parents = parents;
    }

    public Person[] getFriends() {
        return friends;
    }

    public void setFriends(Person[] friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        String content = "Name : " + name + "\n";
        content += "Mother : " + parents[0].getName() + "\n";
        content += "Father : " + parents[1].getName() + "\n";

        for ( int i = 0 ; i < friends.length ; i++ ) {
            content += "Friend #" + (i+1) + " : " + friends[i].getName() + "\n";
        }

        return content;
    }
}
