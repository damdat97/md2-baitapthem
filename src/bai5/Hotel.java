package bai5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> personList;

    public Hotel() {
        personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public int findByPassport(String passport){
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getPassport().equals(passport)) {
                return i;
            }
        }
        return -1;
    }

    public void delete(String passport) {
        personList.remove(findByPassport(passport));
    }

    public int calculator(String passport) {
        for (Person person : personList) {
            if (person.getPassport().equals(passport)) {
                return person.getRoom().getPrice() * person.getNumberRent();
            }
        }
        return 0;
    }

    public void show(){
        for (int i = 0; i < personList.size();i++) {
            System.out.println(personList.get(i));
        }
    }
}
