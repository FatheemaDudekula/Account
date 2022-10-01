package p3;

import java.util.Scanner;
import java.util.Random;
import entity.Account;
public class mainAccount {
	Account allAccounts[] = new Account[500000];
	int noOfAccounts = 0; // count of account
	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		mainAccount  app = new mainAccount();
		
		while(true)
		{
			System.out.println("\n\n\n\n ===== WebSite links (actions what user can do) ==== ");
			System.out.println("0. EXIT");
			System.out.println("1. submit user detail ");
			System.out.println("2. do deposit operation ");
			System.out.println("3. do withdrawl operation ");
			System.out.println("4. print user all detail ");
			System.out.println("5. print user contact detail ");
			System.out.println("6. print user KYC document detail ");
			System.out.println("7. print balance ");
			System.out.println("8. change mobile no");
			System.out.println("9. change emailid");
			System.out.println(" Enter option [0-9] :- ");
		}	
			switch (app.sc.nextInt()) {
			
			case 0:
				System.exit(0);
				break;

			case 1:
				app.submitUserDetail();
				break;
				
			case 2:
			   app.doDepositOperation();
				break;
			
			case 3:
				app.dowithDrawOperation();
				break;
			
			case 4:
				app.printUserAllDetail();
				break;
			
			case 5:
				app.viewContactDetails();
				break;
			case 6:
				app.viewKYCDetails();
				break;
			case 7:
				app.printBalance();
				break;
			case 8:
				app.changeMobileNumber();
			    break;
			
			case 9:
				app.changeEmailId();
				break;
			default:
				System.out.println("Invalid Option ...");
			}
	}//end switch
			
}
		
		public void submitUserDetail()
		{
			Random myRandom=new Random();
			long accNo=sc.nextInt();
			System.out.println("enter the user name: ");
			String name=sc.nextLine();
			System.out.println("enter the pass word: ");
			String passWord=sc.nextLine();
			System.out.println("enter the balance: ");
			String balance =sc.nextLine();
			System.out.println("enter the pan number: ");
			String panNo=sc.nextLine();
			System.out.println("enter the adhar number: ");
			String adharNo=sc.nextLine();
			System.out.println("enter the document types: ");
			String doctypes=sc.nextLine();
			System.out.println("enter the document Number: ");
			String docNo=sc.nextLine();
			System.out.println("enter the house Number: ");
			String houseNo=sc.nextLine();
			System.out.println("enter the locality name: ");
			String locName=sc.nextLine();
			System.out.println("enter the city name: ");
			String cityName=sc.nextLine();
			System.out.println("enter the state name: ");
			String stateName=sc.nextLine(); 
			System.out.println("enter the country name: ");
			String countryName=sc.nextLine();
			System.out.println("enter the pan code: ");
			String panNumber=sc.nextLine();
			System.out.println("enter the mobile number: ");
			String mobileNumber=sc.nextLine();
			System.out.println("enter the email id: ");
			String emailId=sc.nextLine();
			
			contactDetails  contatDetails= new contactDetails(houseNo,locName, cityName,stateName,countryName,pincode,mobileNumber,emailId);
			KYCverification Kycverfication=new KYCverification(panNumber,adharNo,doctypes,docNo);
			Account1 a=new Account(AccountNumber,userName,passWord,balance);
			a.setKycDetails(Kycdetails);
			a.setcontactDetails(contatDetails);
			allAccounts[noOfAccounts++]=a;
			System.out.println("+a+");
			System.out.println("added in the List:");
		}
			
			public void doDepositOperation() 
			{
			System.out.println("enter the accountnumber in which the amount should be deposited:");
			String accNumber=sc.nextLine();
			System.out.println("enter the amount to be deposit:");
			String amount=sc.nextLine();
			
			for(int i = 0;i< noOfAccounts ;i++)
			{
			    Account1 a = allAccounts[i];
			     boolean isFound=(a.getAccountNumber() == accNumber)?true:false;
			     
			     if(isFound)
			     {
			    	 a.setBalance(a.getbalance() +amount);
			    	 System.out.println("amount tranfer done");
			    	 System.out.println(a.getAccountNumber()+"-"+a.getbalance());}
			}}
			public void dowithDrawOperation() {
				 System.out.println("enter the accountnumber to withdraw the amount:");
					String withDraw=sc.nextLine();
					System.out.println("enter the amount to take from the account");
					String amount=sc.nextLine();
					Account1 account=null;
					boolean foundAccount=false;
					for(int i = 0;i< noOfAccounts ;i++)
					{
					    Account1 a = allAccounts[i];
					    boolean isFound=(a.getaccountNumber() == withDraw)?true:false;
					    
					    if(foundAccount)
					{ 
					    	a.setBalance("a.getBalance()-amount");
					}
						
						
						System.out.println("withdraw of amount has been done");
						System.out.println("check balance");
						System.out.println(a.getAccountNumber()+"-"+a.getbalance());}
					}
					public void printUserAllDetail() {
						System.out.println("enter the account Number:");
						long searchAccNo=sc.nextInt();
						Account1 a=getAccount(searchAccNo);
						System.out.println(a);
					}
					public void viewContactDetails() {
						System.out.println("enter the account Number:");
						long searchAccNo=sc.nextInt();
						Account1 a = getaccount(searchAccNo);
						System.out.println(a.getcontactDetails());
					}
					public void viewKYCDetails() {
						System.out.println("enter the account Number:");
						long searchAccNo=sc.nextInt();
						Account1 a = getAccount(searchAccNo);
						System.out.println(a.getKYCverfication());
					}
					public void printBalance() {
						System.out.println("enter the account Number:");
						long searchAccNo=sc.nextInt();
						Account1 a = getAccount(searchAccNo);
						System.out.println(a.getprivate long accountNumber;
						private String username;
						private String password;
						private int balance;
						private KYCverification KYCdetails;
						private contactDetails contactDetails;
						private int cashBack;
						
						private Account A1;
						
						public Account(long accountNumber,String username,  String password,int balance) {
							super();
							this.accountNumber = accountNumber;
							this.username = username;
							this.password= password;
						    this.balance = balance;
						}
						    public long getAccountNumber() 
					    	{
					    		return accountNumber;}
					    		public void setAccountNumber(long  accountNumber) 
					    		{
					    			this.accountNumber=accountNumber;
					    		}
					    		
					        		public String getusername() 
					            	{
					            		return username;}
					            		public void setUserName(String UserName) 
					            		{
					            			this.username=username;
					            		}
					            		public String getpassWord() 
					                	{
					                		return password;}
					                		public void setpassWord(String passWord) 
					                		{
					                			this.password=passWord;
					                		}
					                		public int getbalance() 
					                    	{
					                    		return balance;}
					                    		public void setBalance(int Balance) 
					                    		{
					                    			this.balance = balance;
					                    		}
					                    		public KYCverification getKYCDetails() 
					                        	{
					                        		return KYCdetails;}
					                        		public void setKYCDetails(KYCverification KYCdetails) 
					                        		{
					                        			this.KYCdetails = KYCdetails;
					                        		}
					                        		public contactDetails getcontactDetails() 
					                            	{
					                            		return contactDetails;}
					                            		public void setcontactDetails( contactDetails contactdetails) 
					                            		{
					                            			this.contactDetails = contactDetails;
					                            		}
					                        		
							
					                 public String toString() {
					                	 return  "Account[accountNumber="+accountNumber+",userNmae="+username+",passWord="+password+", balance="+balance+",KYCdetails="+KYCdetails+",contactdetails="+contactDetails+"]";
					                 }

						

					}
);
					}
						
			public void changeEmailId()
			{
				System.out.println("enter the Account Number:"); 
				long searchAccNo=sc.nextInt();
				Account1 a=getAccount(searchAccNo);
				long previousEailID=a.getcontactDetails().getemailid();
				System.out.println(previousEailID);
				System.out.println("Enter the Email ID:");
				long email=sc.nextInt();
				a.getcontactDetails().setEmailId(email);
				System.out.println("Email ID"+a.getcontactDetails().getemailid());
			}
			public void changeMobileNumber()
			{
				System.out.println("enter the Account Number:"); 
				long searchAccNo=sc.nextInt();
				Account1 a=getAccount(searchAccNo);
				long previousMobileNumber=a.getcontactDetails().getmobilenumber();
				System.out.println(previousMobileNumber);
				System.out.println("Enter the mobile number:");
				long MobileNumber=sc.nextInt();
				a.getcontactDetails().setmobilenumber(MobileNumber);
				System.out.println("mobileNumber"+a.getcontactDetails().getmobilenumber());
			}
				
			}
				 
			
		
		
		 
			
			
			

					
					
					