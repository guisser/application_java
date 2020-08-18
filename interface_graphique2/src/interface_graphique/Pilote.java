package interface_graphique;

public class Pilote {
	public void chargerpiloe()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("succes");
		}
		catch(ClassNotFoundException e) {
			System.err.println(e);
		}
	

}}
