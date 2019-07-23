package co.uk.safebear;

import co.uk.safebear.company.Accounts;
import co.uk.safebear.company.Employee;
import org.junit.Test;

public class TestEmployee {

    @Test
    public void testEmployee(){

        Employee jill = new Employee();
        Employee bob = new Employee();
        Employee fred = new Employee();

        Accounts.setTurnover(122000.1);

        Accounts.getTurnover();

        System.out.println("Bob's employment status " + bob.getIsEmployed());
        System.out.println("Jill's employment status " + jill.getIsEmployed());


        jill.fire();

        System.out.println("Jill's employment status " + jill.getIsEmployed());
        System.out.println("Bob's employment status " + bob.getIsEmployed());


    }

    @Test
    public void testGiraffe(){

        // lines of code to test a Giraffe.

    }



}
