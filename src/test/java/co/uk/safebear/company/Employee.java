package co.uk.safebear.company;

public class Employee {

    private int age;
    private boolean isEmployed = true;

    public void setAge(int newAge){

        age = newAge;

    }

    public boolean getIsEmployed(){
        return isEmployed;
    }

    public int getAge(){

        return age;
    }

    public void fire(){

        isEmployed = false;
    }

}