package interface_graphique;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;

public class frame_poste_decision_grade extends JFrame {
	
	private JPanel panel_par_defaut;
	
	// poste panels 
	private JPanel poste_pannel;
	private JPanel poste_pannel2;
	private JPanel poste_pannel3;
	private JPanel poste_pannel4;
	private JPanel poste_pannel5;
	private JPanel poste_pannel7;



	// grade panels
	private JPanel grade_pannel1;
	private JPanel grade_pannel5;
	private JPanel grade_pannel6;
	private JPanel grade_pannel3;
	private JPanel grade_pannel4;
	private JPanel grade_pannel2;

	// decision panels
	private JPanel decision_pannel1;
	private JPanel decision_pannel2;
	private JPanel decision_pannel3;
	private JPanel decision_pannel4;
	private JPanel decision_pannel5;
	private JPanel decision_pannel6;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame_poste_decision_grade frame = new frame_poste_decision_grade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frame_poste_decision_grade() {
		setBackground(UIManager.getColor("Button.background"));
		setSize(800,550);
		setResizable(false);
		setLocation(400,150);
		setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel_par_defaut = new JPanel();
		panel_par_defaut.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel_par_defaut);
		panel_par_defaut.setLayout(null);
		
		
		
		// panel  postes ************************************************************
		
		poste_pannel = new JPanel();
		poste_pannel.setBackground(UIManager.getColor("CheckBox.background"));
		poste_pannel.setBounds(0, 0, 800, 550);
		poste_pannel.setVisible(false);
		poste_pannel.setLayout(null);

		// pour l'ajout d'un poste******
		
	    poste_pannel2 = new JPanel();
		poste_pannel2.setBackground(UIManager.getColor("InternalFrame.background"));
		poste_pannel2.setBounds(0, 0, 800, 550);
		poste_pannel2.setVisible(false);
		poste_pannel2.setLayout(null);
		
		// pour la modification d'un poste*******
		
		poste_pannel3 = new JPanel();
		poste_pannel3.setBackground(UIManager.getColor("CheckBox.background"));
		poste_pannel3.setBounds(0, 0, 800, 523);
		poste_pannel3.setVisible(false);
		poste_pannel3.setLayout(null);
		
		// pour la suppression d'un poste*******
		
		poste_pannel4 = new JPanel();
		poste_pannel4.setBackground(UIManager.getColor("CheckBox.background"));
		poste_pannel4.setBounds(0, 0, 800, 550);
		poste_pannel4.setVisible(false);
		poste_pannel4.setLayout(null);
		
		// pour la recherche d'un poste*******
		
		poste_pannel5 = new JPanel();
		poste_pannel5.setBackground(UIManager.getColor("CheckBox.background"));
		poste_pannel5.setBounds(0, 0, 800, 550);
		poste_pannel5.setVisible(false);
		poste_pannel5.setLayout(null);
		
		// pour l'affichage des postes d'un agents*******
		
				poste_pannel7 = new JPanel();
				poste_pannel7.setBackground(UIManager.getColor("CheckBox.background"));
				poste_pannel7.setBounds(0, 0, 800, 550);
				poste_pannel7.setVisible(false);
				poste_pannel7.setLayout(null);
		
		

		// le panel pour la recherche  pour decision ****************************
		
		
		DefaultTableModel model_poste=new DefaultTableModel();
		model_poste.addColumn("id_poste");
		model_poste.addColumn("libelle_poste");
		model_poste.addColumn("grade");
		model_poste.addColumn("departement_poste");
		model_poste.addColumn("date_d'obtention");
		model_poste.addColumn("id_agent");
		
		JScrollPane scroll3=new JScrollPane();
		scroll3.setBounds(81,97,500,300);
		poste_pannel5.add(scroll3);


		JTable table_recherche_poste = new JTable(model_poste);
		scroll3.setViewportView(table_recherche_poste);
		
        JLabel lblNewLabel_poste = new JLabel("Resultats de recherche");
        lblNewLabel_poste.setForeground(SystemColor.textHighlight);
        lblNewLabel_poste.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_poste.setBounds(176, 22, 404, 47);
        poste_pannel5.add(lblNewLabel_poste);
		

		panel_par_defaut.add(poste_pannel5);

		
	
	// le pannel afficher postes
		
		
		
		DefaultTableModel model_poste_affichage=new DefaultTableModel();
		model_poste_affichage.addColumn("id_poste");
		model_poste_affichage.addColumn("libelle_poste");
		model_poste_affichage.addColumn("grade");
		model_poste_affichage.addColumn("departement_poste");
		model_poste_affichage.addColumn("date_d'obtention");
		model_poste_affichage.addColumn("id_agent");
		
		JScrollPane scroll_aff=new JScrollPane();
		scroll_aff.setBounds(40,140,680,600);
		poste_pannel7.add(scroll_aff);


		JTable table_afficher_poste = new JTable(model_poste_affichage);
		scroll_aff.setViewportView(table_afficher_poste);

	
        
        JLabel lblNewLabel_afficher1 = new JLabel("Saisir id_agent :");
		lblNewLabel_afficher1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_afficher1.setBounds(140, 35, 161, 45);
		poste_pannel7.add(lblNewLabel_afficher1);
		
		JTextField textField_afficher_poste= new JTextField();
		textField_afficher_poste.setBounds(350, 44, 217, 27);
		poste_pannel7.add(textField_afficher_poste);
		textField_afficher_poste.setColumns(10);
		
		JButton btn_OK_afficher_poste = new JButton("OK");
		btn_OK_afficher_poste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				
		            Methodes.afficher_poste(textField_afficher_poste.getText(), model_poste_affichage);
			}
		});
		btn_OK_afficher_poste.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_OK_afficher_poste.setBounds(500, 101, 89, 23);
		poste_pannel7.add(btn_OK_afficher_poste);
		
		JButton btnNewButton_retour_poste2 = new JButton("");
		btnNewButton_retour_poste2.setBorderPainted(false);
		btnNewButton_retour_poste2.setContentAreaFilled(false);
		btnNewButton_retour_poste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poste_pannel.setVisible(true);
				poste_pannel7.setVisible(false);
				model_poste_affichage.setRowCount(0);
				textField_afficher_poste.setText("");
			}
		});
		Image img10= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();

		btnNewButton_retour_poste2.setIcon (new ImageIcon(img10));
		btnNewButton_retour_poste2.setBounds(20, 20, 50, 50);
		poste_pannel7.add(btnNewButton_retour_poste2);
		
		
	
		panel_par_defaut.add(poste_pannel7);

		
		// le contenant du panne1 : panel poste
		
		JLabel lblNewLabeLgestion_poste = new JLabel("GESTION DES POSTES");
		lblNewLabeLgestion_poste.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		lblNewLabeLgestion_poste.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabeLgestion_poste.setFont(new Font("Bell MT", Font.BOLD, 27));
		lblNewLabeLgestion_poste.setBounds(0, 0, 800, 70);
		poste_pannel.add(lblNewLabeLgestion_poste);
		
		
		JLabel lbl_poste_10 = new JLabel("");
		Image img7= new ImageIcon(this.getClass().getResource("/poste.jpg")).getImage();
		lbl_poste_10.setIcon(new ImageIcon(img7));
		lbl_poste_10.setBounds(15, 19, 87, 51);
		poste_pannel.add(lbl_poste_10);
		
		
		JDesktopPane desktopPane_poste = new JDesktopPane();
		desktopPane_poste.setBackground(SystemColor.activeCaption);
		desktopPane_poste.setBounds(0, 11, 800, 70);
		poste_pannel.add(desktopPane_poste);
		
		
		JTextField textField_poste_11 = new JTextField();
		textField_poste_11.setFont(new Font("Bell MT", Font.PLAIN, 16));
		textField_poste_11.setBounds(102, 140, 608, 37);
		poste_pannel.add(textField_poste_11);
		textField_poste_11.setColumns(10);
	
		JButton btnNewButton_rechercher_poste = new JButton("");
		btnNewButton_rechercher_poste.setBorderPainted(false);
		btnNewButton_rechercher_poste.setContentAreaFilled(false);
		btnNewButton_rechercher_poste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				poste_pannel.setVisible(false);
				poste_pannel5.setVisible(true);
				Methodes.rechercher_poste(textField_poste_11.getText(), model_poste);		
				
			}
		});
		Image img4= new ImageIcon(this.getClass().getResource("/search.png")).getImage();
		btnNewButton_rechercher_poste.setIcon (new ImageIcon(img4));
		btnNewButton_rechercher_poste.setBounds(720, 130, 50, 50);
		poste_pannel.add(btnNewButton_rechercher_poste);
		
		
		JButton btnNewButton_afficher_poste = new JButton("");
		btnNewButton_afficher_poste.setBorderPainted(false);
		btnNewButton_afficher_poste.setContentAreaFilled(false);
		btnNewButton_afficher_poste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
		poste_pannel.setVisible(false);
		poste_pannel7.setVisible(true);
			}
		});
		
		Image img11= new ImageIcon(this.getClass().getResource("/historique.png")).getImage();
		btnNewButton_afficher_poste.setIcon (new ImageIcon(img11));
		btnNewButton_afficher_poste.setBounds(610, 443, 50, 50);
		poste_pannel.add(btnNewButton_afficher_poste);

		
		JButton btnNewButton_retour_poste = new JButton("");
		btnNewButton_retour_poste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poste_pannel.setVisible(false);
			// nom du pannel d'acceuil avec set visible true
				
			}
		});
		btnNewButton_retour_poste.setBorderPainted(false);
		btnNewButton_retour_poste.setContentAreaFilled(false);
        btnNewButton_retour_poste.setIcon (new ImageIcon(img10));
		btnNewButton_retour_poste.setBounds(40, 130, 50, 50);
		poste_pannel.add(btnNewButton_retour_poste);
	
		
		JButton btnajouter_poste = new JButton("");
		btnajouter_poste.setBorderPainted(false);
		btnajouter_poste.setContentAreaFilled(false);
		btnajouter_poste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				poste_pannel.setVisible(false);
				poste_pannel2.setVisible(true);
			}
		});
		btnajouter_poste.setBounds(58, 437, 56, 57);
		Image img1= new ImageIcon(this.getClass().getResource("/ajout.jpg")).getImage();
		btnajouter_poste.setIcon(new ImageIcon(img1));
		poste_pannel.add(btnajouter_poste);
		
		
		
		JButton btnmodifier_poste = new JButton("");
		btnmodifier_poste.setBorderPainted(false);
		btnmodifier_poste.setContentAreaFilled(false);
		btnmodifier_poste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poste_pannel.setVisible(false);
				poste_pannel3.setVisible(true);
				
			}
		});
		btnmodifier_poste.setBounds(250, 445, 49, 49);
		Image img2= new ImageIcon(this.getClass().getResource("/modifier.png")).getImage();
		btnmodifier_poste.setIcon(new ImageIcon(img2));
		poste_pannel.add(btnmodifier_poste);
		
		
		JButton btnsupprimer_poste = new JButton("");
		btnsupprimer_poste.setBorderPainted(false);
		btnsupprimer_poste.setContentAreaFilled(false);
		btnsupprimer_poste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poste_pannel.setVisible(false);
				poste_pannel4.setVisible(true);
				
			}
		});
		btnsupprimer_poste.setBounds(420, 437, 49, 57);
		Image img3= new ImageIcon(this.getClass().getResource("/trash-can.png")).getImage();
		btnsupprimer_poste.setIcon(new ImageIcon(img3));
		poste_pannel.add(btnsupprimer_poste);
		
		
		panel_par_defaut.add(poste_pannel);

	

		
	// pannel ajouer poste**************
	
		
		JLabel lblposte_1 = new JLabel("id_agent :");
		lblposte_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblposte_1.setBounds(160, 134, 121, 23);
		poste_pannel2.add(lblposte_1);
		
		JLabel lblposte_2 = new JLabel("id_poste :");
		lblposte_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblposte_2.setBounds(160, 57, 121, 23);
		poste_pannel2.add(lblposte_2);
		
		JLabel lblposte_6 = new JLabel("grade :");
		lblposte_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblposte_6.setBounds(160, 288, 121, 23);
		poste_pannel2.add(lblposte_6);
		
		JLabel lblposte_3 = new JLabel("Libelle poste :");
		lblposte_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblposte_3.setBounds(160, 211, 167, 23);
		poste_pannel2.add(lblposte_3);
	
		
		JLabel lblposte_5 = new JLabel("departement :");
		lblposte_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblposte_5.setBounds(160, 365, 167, 23);
		poste_pannel2.add(lblposte_5);
		
		JLabel lblposte_4 = new JLabel("Date d'occuppation :");
		lblposte_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblposte_4.setBounds(155, 442, 199, 23);
		poste_pannel2.add(lblposte_4);
		
		
		
		JTextField textField_poste_1 = new JTextField();
		textField_poste_1.setBounds(385, 61, 182, 23);
		poste_pannel2.add(textField_poste_1);
		textField_poste_1.setColumns(10);
		
		JTextField textField_poste_2 = new JTextField();
		textField_poste_2.setBounds(385, 138, 182, 23);
		poste_pannel2.add(textField_poste_2);
		textField_poste_2.setColumns(10);
		
		JTextField textField_poste_3 = new JTextField();
		textField_poste_3.setBounds(385, 211, 182, 23);
		poste_pannel2.add(textField_poste_3);
		textField_poste_3.setColumns(10);
		
		 JTextField textField_poste_4 = new JTextField();
		 textField_poste_4.setBounds(385, 284, 182, 23);
		poste_pannel2.add(textField_poste_4);
		textField_poste_4.setColumns(10);
		
		 JTextField textFieldposte_5 = new JTextField();
		 textFieldposte_5.setBounds(385, 365, 182, 23);
		poste_pannel2.add(textFieldposte_5);
		textFieldposte_5.setColumns(10);
		
		
		 JTextField textFieldposte_6 = new JTextField();
		 textFieldposte_6.setBounds(385, 442, 182, 23);
		 poste_pannel2.add(textFieldposte_6);
		 textFieldposte_6.setColumns(10);
		

		JButton btn_save_ajout_poste = new JButton("");
		btn_save_ajout_poste.setBorderPainted(false);
		btn_save_ajout_poste.setContentAreaFilled(false);
		btn_save_ajout_poste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				 if(JOptionPane.showConfirmDialog(null,"vous voulez confirmer l'ajout ","ajouter poste",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)  
					{Methodes m_aj =new	Methodes();	
                      m_aj.ajouter_poste(textField_poste_1.getText(), textField_poste_2.getText(), textField_poste_3.getText(), textField_poste_4.getText(), textFieldposte_5.getText(), textFieldposte_6.getText());
				

JOptionPane.showMessageDialog(null,"ajout avec succées");

			}
				 
				 
				 textField_poste_1.setText("");
				 textField_poste_2.setText("");
				 textField_poste_3.setText("");
				 textField_poste_4.setText("");
				 textFieldposte_5.setText("");
				 textFieldposte_6.setText("");
			}
			
			
			
			catch(Exception exp2) {JOptionPane.showInputDialog(exp2);}
		
			}});
		Image img13= new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_save_ajout_poste.setIcon(new ImageIcon(img13));
		btn_save_ajout_poste.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_save_ajout_poste.setBounds(621, 455, 170, 49);
		poste_pannel2.add(btn_save_ajout_poste);
		
				
		JButton btnNewButton_retour_poste1 = new JButton("");
		btnNewButton_retour_poste1.setBorderPainted(false);
		btnNewButton_retour_poste1.setContentAreaFilled(false);
		btnNewButton_retour_poste1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poste_pannel.setVisible(true);
				poste_pannel2.setVisible(false);
			}
		});
		
		btnNewButton_retour_poste1.setIcon (new ImageIcon(img10));
		btnNewButton_retour_poste1.setBounds(20, 20, 50, 50);
		poste_pannel2.add(btnNewButton_retour_poste1);
		
		
		panel_par_defaut.add(poste_pannel2);
		
		// panel modifier poste****************
		  
	    JLabel lbl_poste_5 = new JLabel("id_agent :");
		lbl_poste_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_poste_5.setBounds(160, 57, 121, 23);
		poste_pannel3.add(lbl_poste_5);
		
		JLabel lbl_poste_4 = new JLabel("id_poste :");
		lbl_poste_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_poste_4.setBounds(160, 134, 121, 23);
		poste_pannel3.add(lbl_poste_4);
		
	
		
		JLabel lblposte_7 = new JLabel("date d'occupation :");
		lblposte_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblposte_7.setBounds(160, 440, 200, 35);
		poste_pannel3.add(lblposte_7);
		
		
		JLabel lbl_poste_6 = new JLabel("Libelle poste :");
		lbl_poste_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_poste_6.setBounds(160, 207, 167, 23);
		poste_pannel3.add(lbl_poste_6);
		
		JLabel lbl_poste_7= new JLabel("departement :");
		lbl_poste_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_poste_7.setBounds(160, 363, 148, 23);
		poste_pannel3.add(lbl_poste_7);
		
		JLabel lblposte_8 = new JLabel("grade :");
		lblposte_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblposte_8.setBounds(160, 280, 199, 23);
		poste_pannel3.add(lblposte_8);
		
		
		
		JTextField textField_poste_5  = new JTextField();
		textField_poste_5.setBounds(385, 61, 182, 23);
		poste_pannel3.add(textField_poste_5);
		textField_poste_5.setColumns(10);
		
		JTextField textField_poste_6 = new JTextField();
		textField_poste_6.setBounds(385, 138, 182, 23);
		poste_pannel3.add(textField_poste_6);
		textField_poste_6.setColumns(10);
		
		JTextField textField_poste_7 = new JTextField();
		textField_poste_7.setBounds(385, 211, 182, 23);
		poste_pannel3.add(textField_poste_7);
		textField_poste_7.setColumns(10);
		
		JTextField textField_poste_8 = new JTextField();
		textField_poste_8.setBounds(385, 284, 182, 23);
		poste_pannel3.add(textField_poste_8);
		textField_poste_8.setColumns(10);
		
		JTextField textField_poste_9 = new JTextField();
		textField_poste_9.setColumns(10);
		textField_poste_9.setBounds(385, 363, 182, 23);
		poste_pannel3.add(textField_poste_9);
		
		
		JTextField textFieldposte_10 = new JTextField();
		textFieldposte_10.setColumns(10);
		textFieldposte_10.setBounds(385, 442, 182, 23);
		poste_pannel3.add(textFieldposte_10);
		
		JButton btn_save_modification_poste = new JButton("");
		btn_save_modification_poste.setBorderPainted(false);
		btn_save_modification_poste.setContentAreaFilled(false);
		btn_save_modification_poste.setContentAreaFilled(false);
		btn_save_modification_poste.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
		 
try {
        if(JOptionPane.showConfirmDialog(null,"vous voullez vraiment modifier ce poste ","modifier poste",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION) 
		 
				{Methodes m_ed2 =new Methodes();	
				m_ed2.modifier_poste(textField_poste_6.getText(),textField_poste_7.getText(),textField_poste_8.getText(),textField_poste_9.getText(), textFieldposte_10.getText(), textField_poste_5.getText());
			    JOptionPane.showMessageDialog(null,"modification avec succées");
			   
				}
        
        textField_poste_5.setText("");
        textField_poste_6.setText("");
        textField_poste_7.setText("");
        textField_poste_8.setText("");
        textField_poste_9.setText("");
        textFieldposte_10.setText("");}
catch(Exception exp) 
{
	JOptionPane.showInputDialog(exp);
}


				}});
		Image img8= new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_save_modification_poste.setIcon(new ImageIcon(img8));
		btn_save_modification_poste.setBounds(621, 455, 170, 49);
		poste_pannel3.add(btn_save_modification_poste);
		
		JButton btnNewButton_retour_poste3 = new JButton("");
		btnNewButton_retour_poste3.setBorderPainted(false);
		btnNewButton_retour_poste3.setContentAreaFilled(false);
		btnNewButton_retour_poste3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poste_pannel.setVisible(true);
				poste_pannel3.setVisible(false);
			}
		});
		
		btnNewButton_retour_poste3.setIcon (new ImageIcon(img10));
		btnNewButton_retour_poste3.setBounds(20, 20, 50, 50);
		poste_pannel3.add(btnNewButton_retour_poste3);
		
		panel_par_defaut.add(poste_pannel3);
		
		// panel supprimer _poste :panel psote 4
		
		JTextField  textField_poste_10 = new JTextField();
		textField_poste_10.setBounds(286, 187, 276, 35);
		poste_pannel4.add(textField_poste_10);
		textField_poste_10.setColumns(10);
		
		JLabel lbl_poste_8 = new JLabel("Saisir id_poste : ");
		lbl_poste_8.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbl_poste_8.setBounds(86, 183, 190, 35);
		poste_pannel4.add(lbl_poste_8);
		
		JButton btn_supprimer_poste= new JButton("Supprimer");
		btn_supprimer_poste.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_supprimer_poste.setBounds(578, 277, 133, 31);
		btn_supprimer_poste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
             try {   
                
                 if ((textField_poste_10.getText().length()==0))
             	   
             	   
                    JOptionPane.showMessageDialog(null, "veuillez saisir une decision");
                 else if(JOptionPane.showConfirmDialog(null,"vous voullez vraiment supprimer cette decision ","supprimer decision",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) 
          					 
                              	 { 
                    	               Methodes m_sup = new Methodes();
                                       m_sup.supprimer_poste(textField_poste_10.getText());
                                       JOptionPane.showMessageDialog(null, "suppression avec succés "); 
                                 }
                 else {}
                textField_poste_10.setText(" ");
             }
             catch(Exception exp3)
             {
            	 JOptionPane.showInputDialog(exp3);
             }
           }});
		poste_pannel4.add(btn_supprimer_poste);
		
		JLabel lbl_poste_9 = new JLabel("");
		lbl_poste_9.setBounds(353, 57, 89, 60);
		poste_pannel4.add(lbl_poste_9);
		
		JButton btnNewButton_retour_poste4= new JButton("");
		btnNewButton_retour_poste4.setBorderPainted(false);
		btnNewButton_retour_poste4.setContentAreaFilled(false);
		btnNewButton_retour_poste4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poste_pannel.setVisible(true);
				poste_pannel3.setVisible(false);
			}
		});
		
		btnNewButton_retour_poste4.setIcon (new ImageIcon(img10));
		btnNewButton_retour_poste4.setBounds(20, 20, 50, 50);
		poste_pannel4.add(btnNewButton_retour_poste4);
		
		panel_par_defaut.add(poste_pannel4);

	
	
	// panels grades *****************************
	
	grade_pannel5 = new JPanel();
	grade_pannel5.setBackground(UIManager.getColor("CheckBox.background"));
	grade_pannel5.setBounds(0, 0, 800, 550);
	grade_pannel5.setVisible(false);
	grade_pannel5.setLayout(null);
	
	// pour la pannel ajout grade
	
	grade_pannel6 = new JPanel();
	grade_pannel6.setBackground(UIManager.getColor("CheckBox.background"));
	grade_pannel6.setBounds(0, 0, 800, 550);
	grade_pannel6.setVisible(false);
	grade_pannel6.setLayout(null);
	
	
	// pour la pannel modification grade
	
		grade_pannel3 = new JPanel();
		grade_pannel3.setBackground(UIManager.getColor("CheckBox.background"));
		grade_pannel3.setBounds(0, 0, 800, 550);
		grade_pannel3.setVisible(false);
		grade_pannel3.setLayout(null);
		
   // pour la pannel suppression grade
	
		grade_pannel4 = new JPanel();
		grade_pannel4.setBackground(UIManager.getColor("CheckBox.background"));
		grade_pannel4.setBounds(0, 0, 800, 550);
		grade_pannel4.setVisible(false);
		grade_pannel4.setLayout(null);
		
		
		 // pour le pannel suppression grade
		
		grade_pannel1= new JPanel();
		grade_pannel1.setBackground(UIManager.getColor("CheckBox.background"));
		grade_pannel1.setBounds(0, 0, 800, 550);
		grade_pannel1.setVisible(false);
		grade_pannel1.setLayout(null);
		
		
 // pannel  affichage  grade
		
		grade_pannel2= new JPanel();
		grade_pannel2.setBackground(UIManager.getColor("CheckBox.background"));
		grade_pannel2.setBounds(0, 0, 800, 550);
		grade_pannel2.setVisible(false);
		grade_pannel2.setLayout(null);
		
		
		
	// le panel pour la recherche  des grades ****************************
		
		
		DefaultTableModel model_grade=new DefaultTableModel();
		model_grade.addColumn("id_grade");
		model_grade.addColumn("libelle_grade");
		model_grade.addColumn("date_d'obtention");
		model_grade.addColumn("id_agent");
		
		JScrollPane scroll2=new JScrollPane();
		scroll2.setBounds(81,97,500,300);
		grade_pannel1.add(scroll2);


		JTable table_recherche_grade = new JTable(model_grade);
		scroll2.setViewportView(table_recherche_grade);
		
        JLabel lblNewLabel2 = new JLabel("Resultats de recherche");
        lblNewLabel2.setForeground(SystemColor.textHighlight);
        lblNewLabel2.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel2.setBounds(176, 22, 404, 47);
        grade_pannel1.add(lblNewLabel2);
		

		panel_par_defaut.add(grade_pannel1);

		
	
		
		// le pannel afficher grades
		
		
		
				DefaultTableModel model_grade_affichage=new DefaultTableModel();
				model_grade_affichage.addColumn("id_poste");
				model_grade_affichage.addColumn("libelle_grade");
				model_grade_affichage.addColumn("date_d'obtention");
				model_grade_affichage.addColumn("id_agent");
				
				JScrollPane scroll_aff2=new JScrollPane();
				scroll_aff2.setBounds(40,140,680,600);
				grade_pannel2.add(scroll_aff2);


				JTable table_afficher_grade = new JTable(model_grade_affichage);
				scroll_aff2.setViewportView(table_afficher_grade);

			
		        
		        JLabel lblNewLabel_afficher3 = new JLabel("Saisir id_agent :");
		        lblNewLabel_afficher3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		        lblNewLabel_afficher3.setBounds(140, 35, 161, 45);
		        grade_pannel2.add(lblNewLabel_afficher3);
				
				JTextField textField_afficher_grade= new JTextField();
				textField_afficher_grade.setBounds(350, 44, 217, 27);
				grade_pannel2.add(textField_afficher_grade);
				textField_afficher_grade.setColumns(10);
				
				JButton btn_OK_afficher_grade = new JButton("OK");
				btn_OK_afficher_grade.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						    
						
				            Methodes.afficher_grade(textField_afficher_grade.getText(), model_grade_affichage);
					}
				});
				btn_OK_afficher_grade.setFont(new Font("Tahoma", Font.PLAIN, 18));
				btn_OK_afficher_grade.setBounds(500, 101, 89, 23);
				grade_pannel2.add(btn_OK_afficher_grade);
				
				JButton btnNewButton_retour_grade2 = new JButton("");
				btnNewButton_retour_grade2.setBorderPainted(false);
				btnNewButton_retour_grade2.setContentAreaFilled(false);
				btnNewButton_retour_grade2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						grade_pannel5.setVisible(true);
						grade_pannel2.setVisible(false);
						model_poste_affichage.setRowCount(0);
						textField_afficher_poste.setText("");
					}
				});

				btnNewButton_retour_grade2.setIcon (new ImageIcon(img10));
				btnNewButton_retour_grade2.setBounds(20, 20, 50, 50);
				grade_pannel2.add(btnNewButton_retour_grade2);
				
				
			
				panel_par_defaut.add(grade_pannel2);

	// ajouter un grades **************************************
			
		
		JButton btnNewButton_retour_grade = new JButton("");
		btnNewButton_retour_grade.setBorderPainted(false);
		btnNewButton_retour_grade.setContentAreaFilled(false);
		btnNewButton_retour_grade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				grade_pannel5.setVisible(true);
				grade_pannel6.setVisible(false);
			}
		});
		
		btnNewButton_retour_grade.setIcon (new ImageIcon(img10));
		btnNewButton_retour_grade.setBounds(20, 20, 50, 50);
		grade_pannel6.add(btnNewButton_retour_grade);

			JLabel lbl_grade_3= new JLabel("id_grade :");
			lbl_grade_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lbl_grade_3.setBounds(160, 134, 121, 23);
			grade_pannel6.add(lbl_grade_3);
			
			JLabel lbl_grade_4 = new JLabel("id_agent :");
			lbl_grade_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lbl_grade_4.setBounds(160, 57, 121, 23);
			grade_pannel6.add(lbl_grade_4);
			
			JLabel lbl_grade_5 = new JLabel("Libelle grade :");
			lbl_grade_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lbl_grade_5.setBounds(160, 207, 167, 23);
			grade_pannel6.add(lbl_grade_5);
			
			
			JLabel lbl_grade_6= new JLabel("Date d'obtention :");
			lbl_grade_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lbl_grade_6.setBounds(160, 284, 199, 23);
			grade_pannel6.add(lbl_grade_6);
			
			
			JTextField textField_grade_2 = new JTextField();
			textField_grade_2.setForeground(new Color(0, 0, 0));
			textField_grade_2.setBounds(385, 61, 182, 23);
			grade_pannel6.add(textField_grade_2);
			textField_grade_2.setColumns(10);
			
			JTextField textField_grade_3 = new JTextField();
			textField_grade_3.setBounds(385, 138, 182, 23);
			grade_pannel6.add(textField_grade_3);
			textField_grade_3.setColumns(10);
			
			JTextField textField_grade_4 = new JTextField();
			textField_grade_4.setBackground(UIManager.getColor("InternalFrame.borderHighlight"));
			textField_grade_4.setBounds(385, 211, 182, 23);
			grade_pannel6.add(textField_grade_4);
			textField_grade_4.setColumns(10);
			
			JTextField textField_grade_5 = new JTextField();
			textField_grade_5.setBounds(385, 284, 182, 23);
			 grade_pannel6.add(textField_grade_5);
			 textField_grade_5.setColumns(10);
			 
			    JButton btnNewButton_ajout_grade = new JButton("");
				btnNewButton_ajout_grade.setBorderPainted(false);
				btnNewButton_ajout_grade.setContentAreaFilled(false);
				btnNewButton_ajout_grade.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

			              if(JOptionPane.showConfirmDialog(null,"vous voullez vraiment ajouter ce grade ","ajouter grade",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION) 
							 
									{
			            	  Methodes m_aj1 =new Methodes();	
									
									m_aj1.ajouter_grade(textField_grade_2.getText(), textField_grade_3.getText(), textField_grade_4.getText(), textField_grade_5.getText());								   
								    JOptionPane.showMessageDialog(null,"ajout avec succées");

									}
			              
			              textField_grade_2.setText("");
			              textField_grade_3.setText("");
			              textField_grade_4.setText("");
			              textField_grade_5.setText("");
												}
						
					
				});
				
				
				btnNewButton_ajout_grade.setIcon(new ImageIcon(img13));
				btnNewButton_ajout_grade.setFont(new Font("Tahoma", Font.PLAIN, 20));
				btnNewButton_ajout_grade.setBounds(621, 455, 170, 49);
				grade_pannel6.add(btnNewButton_ajout_grade);
				
			
			
			panel_par_defaut.add(grade_pannel6);
			
			
			
			
           // modifier un grades **************************************
			

		 JLabel  lbl_grade_7 = new JLabel("id_grade :");
		 lbl_grade_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl_grade_7.setBounds(160, 134, 121, 23);
		 grade_pannel3.add(lbl_grade_7);
						
		 JLabel lbl_grade_8 = new JLabel("id_agent :");
		 lbl_grade_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl_grade_8.setBounds(160, 57, 121, 23);
		 grade_pannel3.add(lbl_grade_8);
						
		 JLabel lbl_grade_10= new JLabel("Libelle grade :");
		 lbl_grade_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl_grade_10.setBounds(160, 207, 167, 23);
	   	 grade_pannel3.add(lbl_grade_10);
					
						
	   	 JLabel	lbl_grade_9= new JLabel("Date d'obtention :");
	   	lbl_grade_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
	   	lbl_grade_9.setBounds(160, 284, 199, 23);
		 grade_pannel3.add(lbl_grade_9);
									
		 JTextField textField_grade_6 = new JTextField();
		 textField_grade_6.setForeground(new Color(0, 0, 0));
		 textField_grade_6.setBounds(385, 61, 182, 23);
		 grade_pannel3.add(textField_grade_6);
		 textField_grade_6.setColumns(10);
						
		 JTextField textField_grade_7 = new JTextField();
		 textField_grade_7.setBounds(385, 138, 182, 23);
		 grade_pannel3.add(textField_grade_7);
		 textField_grade_7.setColumns(10);
						
		 JTextField textField_grade_8 = new JTextField();
		 textField_grade_8.setBackground(UIManager.getColor("InternalFrame.borderHighlight"));
		 textField_grade_8.setBounds(385, 211, 182, 23);
		 grade_pannel3.add(textField_grade_8);
		 textField_grade_8.setColumns(10);
						
		 JTextField textField_grade_9 = new JTextField();
		 textField_grade_9.setBounds(385, 284, 182, 23);
		 grade_pannel3.add(textField_grade_9);
		 textField_grade_9.setColumns(10);
		 
		 JButton btnNewButton_save_modification_grade = new JButton("");
		 btnNewButton_save_modification_grade.setBorderPainted(false);
		 btnNewButton_save_modification_grade.setContentAreaFilled(false);
		 btnNewButton_save_modification_grade.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
		 

         if(JOptionPane.showConfirmDialog(null,"vous voullez vraiment modifier ce grade ","modifier Grade",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION) 
		 
				{Methodes m_ed2 =new Methodes();	
				m_ed2.modifier_grade(textField_grade_6.getText(),textField_grade_7.getText(),textField_grade_8.getText(),textField_grade_9.getText());
			    JOptionPane.showMessageDialog(null,"modification avec succées");
			   
				}
         
         textField_grade_6.setText("");
         textField_grade_7.setText("");
         textField_grade_8.setText("");
         textField_grade_9.setText("");
				}});
							
		 btnNewButton_save_modification_grade.setIcon(new ImageIcon(img13));
		 btnNewButton_save_modification_grade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 btnNewButton_save_modification_grade.setBounds(621, 455, 170, 49);
		 grade_pannel3.add(btnNewButton_save_modification_grade);
		 
		 
			JButton btnNewButton_retour_grade3 = new JButton("");
			btnNewButton_retour_grade3.setBorderPainted(false);
			btnNewButton_retour_grade3.setContentAreaFilled(false);
			btnNewButton_retour_grade3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					grade_pannel5.setVisible(true);
					grade_pannel3.setVisible(false);
				}
			});
			
			btnNewButton_retour_grade3.setIcon (new ImageIcon(img10));
			btnNewButton_retour_grade3.setBounds(20, 20, 50, 50);
			grade_pannel3.add(btnNewButton_retour_grade3);
						
						
		panel_par_defaut.add(grade_pannel3);
			
  // suppression  d'un grade panel  
		
		JTextField textField_grade_10 = new JTextField();
		textField_grade_10.setBounds(286, 187, 276, 35);
		grade_pannel4.add(textField_grade_10);
		textField_grade_10.setColumns(10);
		
		JLabel lbl_grade_11= new JLabel("Saisir id_grade : ");
		lbl_grade_11.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbl_grade_11.setBounds(86, 183, 190, 35);
		grade_pannel4.add(lbl_grade_11);
		
		JButton btnNewButtonsupprimer_grade= new JButton("Supprimer");
		btnNewButtonsupprimer_grade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButtonsupprimer_grade.setBounds(578, 277, 133, 31);
		btnNewButtonsupprimer_grade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((textField_grade_10.getText().length()==0))
					
			          JOptionPane.showMessageDialog(null, "veuillez saisir un grade");
				
			    else if(JOptionPane.showConfirmDialog(null,"vous voullez vraiment supprimer ce grade ","supprimer decision",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) 
								
			          { 
			    	        Methodes m_sup=new Methodes();
                            m_sup.supprimer_grade(textField_grade_10.getText());
            			    JOptionPane.showMessageDialog(null,"suppression avec succées");

                             
			          }
				
			      else {}
				
				textField_grade_10.setText("");	  
			          
			
			
			}});
		grade_pannel4.add(btnNewButtonsupprimer_grade);
		
		JLabel lbl_grade_12 = new JLabel("");
		lbl_grade_12.setBounds(353, 57, 89, 60);
		grade_pannel4.add(lbl_grade_12);
		
	
		
		JButton btnNewButton_retour_grade4 = new JButton("");
		btnNewButton_retour_grade4.setBorderPainted(false);
		btnNewButton_retour_grade4.setContentAreaFilled(false);
		btnNewButton_retour_grade4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				grade_pannel4.setVisible(false);
                grade_pannel5.setVisible(true);						
			}
		});
		btnNewButton_retour_grade4.setIcon (new ImageIcon(img10));
		btnNewButton_retour_grade3.setBounds(20, 20, 50, 50);
		grade_pannel4.add(btnNewButton_retour_grade4);
		
		panel_par_defaut.add(grade_pannel4);
		
		
		
		// le contenant du panne1 : panel grade
		
				JLabel lbl_grade_1 = new JLabel("GESTION DES GRADES");
				lbl_grade_1.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
				lbl_grade_1.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_grade_1.setFont(new Font("Bell MT", Font.BOLD, 27));
				lbl_grade_1.setBounds(0, 0, 800, 70);
				grade_pannel5.add(lbl_grade_1);
				
				
				JLabel lbl_grade_2 = new JLabel("");
				Image img14= new ImageIcon(this.getClass().getResource("/grade.jpeg")).getImage();
				lbl_grade_2.setIcon(new ImageIcon(img14));
				lbl_grade_2.setBounds(20, 15, 87, 51);
				grade_pannel5.add(lbl_grade_2);
				
				
				JDesktopPane desktopPane_grade = new JDesktopPane();
				desktopPane_grade.setBackground(SystemColor.activeCaption);
				desktopPane_grade.setBounds(0, 11, 800, 70);
				grade_pannel5.add(desktopPane_grade);
				
				
				JTextField textField_grade_1 = new JTextField();
				textField_grade_1.setFont(new Font("Bell MT", Font.PLAIN, 16));
				textField_grade_1.setBounds(102, 140, 608, 37);
				grade_pannel5.add(textField_grade_1);
				textField_grade_1.setColumns(10);
			
				JButton btnNewButton_rechercher_grade = new JButton("");
				btnNewButton_rechercher_grade.setBorderPainted(false);
				btnNewButton_rechercher_grade.setContentAreaFilled(false);
				btnNewButton_rechercher_grade.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						grade_pannel5.setVisible(false);
						grade_pannel1.setVisible(true);
						Methodes.rechercher_grade(textField_grade_1.getText(), model_grade);		
						
					}
				});
				btnNewButton_rechercher_grade.setIcon (new ImageIcon(img4));
				btnNewButton_rechercher_grade.setBounds(720, 130, 50, 50);
				grade_pannel5.add(btnNewButton_rechercher_grade);
				
				
				JButton btnNewButton_historique = new JButton("");
				btnNewButton_historique.setBorderPainted(false);
				btnNewButton_historique.setContentAreaFilled(false);
				btnNewButton_historique.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						grade_pannel5.setVisible(false);
						grade_pannel2.setVisible(true);
							}
						});
				
				btnNewButton_historique.setIcon (new ImageIcon(img11));
				btnNewButton_historique.setBounds(610, 443, 50, 50);
				grade_pannel5.add(btnNewButton_historique);

				JButton btnNewButton_retour_grade1 = new JButton("");
				btnNewButton_retour_grade1.setBorderPainted(false);
				btnNewButton_retour_grade1.setContentAreaFilled(false);
				btnNewButton_retour_grade1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						grade_pannel5.setVisible(false);
                        // panel acceuil  je dois l'afficher						
					}
				});
				btnNewButton_retour_grade1.setIcon (new ImageIcon(img10));
				btnNewButton_retour_grade1.setBounds(40, 130, 50, 50);
				grade_pannel5.add(btnNewButton_retour_grade1);
			
				
				JButton btnajouter_grade = new JButton("");
				btnajouter_grade.setBorderPainted(false);
				btnajouter_grade.setContentAreaFilled(false);
				btnajouter_grade.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						grade_pannel5.setVisible(false);
						grade_pannel6.setVisible(true);
						
					}
				});
				btnajouter_grade.setBounds(58, 437, 56, 57);
				btnajouter_grade.setIcon(new ImageIcon(img1));
				grade_pannel5.add(btnajouter_grade);
				
				
				
				JButton btnmodifier_grade = new JButton("");
				btnmodifier_grade.setBorderPainted(false);
				btnmodifier_grade.setContentAreaFilled(false);
				btnmodifier_grade.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						grade_pannel5.setVisible(false);
						grade_pannel3.setVisible(true);
						
					}
				});
				btnmodifier_grade.setBounds(250, 445, 49, 49);
				btnmodifier_grade.setIcon(new ImageIcon(img2));
				grade_pannel5.add(btnmodifier_grade);
				
				
				JButton btnsupprimer_grade = new JButton("");
				btnsupprimer_grade.setBorderPainted(false);
				btnsupprimer_grade.setContentAreaFilled(false);
				btnsupprimer_grade.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						grade_pannel5.setVisible(false);
						grade_pannel4.setVisible(true);
						
					}
				});
				btnsupprimer_grade.setBounds(420, 437, 49, 57);
				btnsupprimer_grade.setIcon(new ImageIcon(img3));
				grade_pannel5.add(btnsupprimer_grade);
				
				
				panel_par_defaut.add(grade_pannel5);
		
		
	
		
		// panels decision **************************************************************
		
     	decision_pannel1 = new JPanel();
		decision_pannel1.setBackground(UIManager.getColor("CheckBox.background"));
		decision_pannel1.setBounds(0, 0, 800, 550);
		decision_pannel1.setVisible(true);
		decision_pannel1.setLayout(null);
		
		
		 decision_pannel4 = new JPanel();
		decision_pannel4.setBackground(UIManager.getColor("CheckBox.background"));
		decision_pannel4.setBounds(0, 0, 800, 550);
		decision_pannel4.setVisible(false);
		decision_pannel4.setLayout(null);
		
		// pour la pannel modification decision
		
			decision_pannel2 = new JPanel();
			decision_pannel2.setBackground(UIManager.getColor("CheckBox.background"));
			decision_pannel2.setBounds(0, 0, 800, 550);
			decision_pannel2.setVisible(false);
			decision_pannel2.setLayout(null);
			
		// pour la pannel supression decision
			
				decision_pannel3 = new JPanel();
				decision_pannel3.setBackground(UIManager.getColor("CheckBox.background"));
				decision_pannel3.setBounds(0, 0, 800, 550);
				decision_pannel3.setVisible(false);
				decision_pannel3.setLayout(null);
				
		// pour la pannel de recherche decision
				
				decision_pannel5 = new JPanel();
				decision_pannel5.setBackground(UIManager.getColor("CheckBox.background"));
				decision_pannel5.setBounds(0, 0, 800, 550);
				decision_pannel5.setVisible(false);
				decision_pannel5.setLayout(null);
				
				
		// pour la pannel historique decision
						
				decision_pannel6 = new JPanel();
			    decision_pannel6.setBackground(UIManager.getColor("CheckBox.background"));
				decision_pannel6.setBounds(0, 0, 800, 550);
				decision_pannel6.setVisible(false);
				decision_pannel6.setLayout(null);
						
				
				
				
				// le panel pour la recherche  pour decision ****************************
				
				
				DefaultTableModel model_decision=new DefaultTableModel();
				model_decision.addColumn("id_decision");
				model_decision.addColumn("id_agent");
				model_decision.addColumn("id_poste");
				model_decision.addColumn("visa");
				
				JScrollPane scroll=new JScrollPane();
				scroll.setBounds(81,97,500,300);
				decision_pannel5.add(scroll);


				JTable table_recherche_decision = new JTable(model_decision);
				scroll.setViewportView(table_recherche_decision);
				
		        JLabel lblNewLabel= new JLabel("Resultats de recherche");
				lblNewLabel.setForeground(SystemColor.textHighlight);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel.setBounds(176, 22, 404, 47);
				decision_pannel5.add(lblNewLabel);
				

				panel_par_defaut.add(decision_pannel5);
				
				
				
				// le pannel afficher decisions
				
				
				
				DefaultTableModel model_decision_affichage=new DefaultTableModel();
				model_decision_affichage.addColumn("id_decision");
				model_decision_affichage.addColumn("id_agent");
				model_decision_affichage.addColumn("id_poste");
				model_decision_affichage.addColumn("visa");
				
				JScrollPane scroll_aff4=new JScrollPane();
				scroll_aff4.setBounds(40,140,680,600);
				decision_pannel6.add(scroll_aff4);


				JTable table_afficher_decision = new JTable(model_decision_affichage);
				scroll_aff4.setViewportView(table_afficher_decision);

			
		        
		        JLabel lblNewLabel_afficher4 = new JLabel("Saisir id_agent :");
		        lblNewLabel_afficher4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		        lblNewLabel_afficher4.setBounds(140, 35, 161, 45);
		        decision_pannel6.add(lblNewLabel_afficher4);
				
				JTextField textField_afficher_decision= new JTextField();
				textField_afficher_decision.setBounds(350, 44, 217, 27);
				decision_pannel6.add(textField_afficher_decision);
				textField_afficher_decision.setColumns(10);
				
				JButton btn_OK_afficher_decision = new JButton("OK");
				btn_OK_afficher_decision.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						    
						
				            Methodes.afficher_decision(textField_afficher_decision.getText(), model_decision_affichage);
					}
				});
				btn_OK_afficher_decision.setFont(new Font("Tahoma", Font.PLAIN, 18));
				btn_OK_afficher_decision.setBounds(500, 101, 89, 23);
				decision_pannel6.add(btn_OK_afficher_decision);
				
				JButton btnNewButton_retour_decision = new JButton("");
				btnNewButton_retour_decision.setBorderPainted(false);
				btnNewButton_retour_decision.setContentAreaFilled(false);
				btnNewButton_retour_decision.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						decision_pannel1.setVisible(true);
						decision_pannel6.setVisible(false);
						model_poste_affichage.setRowCount(0);
						textField_afficher_poste.setText("");
					}
				});

				btnNewButton_retour_decision.setIcon (new ImageIcon(img10));
				btnNewButton_retour_decision.setBounds(20, 20, 50, 50);
				decision_pannel6.add(btnNewButton_retour_decision);
				
				
			
				panel_par_defaut.add(decision_pannel6);
		
		// le contenant du pannel décision************************************************************************
	
		JLabel lbl_decision_1  = new JLabel("GESTION DES DESICION");
		lbl_decision_1.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		lbl_decision_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_decision_1.setFont(new Font("Bell MT", Font.BOLD, 27));
		lbl_decision_1.setBounds(0, 0, 800, 70);
		decision_pannel1.add(lbl_decision_1);
		
		
		JLabel lbl_decision_2 = new JLabel("");
		Image img6= new ImageIcon(this.getClass().getResource("/decision.png")).getImage();
		lbl_decision_2.setIcon(new ImageIcon(img6));
		lbl_decision_2.setBounds(10, 15, 87, 51);
		decision_pannel1.add(lbl_decision_2);
		
		JDesktopPane desktopPane_decision = new JDesktopPane();
		desktopPane_decision.setBackground(SystemColor.activeCaption);
		desktopPane_decision.setBounds(0, 11, 800, 70);
		decision_pannel1.add(desktopPane_decision);
		
		
		JTextField textField_decision_1 = new JTextField();
		textField_decision_1.setFont(new Font("Bell MT", Font.PLAIN, 16));
		textField_decision_1.setBounds(102, 140, 608, 37);
		decision_pannel1.add(textField_decision_1);
		textField_decision_1.setColumns(10);
	
		JButton btnNewButton_rechercher_decision = new JButton("");
		btnNewButton_rechercher_decision.setBorderPainted(false);
		btnNewButton_rechercher_decision.setContentAreaFilled(false);
		btnNewButton_rechercher_decision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
			
				     	decision_pannel1.setVisible(false);
						decision_pannel5.setVisible(true);
						Methodes m_rech=new Methodes();
						m_rech.rechercher_decision(textField_decision_1.getText(), model_decision);						
			}
		});
		btnNewButton_rechercher_decision.setIcon (new ImageIcon(img4));
		btnNewButton_rechercher_decision.setBounds(720, 130, 50, 50);
		decision_pannel1.add(btnNewButton_rechercher_decision);
		
		
		JButton btnNewButton_historique_decision = new JButton("");
		btnNewButton_historique_decision.setBorderPainted(false);
		btnNewButton_historique_decision.setContentAreaFilled(false);
		btnNewButton_historique_decision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
						decision_pannel6.setVisible(true);
						decision_pannel1.setVisible(false);

			}
		});
		btnNewButton_historique_decision.setIcon (new ImageIcon(img11));
		btnNewButton_historique_decision.setBounds(610, 443, 50, 50);
		decision_pannel1.add(btnNewButton_historique_decision);

		JButton btnNewButton_retour_decision1 = new JButton("");
		btnNewButton_retour_decision1.setBorderPainted(false);
		btnNewButton_retour_decision1.setContentAreaFilled(false);
		btnNewButton_retour_decision1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				     	decision_pannel1.setVisible(false);
					//  normalement ici page d'acceuil true	
						
			}
		});
		btnNewButton_retour_decision1.setIcon (new ImageIcon(img10));
		btnNewButton_retour_decision1.setBounds(40, 130, 50, 50);
		decision_pannel1.add(btnNewButton_retour_decision1);
	
	
		JButton btnajouter_decision = new JButton("");
		btnajouter_decision.setBorderPainted(false);
		btnajouter_decision.setContentAreaFilled(false);
		btnajouter_decision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				     	decision_pannel1.setVisible(false);
						decision_pannel4.setVisible(true);
						
			}
		});
		btnajouter_decision.setBounds(58, 437, 56, 57);
		btnajouter_decision.setIcon(new ImageIcon(img1));
		decision_pannel1.add(btnajouter_decision); 
		
		
		
		JButton btnmodifier_decision = new JButton("");
		btnmodifier_decision.setBorderPainted(false);
		btnmodifier_decision.setContentAreaFilled(false);
		btnmodifier_decision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decision_pannel1.setVisible(false);
				decision_pannel2.setVisible(true);
				
			}
		});
		btnmodifier_decision.setBounds(250, 445, 49, 49);
		btnmodifier_decision.setIcon(new ImageIcon(img2));
		decision_pannel1.add(btnmodifier_decision);
		
		
		JButton btnsupprimer_decision = new JButton("");
		btnsupprimer_decision.setBorderPainted(false);
		btnsupprimer_decision.setContentAreaFilled(false);
		btnsupprimer_decision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decision_pannel1.setVisible(false);
				decision_pannel3.setVisible(true);

				
			}
		});
		btnsupprimer_decision.setBounds(420, 437, 49, 57);
		btnsupprimer_decision.setIcon(new ImageIcon(img3));
		decision_pannel1.add(btnsupprimer_decision);
		
		
		panel_par_defaut.add(decision_pannel1);
		

		
		// panel modifier une decision***************************************************************
		
		

		 JLabel lbl_decision_3 = new JLabel("id_agent :");
		 lbl_decision_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl_decision_3.setBounds(160, 134, 121, 23);
		 decision_pannel2.add(lbl_decision_3);
						
		 JLabel lbl_decision_4 = new JLabel("id_decision :");
		 lbl_decision_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl_decision_4.setBounds(160, 57, 121, 23);
		 decision_pannel2.add(lbl_decision_4);
						
		 JLabel lbl_decision_5 = new JLabel("id_poste :");
		 lbl_decision_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl_decision_5.setBounds(160, 207, 167, 23);
		 decision_pannel2.add(lbl_decision_5);
					
						
		 JLabel lbl_decision_6= new JLabel("Visa :");
		 lbl_decision_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl_decision_6.setBounds(160, 284, 199, 23);
		 decision_pannel2.add(lbl_decision_6);
						
						
		 JTextField textField_decision_2 = new JTextField();
		 textField_decision_2.setForeground(new Color(0, 0, 0));
		 textField_decision_2.setBounds(385, 61, 182, 23);
		 decision_pannel2.add(textField_decision_2);
		 textField_decision_2.setColumns(10);
						
		 JTextField textField_decision_3 = new JTextField();
		 textField_decision_3.setBounds(385, 138, 182, 23);
		 decision_pannel2.add(textField_decision_3);
		 textField_decision_3.setColumns(10);
						
		 JTextField textField_decision_4 = new JTextField();
		 textField_decision_4.setBackground(UIManager.getColor("InternalFrame.borderHighlight"));
		 textField_decision_4.setBounds(385, 211, 182, 23);
		 decision_pannel2.add(textField_decision_4);
		 textField_decision_4.setColumns(10);
		 
			JComboBox type_visa = new JComboBox();
			type_visa.setFont(new Font("Tahoma", Font.PLAIN, 17));
			type_visa.setEditable(true);
			type_visa.setBounds(385, 284, 174, 30);
			decision_pannel2.add(type_visa);
			
			type_visa.addItem("accepte");
			type_visa.addItem("differe");
			type_visa.addItem("refuse");
			
			type_visa.setSelectedItem("choisir visa");
			
			
	 JButton btnNewButton_save_modification_decision = new JButton("");
	 btnNewButton_save_modification_decision.setBorderPainted(false);
	 btnNewButton_save_modification_decision.setContentAreaFilled(false);
	 btnNewButton_save_modification_decision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
                 if(JOptionPane.showConfirmDialog(null,"vous voullez vraiment modifier cette decision ","modifier decision",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION) 
				 
						{Methodes m_ed =new	Methodes();	
						m_ed.modifier_decision(textField_decision_2.getText(),textField_decision_3.getText(),textField_decision_4.getText(),(String)type_visa.getSelectedItem());
					    JOptionPane.showMessageDialog(null,"modification avec succées");
					   
						}
                 
                 textField_decision_2.setText("");
                 textField_decision_3.setText("");
                 textField_decision_4.setText("");
                 type_visa.setSelectedItem("choisir visa");
									}
		});
	 btnNewButton_save_modification_decision.setIcon(new ImageIcon(img13));
	 btnNewButton_save_modification_decision.setFont(new Font("Tahoma", Font.PLAIN, 20));
	 btnNewButton_save_modification_decision.setBounds(621, 455, 170, 49);
	 decision_pannel2.add(btnNewButton_save_modification_decision);
	 
	 JButton btnNewButton_retour_decision4 = new JButton("");
	 btnNewButton_retour_decision4.setBorderPainted(false);
	 btnNewButton_retour_decision4.setContentAreaFilled(false);
	 btnNewButton_retour_decision4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decision_pannel1.setVisible(true);
				decision_pannel2.setVisible(false);
			}
		});
		
	 btnNewButton_retour_decision4.setIcon (new ImageIcon(img10));
	 btnNewButton_retour_decision4.setBounds(20, 20, 50, 50);
		decision_pannel2.add(btnNewButton_retour_decision4);
		
		
		panel_par_defaut.add(decision_pannel2);
		
		// panel ajouter une decision**************************************************************
		

		 JLabel lbl_decision_7 = new JLabel("id_agent :");
		 lbl_decision_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl_decision_7.setBounds(160, 134, 121, 23);
		 decision_pannel4.add(lbl_decision_7);
						
		 JLabel lbl_decision_8 = new JLabel("id_decision :");
		 lbl_decision_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl_decision_8.setBounds(160, 57, 121, 23);
		 decision_pannel4.add(lbl_decision_8);
						
		 JLabel lbl_decision_9 = new JLabel("id_poste :");
		 lbl_decision_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl_decision_9.setBounds(160, 207, 167, 23);
		 decision_pannel4.add(lbl_decision_9);
					
						
		 JLabel lbl_decision_10= new JLabel("Visa :");
		 lbl_decision_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl_decision_10.setBounds(160, 284, 199, 23);
		 decision_pannel4.add(lbl_decision_10);
						
						
		 JTextField textField_decision_5 = new JTextField();
		 textField_decision_5.setForeground(new Color(0, 0, 0));
		 textField_decision_5.setBounds(385, 61, 182, 23);
		 decision_pannel4.add(textField_decision_5);
		 textField_decision_5.setColumns(10);
						
		 JTextField textField_decision_6 = new JTextField();
		 textField_decision_6.setBounds(385, 138, 182, 23);
		 decision_pannel4.add(textField_decision_6);
		 textField_decision_6.setColumns(10);
						
		 JTextField textField_decision_7 = new JTextField();
		 textField_decision_7.setBackground(UIManager.getColor("InternalFrame.borderHighlight"));
		 textField_decision_7.setBounds(385, 211, 182, 23);
		 decision_pannel4.add(textField_decision_7);
		 textField_decision_7.setColumns(10);
		 
			JComboBox type_visa2 = new JComboBox();
			type_visa2.setFont(new Font("Tahoma", Font.PLAIN, 17));
			type_visa2.setEditable(true);
			type_visa2.setBounds(385, 284, 174, 30);
			decision_pannel4.add(type_visa2);
			
			type_visa2.addItem("accepte");
			type_visa2.addItem("differe");
			type_visa2.addItem("refuse");
			
			type_visa2.setSelectedItem("choisir visa");
			
			
	 JButton btnNewButton_save_modification_decision3 = new JButton("");
	 btnNewButton_save_modification_decision3.setBorderPainted(false);
	 btnNewButton_save_modification_decision3.setContentAreaFilled(false);
	 btnNewButton_save_modification_decision3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
              if(JOptionPane.showConfirmDialog(null,"vous voullez vraiment ajouter cette decision ","ajouter decision",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION) 
				 
						{Methodes m_aj4 =new Methodes();	
						m_aj4.ajouter_decision(textField_decision_5.getText(),textField_decision_6.getText(),textField_decision_7.getText(),(String)type_visa2.getSelectedItem());
					    JOptionPane.showMessageDialog(null,"ajout avec succées");
					   
						}
              
              
              textField_decision_5.setText("");
              textField_decision_6.setText("");
              textField_decision_7.setText("");
              type_visa2.setSelectedItem("choisir visa");
									}
		});
	 
	 btnNewButton_save_modification_decision3.setIcon(new ImageIcon(img13));
	 btnNewButton_save_modification_decision3.setFont(new Font("Tahoma", Font.PLAIN, 20));
	 btnNewButton_save_modification_decision3.setBounds(621, 455, 170, 49);
	 decision_pannel4.add(btnNewButton_save_modification_decision3);
			
		
	 JButton btnNewButton_retour_decision3 = new JButton("");
	 btnNewButton_retour_decision3.setBorderPainted(false);
	 btnNewButton_retour_decision3.setContentAreaFilled(false);
	 btnNewButton_retour_decision3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				decision_pannel1.setVisible(true);
				decision_pannel4.setVisible(false);
			}
		});
		
	 btnNewButton_retour_decision3.setIcon (new ImageIcon(img10));
	 btnNewButton_retour_decision3.setBounds(20, 20, 50, 50);
		decision_pannel4.add(btnNewButton_retour_decision3);
		
		
		panel_par_defaut.add(decision_pannel4);
		
		
 // suppression  d'un decision panel *************************************** 
		
		
	
		JButton btnNewButton_retour_decision2 = new JButton("");
		btnNewButton_retour_decision2.setBorderPainted(false);
		btnNewButton_retour_decision2.setContentAreaFilled(false);
		btnNewButton_retour_decision2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decision_pannel1.setVisible(true);
				decision_pannel3.setVisible(false);
			}
		});
		
		btnNewButton_retour_decision2.setIcon (new ImageIcon(img10));
		btnNewButton_retour_decision2.setBounds(20, 20, 50, 50);
		decision_pannel3.add(btnNewButton_retour_decision2);
		
		
		JTextField textField_decision_9= new JTextField();
		textField_decision_9.setBounds(286, 187, 276, 35);
		decision_pannel3.add(textField_decision_9);
		textField_decision_9.setColumns(10);
		
		JLabel	lbl_decision_11 = new JLabel("Saisir id_decision : ");
		lbl_decision_11.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbl_decision_11.setBounds(86, 183, 190, 35);
		decision_pannel3.add(lbl_decision_11);
		
		JButton btn_supprimer_decision2= new JButton("Supprimer");
		btn_supprimer_decision2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_supprimer_decision2.setBounds(578, 277, 133, 31);
		btn_supprimer_decision2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
           if ((textField_decision_9.getText().length()==0))
        	   
        	   
          JOptionPane.showMessageDialog(null, "veuillez saisir une decision");
          else if(JOptionPane.showConfirmDialog(null,"vous voullez vraiment supprimer cette decision ","supprimer decision",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) 
					 
                    	 {
        	                 Methodes m_sup3=new Methodes();
                             m_sup3.supprimer_decision(textField_decision_9.getText());
                             JOptionPane.showMessageDialog(null, "suppression avec succés "); 
                         }
           else {}
           
           
                     textField_decision_9.setText(" ");

			}});
		decision_pannel3.add(btn_supprimer_decision2);
		
		panel_par_defaut.add(decision_pannel3);

	
		}}
