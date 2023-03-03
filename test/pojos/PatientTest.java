/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pojos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carme
 */
public class PatientTest {
    
    public PatientTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Patient.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Patient instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Patient.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Patient instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Patient.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Patient instance = null;
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Patient.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        Patient instance = null;
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Patient.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Patient instance = null;
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Patient.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Patient instance = null;
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Patient.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Patient instance = null;
        String expResult = "";
        Float result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Patient.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        Float weight = null;
        Patient instance = null;
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBackground method, of class Patient.
     */
    @Test
    public void testGetBackground() {
        System.out.println("getBackground");
        Patient instance = null;
        String expResult = "";
        String result = instance.getBackground();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBackground method, of class Patient.
     */
    @Test
    public void testSetBackground() {
        System.out.println("setBackground");
        String background = "";
        Patient instance = null;
        instance.setBackground(background);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Patient.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Patient instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Patient.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Patient instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Patient.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Patient instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
