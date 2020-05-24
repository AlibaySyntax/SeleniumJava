package com.syntax.syntax20This;

public class ScrumTeam extends Employee {
	
String ceremonies;
String attendMitings;
String prioritizeBacklog;

void attendMitings() {	
System.out.println("Scrum team attend "+ceremonies);
}

class ProductOwner extends ScrumTeam{
void priortizeBacklog() {
System.out.println("PO prioritize product backlog");
}

class ScrumMaster extends ScrumTeam {
void navigateTeam() {
System.out.println("Scrum master faciliates Scrum team");
}

class Developer extends ScrumTeam {
void coding() {
System.out.println("Developer write codes");
}

class Testers extends ScrumTeam {
void Test() {
System.out.println("Testers ensures quality of coding");
}

class BusinessAnalysts extends ScrumTeam{
void contractOwner() {
System.out.println("Analyst communicate with Product Owner");	
}}}}}}}

