package lightency;

public class Battery extends Component {
private  int capacity ;

public Battery(int capacity , String ID) {
	super(ID);
	 this.capacity=capacity;
}

@Override
public String getDetails() {
	return ID;
}
public int getCapacity() {
	return capacity;
}



}
