import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SecondWindow extends JFrame {

	JFrame itself = this; //reference of this frame
	
	/*BOTH OF THE WAYS BELOW IN INITIALIZING ac show the same result.*/
	
	/* way 1
	 * ac is initialized by MyAC() that implements ActionListener interface 
	 * and is the inner class of SecondWindow (the outer class)
	 * ac itself and the processes in initializing are inner-based. 
	 */
	SecondWindow.MyAC ac = new SecondWindow.MyAC();
	
	
	/* way 2
	 * ac is still initialized by MyAC() that implements ActionListener interface. 
	 * In this case, 
	 * while the class MyAC is still the inner class of the SecondWindow (the outer class),
	 * the characteristic of the the class MyAC can be thought to be closer to just a class AT the SecondWindow
	 * since the type declared for ac is ActionListener, not SecondWindow.MyAC
	 * and the processes in initializing ac is consequently not going through SecondWindow.MyAC(). 
	 */
	//ActionListener ac = new MyAC();
	
	private JPanel p; //panel
	private JButton prev, close; //two btns
	
	/**
	 * default constructor
	 */
	public SecondWindow() {
		
		attributeManager();
		component();
		validate();
	}

	public void component() {
		
		prev = new JButton("PREVIOUS");
		prev.setActionCommand("PREVIOUS");
		prev.addActionListener(ac); //ac added to the btn
		
		close = new JButton("CLOSE");
		close.setActionCommand("CLOSE");
		close.addActionListener(ac); //ac added to the btn
		
		p = new JPanel();
		p.add(prev);
		p.add(close);
		this.add(p);
		
	}
	
	/**
	 * example of Inner Class in an outer class
	 */
	public class MyAC implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			if(e.getActionCommand().equals("PREVIOUS")) {
				
				new FirstWindow(); //invoke another window on clicking prev btn
				itself.dispose(); //dispose current window
				
			}else {
			
				if(e.getActionCommand().equals("CLOSE")) {
					
					System.exit(0); //exit the program
				}
			}
		}		
	}
	
	//init frame
	public void attributeManager() {
	        
        this.setSize(780,320);  //set size
        this.setVisible(true);  //set this frame visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //close the project completely on clicking X
    }
	    
    public void validations() {
	        
        this.validate();    //this.validate();
        this.repaint();     //this.repaint();
    }
}
