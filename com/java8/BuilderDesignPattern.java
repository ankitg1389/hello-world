class Vehicles {
    //required param
    private int wheel;
    private String engine;

    //optional param
    private int airbags;

    public int getWheel() {
        return wheel;
    }

    public String getEngine() {
        return engine;
    }

    public int getAirbags() {
        return airbags;
    }
    private Vehicles(Builder builder){
        this.wheel = builder.wheel;
        this.engine = builder.engine;
        this.airbags = builder.airbags;
    }

    public static class Builder{
        private int wheel;
        private String engine;
        private int airbags;

        public Builder(int wheel, String engine) {
            this.wheel = wheel;
            this.engine = engine;
        }

        public Builder airbags(int airbags) {
            this.airbags = airbags;
            return this;
        }
        public Vehicles build(){
            return new Vehicles(this);
        }
    }
}

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Vehicles Vehicles = new Vehicles.Builder(4, "1000cc").airbags(4).build();
        System.out.println(Vehicles.getWheel() + ", " + Vehicles.getAirbags()+ ", " + Vehicles.getEngine());

        Vehicles veh = new Vehicles.Builder(2, "100cc").build();
        System.out.println(veh.getWheel() + ", " + veh.getAirbags()+ ", " + veh.getEngine());
    }
}
