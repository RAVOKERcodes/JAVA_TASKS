package TASK;


abstract class Plan{                         //abstruct class
	protected double rate;
	abstract void getRate();
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}										//can not make abstruct class object use sub classes then make there obj
}
class DomesticPlan extends Plan{

	@Override
	public void getRate() {
		// TODO Auto-generated method stub
		rate=3.50;
	}
class Comertialplan extends Plan{

	@Override
	public void getRate() {
		// TODO Auto-generated method stub
		rate=7.50;
		}
}
class Institutionalplan extends Plan{

	@Override
	public void getRate() {
		// TODO Auto-generated method stub
		rate=5.50;
		}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////
class GetPlanFactory{
	public Plan getPlan(String planType) {
		if(planType==null) {
			return null;
		}
		if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("COMMERTIALPLAN")) {
			return new Comertialplan();
		}
		else if(planType.equalsIgnoreCase("Institutionalplan")) {
			return new Institutionalplan();
		}
		return null;	
	}
}
}
public class task16_abstract_class {
	public static void main(String args[]) {
		
//		Plan p=new DomesticPlan();
//		p.getRate();//AM
//		p.calculateBill(100);//CM
		
		complete krna h abhi dumb ass
		
	}

}
