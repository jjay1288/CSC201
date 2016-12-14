//Ronald Phillips
public enum TrafficLight {  
    RED(30),  
    GREEN(120),  
    YELLOW(15);

    private final int duration; 

    TrafficLight(int durat) { 
        this.duration = durat; 
    }  

    public int getDuration() { 
        return this.duration; 
    } 
}