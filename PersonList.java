/*
 * PersonList.java
 * Name: Ernesto Morales Carrasco
 * Email: emoralescarras@cnm.edu
 * Assignment: Human Resources Part 1
 * Purpose: Interface for managing a list of Person objects.
 */

public interface PersonList {
    public void add(Person newPerson);

    public Person get(int index);
}