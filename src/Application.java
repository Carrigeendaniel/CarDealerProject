//Driver and GUI class

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*; //Saving to external file


public class Application extends JFrame implements ActionListener, Serializable {

    JMenu stockMenu;
    JMenuItem item1, item2, item3, item4, item5;
    JPanel inputPanel,resultsPanel;
	JLabel makeLabel, modelLabel, yearLabel, engineLabel;
	JTextField makeField, modelField, yearField, engineField;
	JTextArea resultsBox;
	JButton searchButton;
    JFrame frame;
    ObjectOutputStream os;//Allows you to output data from your program, eg to a file
    static ObjectInputStream is;//The opposite, allows you to take in information to your program
	static Dealership traleeDealer;//Object of our dealership class

	public Application() {

        /**Creating the gui container**/
        frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setResizable(true);//Cant change window size by end user
        frame.setVisible(true);//Everything on gui

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**Creating the panels that go on the frame
         * and adding them to the frame**/
        inputPanel = new JPanel();//Panel sits on JFrame
		inputPanel.setSize(650, 300);
        inputPanel.setBackground(Color.red); //all jpanels have to be changed colour individualyy

		resultsPanel = new JPanel();//Make object name relevant


        frame.add(inputPanel, BorderLayout.SOUTH);
        frame.add(resultsPanel,  BorderLayout.SOUTH);

        /**Creating the labels for the interface**/
        makeLabel = new JLabel("Enter Make", JLabel.CENTER);
		modelLabel = new JLabel("Enter Model", JLabel.CENTER);
		yearLabel = new JLabel("Enter Year", JLabel.CENTER);
		engineLabel = new JLabel("Enter Engine Type", JLabel.CENTER);

        /**Creating the fields for the interface**/
		makeField = new JTextField(20);
		modelField = new JTextField(20);
		yearField = new JTextField(20);
		engineField = new JTextField(20);

        /**adding the labels and fields to the input panel**/
        inputPanel.add(makeLabel);
        inputPanel.add(makeField);

        inputPanel.add(modelLabel);
        inputPanel.add(modelField);

        inputPanel.add(yearLabel);
        inputPanel.add(yearField);

        inputPanel.add(engineLabel);
        inputPanel.add(engineField);

        /**creating the search button and adding it to the input panel**/
		searchButton = new JButton();
		searchButton.setText("Search");

        inputPanel.add(searchButton);

        /**creating the results text area and adding it to the results panel**/
        resultsBox = new JTextArea();
        resultsBox.setSize(300,200);
        resultsPanel.setVisible(true);

        resultsPanel.add(resultsBox);

        /**adding action listeners to what require them**/
		makeField.addActionListener(this);
		modelField.addActionListener(this);
		yearField.addActionListener(this);
		engineField.addActionListener(this);
		searchButton.addActionListener(this);

        /***************Menu Stuff******************/
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        frame.setJMenuBar(menuBar);

        stockMenu = new JMenu("Stock Management");
        menuBar.add(stockMenu);

        item1 = new JMenuItem("Import Stock Data");
        item1.addActionListener(this);
        stockMenu.add(item1);

        item2 = new JMenuItem("Export Stock Data");
        item2.addActionListener(this);
        stockMenu.add(item2);

        stockMenu.addSeparator();

        item3 = new JMenuItem("Add Car To Stock");
        item3.addActionListener(this);
        stockMenu.add(item3);
        item4 = new JMenuItem("Add Motorcycle To Stock");
        item4.addActionListener(this);
        stockMenu.add(item4);

        stockMenu.addSeparator();

        item5 = new JMenuItem("Exit");
        item5.addActionListener(this);
        stockMenu.add(item5);

        frame.setSize(650, 1000);
	}

	public void actionPerformed(ActionEvent e) {//What happens when an event occurs

		if (e.getSource() == searchButton) {//The event is the search button being clicked do this

            resultsBox.setText("");//Clears previous search results when search button is clicked

            processSearch();//
        }

        if (e.getActionCommand().equals ("Export Stock Data")) //if you click "Export Stock Data" in the menu
        {
            save(); //Execute this method. See below

        }

        if (e.getActionCommand().equals ("Import Stock Data"))//if you click "Import Stock Data" in the menu
        {
            open();//Execute this method. See below
        }
        if (e.getActionCommand().equals ("Add Car To Stock"))//if you click "Add Car To Stock" in the menu
        {
            addCarToStock();//Execute this method. See below

        }

        if (e.getActionCommand().equals ("Add Motorcycle To Stock"))//if you click "Add Motorcycle To Stock" in the menu
        {
            addMotorcycleToStock();//Execute this method. See below
        }
        if (e.getActionCommand().equals ("Quit"))
        {
            System.exit(0);
        }

	}

    public static void main(String args[])
	{
        traleeDealer = new Dealership();

        Car car1 = new Car("Ford", "Mondeo", 2015, "Diesel", 25000, true);
        Car car2 = new Car("Ford", "Focus", 2012, "Diesel", 16000, true);
        Car car3 = new Car("Ford", "Focus", 2009, "Petrol", 10000, true);
        Car car4 = new Car("Toyota", "Avensis", 2014, "Petrol", 15000, true);
        Car car5 = new Car("Toyota", "Yaris", 2012, "Diesel", 15000, false);
        Car car6 = new Car("Nissan", "Pulsar", 2016, "Petrol", 22000, true);
        Car car7 = new Car("Nissan", "Almera", 2003, "Diesel", 5000, false);
        Car car8 = new Car("Opel", "Astra", 2003, "Petrol", 3000, true);

        Motorcycle motorcycle1 = new Motorcycle("Yamaha", "dX7", 2009, "Petrol", 10000);
        Motorcycle motorcycle2 = new Motorcycle("Ducatti", "Turbo", 2013, "Diesel", 20000);

        traleeDealer.addVehicle(car1);
        traleeDealer.addVehicle(car2);
        traleeDealer.addVehicle(car3);
        traleeDealer.addVehicle(car4);
        traleeDealer.addVehicle(car5);
        traleeDealer.addVehicle(car6);
        traleeDealer.addVehicle(car7);
        traleeDealer.addVehicle(car8);

        traleeDealer.addVehicle(motorcycle1);
        traleeDealer.addVehicle(motorcycle2);

        Application guiApp = new Application();

	}

	/**This method instantiates an ObjectOutputStream Object.
     * This allows the traleeDealer object to be outputed to
     * an external file called stock.dat**/
    public void save(){
        try{

            os = new ObjectOutputStream(new FileOutputStream("stock.dat"));
            os.writeObject(traleeDealer);
            os.close();
            JOptionPane.showMessageDialog(null,"Stock Data Saved");}

        catch(IOException e){
            JOptionPane.showMessageDialog(null,"Save was NOT successful");
            e.printStackTrace();
        }

    }

    /**This method instantiates an ObjectInputStream Object. This retrieves the traleeDealer object that was previously saved to the stock.dat file
     * this method also gets the stock information that was saved in that onject, and puts it into our current traleeDealer file.
     * This allows us to save your stock and then uploaded the latest version when the application is launched**/
    public static void open() {
        try{

        is = new ObjectInputStream(new FileInputStream("stock.dat")); //reads in the stock.dat file
        traleeDealer = (Dealership) is.readObject(); //gets the traleeDealer object from the file and sets the applications traleeDealer to it.

        is.close();
        JOptionPane.showMessageDialog(null,"Successfully loaded in stock data");

    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"open didn't work");
        e.printStackTrace();
    }
    }

    /**This method allows a user to add a new Car into the stock of traleeDealer, from the GUI**/
    public static void addCarToStock() {

        String make = JOptionPane.showInputDialog(null, "Enter Car Manufacturer: ", "Add details", JOptionPane.INFORMATION_MESSAGE);
        String model = JOptionPane.showInputDialog(null,"Enter Car Model: ", "Add Details", JOptionPane.INFORMATION_MESSAGE);
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Year of registration: ","Add Details", JOptionPane.INFORMATION_MESSAGE));
        String engine = JOptionPane.showInputDialog(null, "Enter Engine Type (Petrol or Diesel): ","Add Details", JOptionPane.INFORMATION_MESSAGE);
        Boolean nct = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"NCT? Enter true or false ","Add Details",JOptionPane.INFORMATION_MESSAGE));
        double price = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Car Price: ","Add Details", JOptionPane.INFORMATION_MESSAGE));

        Car c1 = new Car(make, model, year, engine, price, nct);

        traleeDealer.addVehicle(c1);
    }

    /**This method allows a user to add a new Motorbike into the stock of traleeDealer, from the GUI
     * **/
    public static void addMotorcycleToStock() {


        String make = JOptionPane.showInputDialog(null, "Enter Motorcycle Manufacturer: ", "Add details", JOptionPane.INFORMATION_MESSAGE);
        String model = JOptionPane.showInputDialog(null,"Enter Motorcycle Model: ", "Add Details", JOptionPane.INFORMATION_MESSAGE);
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Year of registration: ","Add Details", JOptionPane.INFORMATION_MESSAGE));
        String engine = JOptionPane.showInputDialog(null, "Enter Engine Type (Petrol or Diesel): ","Add Details", JOptionPane.INFORMATION_MESSAGE);
        double price = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Motorcycle Price: ","Add Details", JOptionPane.INFORMATION_MESSAGE));

        Motorcycle m1 = new Motorcycle(make, model, year, engine, price);

        traleeDealer.addVehicle(m1);
    }


    /**
     * Searches the stock attribute (which is an ArrayList of vehicles) of the Dealership class for vehicles that match the search terms
     * It then updates the resultsBox with the correct results
     * @return void
     */
    private void processSearch() {


        for (Vehicle vehicleCurrentlyBeingProcessed :traleeDealer.getStock()) {//advanced for loop//This executes the below code for every Vehicle in our arraylist called traleeDealer.stock
                                            //For each Vehicle object (which  will be called vehicleCurrentlyBeingProcessed) in the arrayList, do the following

            if ((vehicleCurrentlyBeingProcessed.getMake().equals(makeField.getText())) && //If you search by Vehicle MAKE, and left the other three fields blank
                (modelField.getText().equals("")) &&
                (yearField.getText().equals("")) &&
                (engineField.getText().equals("")))
                {
                    resultsBox.append(vehicleCurrentlyBeingProcessed.toString()); //put the results in the results box that match your search
                }


            else if ((vehicleCurrentlyBeingProcessed.getModel().equals(modelField.getText())) && //If you search by Vehicle MODEL, and left the other three fields blank
                (makeField.getText().equals("")) &&
                (yearField.getText().equals("")) &&
                (engineField.getText().equals("")))
                {
                    resultsBox.append(vehicleCurrentlyBeingProcessed.toString()); //put the results in the results box that match your search
                }

            else if ((String.valueOf(vehicleCurrentlyBeingProcessed.getYear()).equals(yearField.getText())) && //If you search by Vehicle YEAR, and left the other three fields blank
                (makeField.getText().equals("")) &&
                (modelField.getText().equals("")) &&
                (engineField.getText().equals("")))
                {
                    resultsBox.append(vehicleCurrentlyBeingProcessed.toString()); //put the results in the results box that match your search
                }
            else if ((vehicleCurrentlyBeingProcessed.getEngine().equals(engineField.getText())) && //If you search by Vehicle ENGINE, and left the other three fields blank
                (makeField.getText().equals("")) &&
                (modelField.getText().equals("")) &&
                (yearField.getText().equals("")))
                {
                    resultsBox.append(vehicleCurrentlyBeingProcessed.toString()); //put the results in the results box that match your search
                }
            else if ((vehicleCurrentlyBeingProcessed.getModel().equals(modelField.getText())) && //If you search by Vehicle MAKE AND MODEL, and left the other two fields blank
                (vehicleCurrentlyBeingProcessed.getMake().equals(makeField.getText())) &&
                (yearField.getText().equals("")) &&//
                (engineField.getText().equals("")))
                {
                    resultsBox.append(vehicleCurrentlyBeingProcessed.toString()); //put the results in the results box that match your search
                }

            else if ((vehicleCurrentlyBeingProcessed.getModel().equals(modelField.getText())) &&
                (vehicleCurrentlyBeingProcessed.getMake().equals(makeField.getText())) &&
                (String.valueOf(vehicleCurrentlyBeingProcessed.getYear()).equals(yearField.getText())) &&//
                (engineField.getText().equals("")))
                {
                    resultsBox.append(vehicleCurrentlyBeingProcessed.toString()); //put the results in the results box that match your search
                }
            //TODO new bits to algo
            else if ((vehicleCurrentlyBeingProcessed.getModel().equals(modelField.getText())) && //If you search by Vehicle MAKE AND MODEL, and left the other two fields blank
                (vehicleCurrentlyBeingProcessed.getMake().equals(makeField.getText())) &&
                (yearField.getText().equals("")) &&//
                (engineField.getText().equals("")))
                {
                    resultsBox.append(vehicleCurrentlyBeingProcessed.toString()); //put the results in the results box that match your search
                }


            /**TODO add to algo**/
        }
    }

}
		







