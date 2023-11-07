package TASK;
interface AnimalEat{
	void eat();	
}
interface AnimalTravel{
	void travel();
}
class snake implements AnimalEat,AnimalTravel{
	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("animal is eating");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("animal is traveling");
	}	
}
public class task_20_b {
	public static void main(String[] args) {
	//focus view
	//custom impl
		AnimalEat a=new snake();
		a.eat();
		AnimalTravel b=new snake();
		b.travel();	
	}
}
