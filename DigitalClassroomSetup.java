public abstract class ClassroomDevice(){
    public abstract String operate();
}
public interface Chargeable{
    String charge();
    String charge(int minutes); 
}
public class DigitalClassroomSetup extends ClassroomDevice implements Chargeable{
    public Tablet(String assetTag){
        this.assetTag = assetTag;
    }
    public operate(){
        return "Tablet " + assetTag + "displaying lesson";
    }
    @Override
    public String charge(){
        return "TAB-5 charging";
    }
    @Override
    public String charge(int minutes){
        return "TAB-5 charging for " + minutes + " minutes";
    }
    public static void main(String[] args){
        Tablet t = new Tablet("TAB-5");
        t.operate();
        t.charge();
        t.charge(30);
    }
}