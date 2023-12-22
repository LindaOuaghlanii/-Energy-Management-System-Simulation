package lightency;

public abstract class Component {

	public Component(String ID) {
		this.ID=ID;
	}
protected String ID;

public abstract  String getDetails();

}
