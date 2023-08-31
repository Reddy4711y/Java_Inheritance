package example.inheritance;

//Multilevel Inheritance

// 2G
class Two_G{
	public void Calling() {
		System.out.println("calling");
	}
	public void Sms() {
		System.out.println("Sms");
	}
}

//3G
class Three_G extends Two_G{
	public void Gprs() {
		System.out.println("Gprs");
	}
}

//4G
class Four_G extends Three_G{
	public void Votle(){
	System.out.println("Votle network");
	}
}

//5G
class Five_G extends Four_G{
	public void FiveGplus() {
		System.out.println("5G+");
	}
}



public class Sim_Inheritance {
   public static void main(String[] args){
	Five_G fivegObj=new Five_G();
	fivegObj.Calling();
	fivegObj.Sms();
	fivegObj.Gprs();
	fivegObj.Votle();
	fivegObj.FiveGplus();

}
}
