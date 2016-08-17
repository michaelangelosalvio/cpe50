package com.cpe50.gui;

import javax.swing.*;
import java.util.ArrayList;

public class NamesListModel extends AbstractListModel<Person> {
    ArrayList<Person> persons;

    public NamesListModel(ArrayList<Person> persons){
        this.persons = persons;
    }

    public void remove(Person p){
        persons.remove(p);
        fireIntervalRemoved(this,0,persons.size());
    }

    public void clearAll(){
        persons.clear();;
        fireIntervalRemoved(this,0,persons.size());

    }

    public void add(Person p){
        this.persons.add(p);
        fireIntervalAdded(this,0,persons.size());
        this.display();
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    @Override
    public int getSize() {
        return this.persons.size();
    }

    @Override
    public Person getElementAt(int index) {
        return this.persons.get(index);
    }

    private void display(){
        for( Person person : persons ) {
            System.out.println(person);
        }
    }
}


