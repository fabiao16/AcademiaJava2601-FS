/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Fabiao
 */
public class ClienteTest {
        
        public ClienteTest() {
        }

        /**
         * Test of getClienteId method, of class Cliente.
         */
        @Test
        public void testGetClienteId() {
                System.out.println("getClienteId");
                Cliente instance = new Cliente();
                Integer expResult = null;
                Integer result = instance.getClienteId();
                assertEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
                fail("The test case is a prototype.");
        }

        /**
         * Test of setClienteId method, of class Cliente.
         */
        @Test
        public void testSetClienteId() {
                System.out.println("setClienteId");
                Integer clienteId = null;
                Cliente instance = new Cliente();
                instance.setClienteId(clienteId);
                // TODO review the generated test code and remove the default call to fail.
                fail("The test case is a prototype.");
        }

        /**
         * Test of getNome method, of class Cliente.
         */
        @Test
        public void testGetNome() {
                System.out.println("getNome");
                Cliente instance = new Cliente();
                String expResult = "";
                String result = instance.getNome();
                assertEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
                fail("The test case is a prototype.");
        }

        /**
         * Test of setNome method, of class Cliente.
         */
        @Test
        public void testSetNome() {
                System.out.println("setNome");
                String nome = "";
                Cliente instance = new Cliente();
                instance.setNome(nome);
                // TODO review the generated test code and remove the default call to fail.
                fail("The test case is a prototype.");
        }

        /**
         * Test of getNif method, of class Cliente.
         */
        @Test
        public void testGetNif() {
                System.out.println("getNif");
                Cliente instance = new Cliente();
                String expResult = "";
                String result = instance.getNif();
                assertEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
                fail("The test case is a prototype.");
        }

        /**
         * Test of setNif method, of class Cliente.
         */
        @Test
        public void testSetNif() {
                System.out.println("setNif");
                String nif = "";
                Cliente instance = new Cliente();
                instance.setNif(nif);
                // TODO review the generated test code and remove the default call to fail.
                fail("The test case is a prototype.");
        }

        /**
         * Test of hashCode method, of class Cliente.
         */
        @Test
        public void testHashCode() {
                System.out.println("hashCode");
                Cliente instance = new Cliente();
                int expResult = 0;
                int result = instance.hashCode();
                assertEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
                fail("The test case is a prototype.");
        }

        /**
         * Test of equals method, of class Cliente.
         */
        @Test
        public void testEquals() {
                System.out.println("equals");
                Object object = null;
                Cliente instance = new Cliente();
                boolean expResult = false;
                boolean result = instance.equals(object);
                assertEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
                fail("The test case is a prototype.");
        }

        /**
         * Test of toString method, of class Cliente.
         */
        @Test
        public void testToString() {
                System.out.println("toString");
                Cliente instance = new Cliente();
                String expResult = "";
                String result = instance.toString();
                assertEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
                fail("The test case is a prototype.");
        }
        
}
