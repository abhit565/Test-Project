package com.abhi.india;

import java.util.Scanner;

public class Email 
{
private String firstname;
private String lastname;
private String department;
private String company;
private String email;
private String password;
private int mailboxcapacity=500;
private String alternateEmail;
private int defaultPasswordLength=10;
private String companysuffix="abhicompany.com";

//constructor to receive the first name and last name
public Email(String firstnname, String lastname)
{
	this.firstname=firstnname;
	this.lastname=lastname;
	System.out.println("Email Created : " + this.firstname + " " + this.lastname);
	//call a method to asking for the department and return the department
	this.department=setDepartment();
	System.out.println("department : "+this.department);
	
	this.password=randomPassword(defaultPasswordLength);
	System.out.println("your pwd : "+this.password);
	//call a method that returns a random pwd
	
	
	
	//combine egfglets to generate email
	email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companysuffix;
	System.out.println("your email is : "+email);
}


//ask for the department
private String setDepartment()
{

	System.out.print("new worker:"+firstname+ "department codes \n 1 for sales\n 2 for development \n 3 for accounting \n 0 for none \n enter the department ");
	Scanner in=new Scanner(System.in);//to read that
	int depchoice=in.nextInt(); //will enter 0 0r 2 , based on that it will set the department
	if(depchoice==1) {return "sales";}
	if(depchoice==2) {return "dev";}
	if(depchoice==3) {return "acct";}
	else {return "";}
	
}

//generate a random password
private String randomPassword(int length )
{
String pwdset="ABCDFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*()_+";  //what we r choosing from
char[] password=new char[length];
for(int i=0;i<length;i++)//iterate through value of the length
{
	int rand=(int) (Math.random()*pwdset.length());
	password[i]=pwdset.charAt(rand);//Inside the loop, this line assigns a randomly selected character from pwdset to password[i].
}
return new String(password);  //The method converts the character array ch to a String using the new String(ch) constructor and returns it as the generated password.
		
}


//set the mailbox capacity

public void setMailBoxCpacity(int capacity)
{
	this.mailboxcapacity=mailboxcapacity;
	
}
//set the alternate email
public void setAlternateEmail(String altemail)
{
	this.alternateEmail=altemail;
	
}
//change the password
public void chabgePassword(String password)
{
	this.password=password;
	
}
public int getmailboxcapcity()
{
	return mailboxcapacity;
}
public String getAlternateemail()
{
	return alternateEmail;
}
public String Getpassword()
{
	return password;
}
public String showInfo()
{
return "display name :"  + firstname + " " + lastname+
	"\ncompany email : " + email +
	"\nmail box capacity : " + mailboxcapacity + "mb";
}


}
