public abstract class GardenTool(){
    public abstract String use();
}
public class BackyardToolshedRoutine extends GardenTool{
    public cuttingTools(){
        super.use(){
            return "Using the tool in the garden, blade sharpened first"
        }
    }
    public Pruner(){
        super.use(){
            return "Using the tool in the garden, blade sharpened first, then trimming branches precisely"
        }
    }
    public static void main(String[] args){
        CuttingTool c = new CuttingTool();
        c.use()
        Pruner p = new Pruner();
        p.use()
    }
}