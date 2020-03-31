
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstWindow extends JFrame {

	JFrame itself = this; //reference of this frame
	private JPanel p; //panel
	private JButton next, close; //two btns
	
	
	/**
	 * default constructor
	 */
	public FirstWindow() {
		
		attributeManager(); //attributeManager()
		component(); //component()
		validate(); //validate()
	}

	public void component() {
		
		next = new JButton("NEXT");
		next.setActionCommand("NEXT");
		
		close = new JButton("CLOSE");
		close.setActionCommand("CLOSE");
		p = new JPanel();
		p.add(next);
		p.add(close);
		this.add(p);

		//example of Anonymous Inner Class
		next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(e.getActionCommand().equals("NEXT")) {
					System.out.println("next clicked");
					new SecondWindow(); //invoke another window on clicking next btn
					itself.dispose(); //dispose current window
				}
			}
		});
		
		//example of Anonymous Inner Class
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(e.getActionCommand().equals("CLOSE")) {
					System.out.println("next clicked");
					
					System.exit(0); //exit the program
				}
			}
		});		
	}
	
	//init the frame
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
