/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adminb
 */
public class Taxi2 {
        private String driver;
        private int age;

    public Taxi2() {
    }

    public Taxi2(String driver, int age) {
        this.driver = driver;
        this.age = age;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return driver + "," + age ;
    }

    
}   