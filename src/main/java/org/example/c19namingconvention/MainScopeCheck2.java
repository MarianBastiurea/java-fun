package org.example.c19namingconvention;

public class MainScopeCheck2 { public static void main(String[] args) {
    String varFour = "this is private to main()";

    ScopeCheck2 scopeInstance = new ScopeCheck2();
    scopeInstance.useInner();

    ScopeCheck2.InnerClass innerClass = scopeInstance.new InnerClass();
    System.out.println("varThree is not accessible here " + innerClass.varThree);
//
//        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//
//        scopeInstance.timesTwo();
//        System.out.println("***********************************");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
}
}
