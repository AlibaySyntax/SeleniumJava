package com.syntax22Overload;
public class Bank {

double money,fee;

public Bank(double money) {
this.money=money;
}
double chargeFee() {
if(money<1000) {
fee=money*01;
}else {
	fee=0;
}
return fee;
}
}
class  BOA extends Bank{
public BOA(double money) {
super(money);
}

double chargeFee() {//overridden method
if(money<1000) {
fee=money*0.2;
}else {
fee=0;
}
return fee;
}}
class TD extends Bank{
public TD(double money) {
super(money);
}

double chargeFee() {
if(money<1000) {
fee=money*03;
}else {
	fee=0;
}
return fee;
}}
class PNC extends Bank{
public PNC(double money) {
super(money);
}

double chargeFee() {//overriding method
if(money<1000) {
fee=money*0.4;
}else {
fee=0;
}
return fee;
}}