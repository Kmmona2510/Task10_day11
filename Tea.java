package tasks10_Day11;
//Q5
public class Tea {    //Create a class Tea
	
	public String prepareTea() {
	String a=	"Make a Hot water add tea leaves";
	
		return a;
	}
	public String addmilk() {
		String am="Add milk to the Tea decotion";
		return am;
	}
	
	public String addSugar() {
	String as="Add sugar as per taste";
		return as;
	}
	
	//Q7
    public static void main(String[] args) {
    	
    	Tea obj=new Tea();
    	BlackTea bt=new BlackTea();
    	Greentea gt=new Greentea();
    	Herbaltea ht=new Herbaltea();
    String tea[] =new String[6];
    tea[0] =obj.prepareTea();
    tea[1] =obj.addmilk();
    tea[2]=obj.addSugar();
    tea[3]=bt.prepareTea();
    tea[4]=gt.prepareTea();
    tea[5]=ht.prepareTea();
    
    for(int i=0;i<6;i++) {
    	System.out.println(tea[i]);
    }
	
}
}
