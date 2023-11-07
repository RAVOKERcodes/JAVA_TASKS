package TASK;

import java.util.ArrayList;
import java.util.List;

class details{
	private int pID;
	private String pName;
	private String pBloodGroup;
	private int pAge;
	private String pGender;
	private long pcontact;
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpBloodGroup() {
		return pBloodGroup;
	}
	public void setpBloodGroup(String pBloodGroup) {
		this.pBloodGroup = pBloodGroup;
	}
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public String getpGender() {
		return pGender;
	}
	public void setpGender(String pGender) {
		this.pGender = pGender;
	}
	public long getpcontact() {
		return pcontact;
	}
	public void setpcontact(int pcontact) {
		this.pcontact = pcontact;
	}
	public details(int pID, String pName, String pBloodGroup, int pAge, String pGender, long l) {
		super();
		this.pID = pID;
		this.pName = pName;
		this.pBloodGroup = pBloodGroup;
		this.pAge = pAge;
		this.pGender = pGender;
		this.pcontact = l;
	}
}
class bass{
	private List<details> obj = new ArrayList<>();

	public List<details> getObj() {
		return obj;
	}
	public void setObj(List<details> obj) {
		this.obj = obj;
	}
    public void adddetails(details Obj) {
        obj.add(Obj);
    }
    public List<details> viewAlldetails() {
        return obj;
    }
    public List<details> viewpatientbybloodAndAge(String BG, int minAge) {
        List<details> detailforbloodAndAge = new ArrayList<details>();
        for (details detail : obj) {
            if (detail.getpBloodGroup().equals(BG) && detail.getpAge() > minAge) {
                detailforbloodAndAge.add(detail);
            }
        }
        if (detailforbloodAndAge.isEmpty()) {
            System.out.println("No matching records found.");
        }
        return detailforbloodAndAge;
    }

}
public class task_30_serialization_pojo_patient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bass B = new bass();
		B.adddetails(new details(11 ,"ram","+o",22,"M",9999999999L));
		B.adddetails(new details(12 ,"r","+b",2,"f",9999999999L));
		B.adddetails(new details(13 ,"m","+a",22,"M",9999999999L));
		B.adddetails(new details(13 ,"m","+b",2,"M",9999999999L));
		B.adddetails(new details(13 ,"m","+o",2,"f",9999999999L));
		B.adddetails(new details(13 ,"m","+a",22,"M",9999999999L));
        List<details> alldetails = B.viewAlldetails();
        System.out.println("orignal details");
        for (details detail : alldetails) {
            System.out.println(detail.getpID()+" "+detail.getpName()+" "
            					+detail.getpBloodGroup()+" "+detail.getpAge()+" "
            					+detail.getpGender()+" "+detail.getpcontact());
	}      
        String BG= "+o";
        int AGE=20;
        List<details> detailforblood = B.viewpatientbybloodAndAge(BG,AGE);
        System.out.println("\npatients for bloodgroup " + BG+" and age greater then"+ AGE+":");
        for (details detail : detailforblood) {
            System.out.println(detail.getpID()+" "+detail.getpName()+" "
					+detail.getpBloodGroup()+" "+detail.getpAge()+" "
					+detail.getpGender()+" "+detail.getpcontact());
        } 
}}