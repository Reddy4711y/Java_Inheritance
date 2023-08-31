package example.inheritance;

public class Main_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		creating object for user class to access 
		User userObj=new User();
		
		userObj.Read();
		
//		creating object for Developer  class
		Developer devObj=new Developer();
		devObj.Read();
		devObj.Write();
//		creating object for Admin  class
		Admin adminObj=new Admin();
		adminObj.Read();
		adminObj.Write();
		adminObj.Manage();
	}

}
