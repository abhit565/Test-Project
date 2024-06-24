package com.abhi.india;

public class EmailApp 
{
	public static void main(String[] args) {
		Email em=new Email("abhi", "thakur");
		em.setAlternateEmail("poonam@gmail.com");
		System.out.println(em.getAlternateemail());
		System.out.println(em.showInfo());
	}

}
