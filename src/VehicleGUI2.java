//PS7Qb.java
/*This GUI program analyses a piece of text entered by the user, displaying the results on a text-area*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class VehicleGUI2 extends JFrame implements ActionListener{

	JButton carButton/*, bikeButton*/;
	JMenu fileMenu, bikeMenu;
	JPanel searchHolder1, searchHolder2, searchHolder3, searchHolder4;
	JLabel promptLabel1, promptLabel2, promptLabel3, promptLabel4;
	JTextField textField1, textField2, textField3, textField4;
	JTextArea textArea1, textArea2, textArea3, textArea4;
	
	public VehicleGUI2()
		{	 
			super("Used Car Dealer");
			 //JFrame cPane = new JFrame("Text Analysis");
			 setLayout(new GridLayout(4,1));//To add extra to grid change 3 to 4
			 searchHolder1 = new JPanel(new FlowLayout());//is first grid in GridLayout
			 searchHolder2 = new JPanel(new FlowLayout());
			 searchHolder3 = new JPanel(new FlowLayout());	
			 searchHolder4 = new JPanel(new FlowLayout());			 			 
			 
			 
		     //cPane.setLayout(null); //flowLayout
		     		     	     		 
			 //cPane.setSize(400,150);
			 //cPane.setSize(650,650); //Window size
			 //cPane.setLocation(70,70); //On screen
			 
			 //cPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     		 promptLabel1 = new JLabel("Enter Make", JLabel.CENTER); 
     		 promptLabel2 = new JLabel("Enter Model", JLabel.CENTER);
     		 promptLabel3 = new JLabel("Enter Year", JLabel.CENTER);
     		 promptLabel4 = new JLabel("Enter Engine Type", JLabel.CENTER);
     		 				 
 			 //cPane.add(promptLabel);
 			 //promptLabel.setSize(400,300); //(Left/Right,Up/Down)
             //promptLabel.setLocation(250,20);
 			 
 			 textField1 = new JTextField(20); 
 			 textField2 = new JTextField(20);	//Where text is written	
 			 textField3 = new JTextField(20);	
 			 textField4 = new JTextField(20);	 		 
 			// cPane.add(textField22);
 			// textField22.setSize(70,20); //(Left/Right,Up/Down)
            // textField22.setLocation(100,100);
 			 	 	 
 			 textArea1 = new JTextArea();
 			 textArea2 = new JTextArea();
 			 textArea3 = new JTextArea();
 			 textArea4 = new JTextArea();
 			 //textArea33.setText("No text entered yet");
 			// textArea33.setLocation(400,120);
 			// textArea33.setSize(150,20); //(Left/Right,Up/Down)
 			/*************************************************/ 
 /*			 Font font = new Font("monospaced",Font.PLAIN,30);
 			 textArea1.setFont(font);
 			 textArea2.setFont(font);
 			 //(Left/Right,Up/Down)*/
 			/************************************************/ 				 
 			//cPane.add(textArea33);
 			 	 	 		 		 				 
			
			 
			 textField1.addActionListener(this);
			 textField2.addActionListener(this);
			 textField3.addActionListener(this);
			 textField4.addActionListener(this);
			 /******************************/
			 searchHolder1.add(promptLabel1);	 
			 searchHolder1.add(textField1);
			 searchHolder1.add(textArea1);
			 /******************************/
			 searchHolder2.add(promptLabel2);	 
			 searchHolder2.add(textField2);
			 searchHolder2.add(textArea2);
			 /******************************/
			 searchHolder3.add(promptLabel3);	 
			 searchHolder3.add(textField3);
			 searchHolder3.add(textArea3);
			 /*********************************/
			 searchHolder4.add(promptLabel4);	 
			 searchHolder4.add(textField4);
			 searchHolder4.add(textArea4);
			 /*******************************/
			 searchHolder1.setBackground(Color.green); //all jpanels have to be changed colour individualyy
			 searchHolder2.setBackground(Color.white);
			 searchHolder3.setBackground(Color.green);
			 searchHolder4.setBackground(Color.white);
			/********************************/			
			 add(searchHolder1);
			 add(searchHolder2);
			 add(searchHolder3);
			 add(searchHolder4);
			 searchHolder2.setVisible(false); 
			 searchHolder3.setVisible(false);//Hides second box until used
			 searchHolder4.setVisible(false);
			 setResizable(false);//Cant change window size by end user 		 	 	 
			 setVisible(true);//Everything on gui
			 setSize(650,450);
		}	
	
	public static void main(String args[])
		{	 		
			 VehicleGUI2 guiApp = new VehicleGUI2();
		}	 	 			 
			 		
	

		public void actionPerformed(ActionEvent e)
			{	
				
				if(e.getSource() == textField1)
						{
							//	String text = textField1.getText();	
									
							    textArea1.setText("Yes we have Ford");
						/*		Font font = new Font("monospaced",Font.PLAIN,30);
 			 					textArea1.setFont(font);	*/
							//	int lowercase=0,uppercaseVowels=0;
								
							/*	for(int i=0;i<text.length();i++)
								{
									if(Character.isLowerCase(text.charAt(i)))
										lowercase++;	
									
									if(text.charAt(i)=='A' || text.charAt(i)=='E' || text.charAt(i)=='I' || text.charAt(i)=='O' || text.charAt(i)=='U')
										uppercaseVowels++;
										
								}	
								
								textArea1.setText("Yes we have Ford","Total number of characters in text: " + text.length() + 
									             "\nNumber of lowercase letters in the text: " + lowercase +
									             "\nNumber of uppercase vowels in the text: " + uppercaseVowels);	
							 */
							 //setSize(350,300);
							 searchHolder2.setVisible(true);//to go onto the next text enter
						}
				
				if(e.getSource() == textField2)
						{
						 	
						 //setSize(350,500);
						 
						 /**************************/
						
						 
						 	textArea2.setText("Yes we have Ford");	
						 		searchHolder3.setVisible(true);
						}			  			
			
				if(e.getSource() == textField3)
						{
						 
						 textArea3.setText("Year 1997");		
						 //setSize(350,500);
						 
						 searchHolder4.setVisible(true);
						}
				
				if(e.getSource() == textField4)
						{
						 
						  textArea4.setText("Engine type Disel");	
						 //setSize(350,500);
						 //searchHolder3.setVisible(true);
						}			
			}
	
		

}






