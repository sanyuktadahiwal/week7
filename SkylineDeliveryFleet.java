abstract class Drone(){
    public abstract String fly();
}
interface Trackable {
    String getLocation(); 
}
public class SkylineDeliveryFleet extends Drone implements Trackable{
    public DeliveryDrone(String id){
        return id;
        }
    public ScoutDrone(String id){
        return id;
        
    }
    public GroundRobot(String id){
        return id;
    }
    public getLocation(String location){
        return location;
    }
    @Override
    public String fly(){
        return id + " at " + getLocation();
    }
    static String getLocationIfTrackable(Object o){
        if(o instanceof Trackable){
            return ((Trackable) o).getLocation();
        }
        return null;
    }
    public static void main(String[] args){
        DeliveryDrone d = new DeliveryDrone("DR-1");
        getLocationIfTrackable(d);
        ScoutDrone s = new ScoutDrone("SC-1");
        getLocationIfTrackable(s);
        GroundRobot g = new GroundRobot("GR-1");
        getLocationIfTrackable(g);
    }

    @Override
    public String getLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}