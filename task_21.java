package TASK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

interface creditcard{
	public void givebankdetails();
	public String getcreditcard();
}

 class bankdetails{
	private String bankname;
	private String accholdername;
	private long accnumber;
	
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccholdername() {
		return accholdername;
	}
	public void setAccholdername(String accholdername) {
		this.accholdername = accholdername;
	}
	public long getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(long accnumber) {
		this.accnumber = accnumber;
	}
}
	

 	 class bankcustomer extends bankdetails implements creditcard{
 		public void givebankdetails() {
 			try {
 				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 				
 				System.out.println("Enter the account holder name: ");
 				String customername=br.readLine();
 				System.out.print("");
 			
 				System.out.println("Enter the account number: ");
 				long accno=Long.parseLong(br.readLine());
 				System.out.print("");
 				
 				
 				System.out.print("Enter the bank name: ");
 				String bankname=br.readLine();
 				
 				setAccholdername(customername);
 				setAccnumber(accno);
 				setBankname(bankname);
 				}
 			catch(Exception e) {
 				e.printStackTrace();
 			}
 	}

 		public String getcreditcard() {
 			long accno=getAccnumber();
 			String accholdername=getAccholdername();
 			String bname=getBankname();
 			
 			return("The account number "+accno+" of "+accholdername+" in "+bname+" bank is valid for issuing the credit card ");
 		}
 	}
public class task_21 {
	public static void main(String args[]){  
		  creditcard  targetInterface=new bankcustomer();  
		  targetInterface.givebankdetails();  
		  System.out.print(targetInterface.getcreditcard());  
		 }   
		}
