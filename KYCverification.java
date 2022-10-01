package p3;

public class KYCverification {
	String panNumber;
	long adharNumber;
	String documentType;
	String documentNumber;
	public KYCverification() {
	super();
	this.panNumber = panNumber;
	this.adharNumber = adharNumber;
	this.documentType = documentType;
    this.documentNumber = documentNumber;
	}
    public String panNumber() 
    {
		return panNumber;
		}
		public void setpanNumber( String panNumber) 
		{
			this.panNumber=panNumber;
		}
		public long getadharNumber()
		{
    		return adharNumber;
    		}
    		public void setadharNumber(long adharNumber) 
    		{
    			this.adharNumber=adharNumber;
    		}
    		public String gedocumentType()
    		{
        		return documentType;
        		}
        		public void setdocumenttype(String documentType) 
        		{
        			this.documentType=documentType;
        		}
        		public String gedocumentNo() 
        		{
            		return documentNumber;
            		}
            		public void setdocumentNo(String documentNo) 
            		{
            			this.documentNumber=documentNo;}
            		
        public String toString() {
	return "KYCverification [panNumber="+panNumber+",adharNumber="+adharNumber+",documentType="+documentType+",documentNo="+documentNumber+"]";
