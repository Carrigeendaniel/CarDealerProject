//PS7Qb.java
/*This GUI program analyses a piece of text entered by the user, displaying the results on a text-area*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class VehicleGUI2 extends JFrame implements ActionListener {


	JPanel searchHolder1, searchHolder2, searchHolder3, searchHolder4,searchHolder5, resultsPanel;
	JLabel promptLabel1, promptLabel2, promptLabel3, promptLabel4;
	JTextField textField1, textField2, textField3, textField4;
	JTextArea textArea1, textArea2, textArea3, textArea4, resultsBox;
	JButton searchButton;

	public VehicleGUI2() {
		super("Used Car Dealer");
		setLayout(new FlowLayout());//To add extra to grid change 3 to 4
		searchHolder1 = new JPanel();//is first grid in GridLayout
		searchHolder2 = new JPanel();
		searchHolder3 = new JPanel();
		searchHolder4 = new JPanel();
		searchHolder5 = new JPanel();
		resultsPanel = new JPanel(null);
		resultsPanel.setSize(650,500);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		promptLabel1 = new JLabel("Enter Make", JLabel.CENTER);
		promptLabel2 = new JLabel("Enter Model", JLabel.CENTER);
		promptLabel3 = new JLabel("Enter Year", JLabel.CENTER);
		promptLabel4 = new JLabel("Enter Engine Type", JLabel.CENTER);


		textField1 = new JTextField(20);
		textField2 = new JTextField(20);    //Where text is written
		textField3 = new JTextField(20);
		textField4 = new JTextField(20);

		textArea1 = new JTextArea();
		textArea2 = new JTextArea();
		textArea3 = new JTextArea();
		textArea4 = new JTextArea();

		searchButton = new JButton();
		searchButton.setText("Search");

		resultsBox = new JTextArea();


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
		searchHolder5.add(searchButton);
		/*******************************/
		resultsPanel.add(resultsBox);
		resultsBox.setSize(600,200);
		resultsPanel.setVisible(true);



		/*********************************/
		searchHolder1.setBackground(Color.green); //all jpanels have to be changed colour individualyy
		searchHolder1.setSize(650,200);

		searchHolder2.setBackground(Color.white);
		searchHolder2.setSize(650,200);

		searchHolder3.setBackground(Color.green);
		searchHolder3.setSize(650,200);

		searchHolder4.setBackground(Color.white);
		searchHolder4.setSize(650,200);

		/********************************/
		add(searchHolder1);
		add(searchHolder2);
		add(searchHolder3);
		add(searchHolder4);
		add(searchHolder5);
		add(resultsPanel);
		/*searchHolder2.setVisible(false);
		searchHolder3.setVisible(false);//Hides second box until used
		searchHolder4.setVisible(false);*/
		setResizable(true);//Cant change window size by end user
		setVisible(true);//Everything on gui
		setSize(650, 1000);
	}


	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == textField1) {
			textArea1.setText("Yes we have Ford");

			searchHolder2.setVisible(true);//to go onto the next text enter
		}

		if (e.getSource() == textField2) {
			textArea2.setText("Yes we have Ford");
			searchHolder3.setVisible(true);
		}

		if (e.getSource() == textField3) {
			textArea3.setText("Year 1997");
			searchHolder4.setVisible(true);
		}

		if (e.getSource() == textField4) {
			textArea4.setText("Engine type Disel");

		}

	}
}
		







