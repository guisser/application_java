package interface_graphique;
import java.sql.*;

import javax.swing.table.DefaultTableModel;

public class Methodes {
	
	static Connection conn= Utilitaire.getConnection();
	
	// methodes qui concernent postes 
	
	public void ajouter_poste(String id_poste, String libelle_poste,String grade, String departement,String date_occupation,String id_agent) 

	{try {
		
		PreparedStatement ps= conn.prepareStatement ("INSERT INTO POSTE (ID_POSTE,LIBELLé_POSTE,GRADE,DEPARTEMENT_POSTE,DATE_OCCUPATION,ID_AGENT) VALUES (?,?,?,?,?,?)");
		ps.setString(1, id_poste);
		ps.setString(2, libelle_poste);
		ps.setString(3, grade);
		ps.setString(4, departement);
		ps.setString(5, date_occupation);
		ps.setString(6, id_agent);
		ps.executeUpdate();
	
		}
	catch( Exception e)
	{
	System.err.println(e);
	}
	
	}

public void supprimer_poste(String id_poste)
{
	try {
		PreparedStatement ps= conn.prepareStatement("DELETE FROM POSTE WHERE ID_POSTE LIKE ?");
		ps.setString(1, id_poste);
		ps.executeUpdate();
		}
	catch(Exception e)
	{System.err.println(e);}
}

public static void rechercher_poste(String id_poste ,DefaultTableModel table2)
{
	{
		try
		{PreparedStatement ps=conn.prepareStatement("SELECT * FROM POSTE WHERE ID_POSTE LIKE ? ");
		ps.setString(1,id_poste);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		
			{table2.addRow(new Object [] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
					});}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
}

public static void afficher_poste (String id_agent ,DefaultTableModel table2)
{{
	try
	{PreparedStatement ps=conn.prepareStatement("SELECT * FROM POSTE WHERE ID_agent LIKE ? ");
	ps.setString(1,id_agent);
	ResultSet rs = ps.executeQuery();
	while(rs.next())
	
		{table2.addRow(new Object [] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
}

public void modifier_poste(String id_poste,  String libelle_poste,String grade, String departement,String date_occupation,String id_agent) 

{try {
	
	PreparedStatement ps= conn.prepareStatement ("UPDATE POSTE SET LIBELLé_POSTE =?,GRADE = ?,DEPARTEMENT_POSTE =?, DATE_OCCUPATION =?, ID_AGENT =?  WHERE ID_POSTE LIKE ?");
	ps.setString(1, libelle_poste);
	ps.setString(2, grade);
	ps.setString(3, departement);
	ps.setString(4, date_occupation);
	ps.setString(5, id_agent);
	ps.setString(6, id_poste);
	ps.executeUpdate();

	}
catch( Exception e)
{
System.out.println(e);
}

}
// methodes qui concernent grade *****************************************

public void ajouter_grade(String id_grade, String libelle_grade,String date_obtention, String id_agent) 

{try {
	
	PreparedStatement ps= conn.prepareStatement("INSERT INTO GRADE (ID_GRADE,LIBELLE_GRADE,DATE_OBTENTION,ID_AGENT) values (?,?,?,?)");
	ps.setString(1, id_grade);
	ps.setString(2, libelle_grade);
	ps.setString(3, date_obtention);
	ps.setString(4, id_agent);
	ps.executeUpdate();
	}
catch( Exception e)
{
System.out.println(e);
}

}
public void supprimer_grade(String id_grade)
{
	try {
		PreparedStatement ps= conn.prepareStatement("DELETE FROM GRADE WHERE ID_GRADE LIKE ?");
		ps.setString(1, id_grade);
		ps.executeUpdate();
		}
	catch(Exception e)
	{System.err.println(e);
	}
}
public static void afficher_grade(String id_grade,DefaultTableModel table3)
{
	{
		try
		{PreparedStatement ps=conn.prepareStatement("SELECT * FROM GRADE WHERE ID_agent LIKE ? ");
		ps.setString(1,id_grade);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		
			{table3.addRow(new Object [] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),});}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
}
public static void rechercher_grade(String id_grade ,DefaultTableModel table) 
{
	{
		try
		{PreparedStatement ps=conn.prepareStatement("SELECT * FROM GRADE WHERE ID_GRADE LIKE ? ");
		ps.setString(1,id_grade);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		
			{table.addRow(new Object [] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	
}
public void modifier_grade(String id_grade, String libelle_grade,String date_obtention, String id_agent)
{
	{
		try {
			PreparedStatement ps=conn.prepareStatement("UPDATE GRADE SET LIBELLE_GRADE= ?,DATE_OBTENTION=?,ID_AGENT=? where id_grade like ?");
			ps.setString(1, id_agent);
			ps.setString(2, date_obtention);
			ps.setString(3, libelle_grade);
			ps.setString(4, id_grade);
     		ps.executeUpdate();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
}

// methodes qui concernent decision **************************************

public void ajouter_decision(String id_decision, String id_agent,String id_poste, String visa) 

{try {
	
	PreparedStatement ps= conn.prepareStatement("INSERT INTO DECISION(ID_DECISION,ID_AGENT,ID_POSTE,VISA) values (?,?,?,?)");
	ps.setString(1, id_decision);
	ps.setString(2, id_agent);
	ps.setString(3, id_poste);
	ps.setString(4, visa);
	
	ps.executeUpdate();
	}
catch( Exception e)
{
System.err.println(e);
}
}
public void supprimer_decision(String id_decision)
{
	try {
		PreparedStatement ps= conn.prepareStatement("DELETE FROM DECISION WHERE ID_DECISION LIKE ?");
		ps.setString(1, id_decision);
		ps.executeUpdate();
		}
	catch(Exception e)
	{System.err.println(e);
	}
}

public  void rechercher_decision(String id_decision ,DefaultTableModel tab)
{
	try
	{PreparedStatement ps=conn.prepareStatement("SELECT * FROM DECISION WHERE ID_DECISION LIKE ? ");
	ps.setString(1,id_decision);
	ResultSet rs = ps.executeQuery();
	while(rs.next())
	
		{tab.addRow(new Object [] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});}
	}
	catch(Exception e)
	{
		System.err.println(e);
	}
}

public static void afficher_decision (String id_decision,DefaultTableModel tab) 
{
	{
		try
		{PreparedStatement ps=conn.prepareStatement("SELECT * FROM decision WHERE ID_agent LIKE ? ");
		ps.setString(1,id_decision);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		
			{tab.addRow(new Object [] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),});}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
}


public void modifier_decision(String id_decision, String id_agent, String id_poste, String visa)
{
	{
		try {
			PreparedStatement ps=conn.prepareStatement("UPDATE DECISION SET id_agent= ?,id_poste=?,visa=? where id_decision like ?");
			ps.setString(1, id_agent);
			ps.setString(2, id_poste);
			ps.setString(3, visa);
			ps.setString(4, id_decision);
     		ps.executeUpdate();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}

}