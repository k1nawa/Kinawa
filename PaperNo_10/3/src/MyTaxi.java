
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adminb
 */
public class MyTaxi implements ITaxi{

   @Override
    public int f1(List<Taxi> t) {
        int numberOfSalarys=0;
        for(Taxi taxi : t){
            if(taxi.getDriver().length()>=2){
                if(!isPalindrome(taxi.getDriver())){
                    numberOfSalarys+=taxi.getSalary();
                }
            }
        }
        return numberOfSalarys;
    }

    //C1:
    public boolean isPalindrome(String word) {
    int length = word.length();
    for (int i = 0, j = length - 1; i < j; i++, j--) {
        if (word.charAt(i) != word.charAt(j)) {
            return false;
        }
    }
    return true;
}
    
    //C2:
    public static boolean checkStringPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    @Override
    public void f2(List<Taxi> t) {
        int count =0;
        // Dung foreach se gay ra loi ConcurrentModificationException: Ngoai le xay ra dong thoi xay ra khi chay foreach va co xoa phan tu trong ArrayList
        // de tranh loi nay thi dung iterator
        for (Iterator<Taxi> iterator = t.iterator(); iterator.hasNext();) {
            Taxi taxi = iterator.next();
                // Vd: salary =6 => false; salary >=10
            if(taxi.getSalary()>=10){
                // Vd: 24 %10 = 4 %2 =0 => True va 24/10= 2%2=0 => True
            if(((taxi.getSalary()%10)%2==0) && ((taxi.getSalary()/10)%2==0)){
                // first time exists then remove
                if(count==0){
                    iterator.remove();
                }
                count++;
            } 
            } 
                
            }
 //C2:
   /*     int indexRemoveElement = -1;
        boolean checkIndexElementExits = false;
        for (int i = 0; i < t.size(); i++) {
            if (checkTwoEvenDigitsInSalary(t.get(i).getSalary())) {
                indexRemoveElement = i;
                checkIndexElementExits = true;
                break;
            }
        }
        if (checkIndexElementExits) {
            t.remove(indexRemoveElement);
        }*/
    }
    /*
    public static boolean checkTwoEvenDigitsInSalary(int salary) {
        String salaryToString = salary + "";
        int countNumberIsDigit = 0;
        for (int i = 0; i < salaryToString.length(); i++) {
            if (Integer.parseInt(salaryToString.charAt(i) + "") % 2 == 0) {
                countNumberIsDigit++;
            }
        }
        return countNumberIsDigit == 2;
    }*/

    @Override
    public void f3(List<Taxi> t) {
        Collections.sort(t,new Comparator<Taxi>(){
            @Override
            public int compare(Taxi o1, Taxi o2) {
                if(o1.getSalary()==o2.getSalary()){
                    return o1.getDriver().compareTo(o2.getDriver());
                }else return o2.getSalary()-o1.getSalary();
            }
            
        });
    }
    
}
