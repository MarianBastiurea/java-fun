package org.example.c01expression;

/*
We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
Write a first method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of the parameters is
 in range 13(inclusive) - 19 (inclusive). Otherwise return false.
 */
public class TeenNumberChecker {
    public static boolean hasTeen(int age1,int age2, int age3){
        boolean isTeenager=false;
        if (age1>=13&&age1<=19||age2>=13&&age2<=19||age3>=13&&age3<=19){
            isTeenager=true;
        }
        return isTeenager;

    }
}
