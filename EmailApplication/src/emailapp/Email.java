package emailapp;

import java.util.*;
public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordlength=10;
	private String email;
	private String suffix="comapny.com";
	
	//Constructor for first name and the last name
	public Email(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		
		
		//Call method setDepartment -returns the department name
		this.department=setDepartment();
		
		
		//Call a method to create a random password
		
		this.password=randomPassword(defaultPasswordlength);
		System.out.println("Your password is "+password);
		
	// Combine elements to generate email
		email=firstName.toLowerCase()+ "." +lastName.toLowerCase() + "@" +department + "." + suffix;
		
	}
	//Ask for the departments
	private String setDepartment()
	{
		System.out.println("New Worker "+firstName+" Enter the department number \n1.For Sales\n2.For developer\n3.For Accounting\n0.Others");
		Scanner sc=new Scanner(System.in);
		int depChoice=sc.nextInt();
		if(depChoice==1)		return "Sales";
		else if(depChoice==2)	return "Developers";
		else if(depChoice==3)   return "Accounting";
		else			return"Others";
		
	}
	
	//generate the random password
	private String randomPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@$&#";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random() * (passwordSet.length()));
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//Set the mail box capacity
	public void setMailBoxCapacity(int capacity)
	{
		this.mailboxCapacity=capacity;
	}
	//Set the alternate email
	
	public void setAlternativeEmail(String email)
	{
		this.alternateEmail=email;
	}
	//Change the password
	public void changePassword(String pass)
	{
		this.password=pass;
	}
	
	public int getMailBoxCapacity() {return mailboxCapacity;}
	
	public String getAlternativeEmail() {return alternateEmail;}
	
	public String getPassword() {return password;}
	
	public String displayInfo()
	{
		return "DISPLAY NAME "+firstName +" "+ lastName +
				"\nCOMPANY MAIL "+ email +
				" \nMAILBOX CAPACITY " +mailboxCapacity+" mb";
	}
	}
	

