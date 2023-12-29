/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adminb
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        int count =0;
        String [] mang = str.trim().split(" ");
        for(int i=0;i<mang.length;i++){
            if(checkStringPalindrome(mang[i])&& mang[i].length()>=2){
                count++;
            }
        }
        return count;
    }

    public static boolean checkStringPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    
    @Override
    public String f2(String str) {
        String result ="";
        int count=0;
        String [] mang = str.trim().split(" ");
        result = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if(result.length()<mang[i].length()&&count ==0){
                result=mang[i];
                count++;
        }
    }
        return result;
    
}
}
