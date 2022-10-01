package p3;

public class Account1 {
	private long accountNumber;
	private String username;
	private String password;
	private int balance;
	private KYCverification KYCdetails;
	private contactDetails contactDetails;
	private int cashBack;
	
	private Account A1;
	
	public Account1(long accountNumber,String username,  String password,int balance) {
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



