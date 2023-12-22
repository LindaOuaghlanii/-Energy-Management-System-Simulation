package lightency;
import java.util.List;
import java.util.ArrayList;

public class EnergyManager {
    private List<Component> components = new ArrayList<>();


    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public int calculateTotalCapacity() {
        int totalCapacity = 0;
        for (Component component : components) {
            if (component instanceof Battery) {
                Battery battery = (Battery) component; 
                totalCapacity += battery.getCapacity();
            }
        }
        return totalCapacity;
    }
    public void showComponents() {
    	for (Component component : components) {
        	System.out.print(component.getDetails()+" | ");
        }
    }
   
}