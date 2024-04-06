package org.example.c19namingconvention;

public class MainScopeCheck1 {
    public static void main(String[] args) {
        String privateVar = "this is private to main()";

        ScopeCheck1 scopeInstance = new ScopeCheck1();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
        System.out.println("***********************************");
        ScopeCheck1.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
