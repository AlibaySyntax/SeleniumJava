package com.syntax.syntax17StatickeywordREVERS;
public class StaticKeywordTest {

public static void main(String [] args) {
//access static members of anotherclass
StaticKeyword.brand="Android";
StaticKeyword.touchScreen=true;
StaticKeyword.displayGeneralInfo();

//access instance members of another class
StaticKeyword sk=new StaticKeyword();
sk.color="Red";
sk.memory=164;
sk.displaySpecifications();

StaticKeyword sk1=new StaticKeyword();
sk1.color="Blue";
sk1.memory=264;
sk1.brand="Samsung";

StaticKeyword sk2=new StaticKeyword();
sk2.color="Green";
sk2.memory=364;
sk2.brand="Nokia";//Brand will change all instance

sk2.displayGeneralInfo();
sk1.displayGeneralInfo();
sk.displayGeneralInfo();
}
}
