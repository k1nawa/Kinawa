/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adminb
 */
public class Table2 {
    private String name;
    private int leg;

    public Table2() {
    }

    public Table2(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public String getName() {
        String s="";
        s= name.substring(name.length()-3);
        Character.toLowerCase(s.charAt(2));
        return s;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    
}
