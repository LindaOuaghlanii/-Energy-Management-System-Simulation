package lightency;
public class SolarPanel extends Component{
protected int power ;

public SolarPanel (int power , String ID ) {
	super(ID);
	this.power=power;
}


@Override
public String getDetails() {
	return ID;
}


public int generatePower() {
	System.out.print("generated power: "+power);
	return power;
}
}
