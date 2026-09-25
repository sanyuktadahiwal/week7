public class RingableDevices {
    public interface Ringable{
        String ring();
    }
    public static class AlarmClock implements Ringable{
        private String time;
        public AlarmClock(String time){
            this.time = time;
        }
        @Override
        public String ring(){
            return "Alarm ringing for " + time;
        }
    }
    public static class Doorbell implements Ringable{
        private String location;
        public Doorbell(String location){
            this.location = location;
        }
        @Override
        public String ring(){
            return "Doorbell ringing at " + location;
        }
    }
    public static void ringall(Ringable[] devices){
        for(Ringable device : devices){
            System.out.println(device.ring());
        }
    }
    public static void main(String[] args){
        AlarmClock a = new AlarmClock("7:00 AM");
        Doorbell d = new Doorbell("Front Door");
        Ringable[] devices = {a, d};
        ringall(devices);
    }
}