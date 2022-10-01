package p3;

public class contactDetails {
private	String houseNumber;
private String localityName;
private String cityName;
private String StateName;
private String countryName;
private long pincode;
private long mobileNumber;
private String emailId;
	public contactDetails() {
	super();
	this.houseNumber = houseNumber;
	this.localityName = localityName;
	this.cityName = cityName;
    this.StateName = StateName;
    this.countryName = countryName;
    this.pincode = pincode;
    this.mobileNumber = mobileNumber;
    this.emailId = emailId;
	}
    	public String gethouseNumber() 
    	{
    		return houseNumber;
    	}
    		public void setHouseNumber(String housenumber) 
    		{
    			this.houseNumber=houseNumber;
    		}
    		public String getLocalityName() 
    		{
        		return localityName;}
        		public void setlocalityNmae(String localityName) 
        		{
        			this.localityName=localityName;
        			}
        		public String getcityName() 
        		{
            		return cityName;}
            		public void setcityname(String cityName)
            		{
            			this.cityName=cityName;
            			}
            		public String getstateName() 
            		{
                		return StateName;}
                		public void setstateName(String stateName) 
                		{
                			this.StateName=StateName;
                			}
                		public String getcountryName()
                		{
                    		return countryName;}
                    		public void setcountryNmae(String countryName) {
                    			this.countryName=countryName;
                    			}
                    		public long getpincode()
                    		{
                        		return pincode;}
                        		public void setpincode(long pinCode) {
                        			this.pincode=pinCode;
                        			}
                        		public long getmobilenumber() {
                            		return mobileNumber;}
                            		public void setmobilenumber(long mobileNumber) {
                            			this.mobileNumber=mobileNumber;
                            		}
                            		public String getemailid() 
                            		{
                                		return emailId;}
                                		public void setemailid(String emailId) {
                                			this.emailId=emailId;
                                			}
                                		public String toString() {
                                			return "contactDetails [houseNumber="+houseNumber+",localityName="+localityName+",cityName="+cityName+",stateName="+StateName+",countryName="+countryName+",pincode="+pincode+",mobilenumber="+mobileNumber+",emailId="+emailId+"]";
                                		
                                		}
                            		
                        		}
    
			


