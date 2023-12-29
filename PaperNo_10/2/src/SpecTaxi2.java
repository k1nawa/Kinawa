/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adminb
 */
public class SpecTaxi2 extends Taxi2{
        private int salary;

    public SpecTaxi2() {
    }

    public SpecTaxi2(int salary, String driver, int age) {
        super(driver, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.getDriver()+"," + super.getAge()+", "+salary ;
    }
    
    public void setData(){
        String s = super.getDriver();
        for(int i=0;i<s.length();i++){
            s= s.substring(0,1)+super.getAge()+s.substring(2);
        }
        super.setDriver(s);
    }
    
    public int getValue(){
        if(super.getAge()%2==0){
            return super.getAge();
        }else return super.getAge()+salary;
    }
        
        
}
