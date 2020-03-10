import interfaces.Luxury;
import model.A3;
import model.Corolla;
import model.Fiesta;
import model.Focus;
import model.Ford;
import model.automobile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Focus fo1 =  new Focus ("Red"); //luxury family
		Corolla c1 = new Corolla ("Blue"); //luxury
		Fiesta fi1 = new Fiesta ("Green "); //sport
		A3 a31 = new A3 ("Grey");	//sport
		
		System.out.println(fo1);
		System.out.println(c1);
		System.out.println(fi1);
		System.out.println(a31);
		
		Ford [] myFord = new Ford[3];
		myFord [0] = fo1;
		myFord [1] = fi1;
		
		Luxury [] myLuxury = new Luxury [2];
		myLuxury [0] = fo1;
		myLuxury [1] = c1;
		
		for(Luxury cars : myLuxury ) {
			cars.chillChampagne();
		}
	}

}
