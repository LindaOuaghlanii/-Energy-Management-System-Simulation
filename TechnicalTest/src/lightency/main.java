package lightency;

public class main { 

    public static void main(String[] args) { 
        EnergyManager energyManager = new EnergyManager(); 
        Battery b1 = new Battery(15, "B1");
        Battery b2 = new Battery(7, "B2");
        
        SolarPanel s1 = new SolarPanel(11,"S1");
        SolarPanel s2 = new SolarPanel(9,"S2");
        
        energyManager.addComponent(s1);
        energyManager.addComponent(s2);
        energyManager.addComponent(b1);
        energyManager.addComponent(b2);
        
        int totalCapacity = energyManager.calculateTotalCapacity(); 
        System.out.println("total capacity = "+totalCapacity+"KWh");
        energyManager.showComponents();
        
    }
}
