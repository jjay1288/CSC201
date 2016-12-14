//Ronald Phillips
public class TrafficLightTest {

	public static void main(String[] args) {
        
		for(TrafficLight light: TrafficLight.values()) {
			
            System.out.println("The color is: " +light);
            System.out.println("The duration is: " +light.getDuration());

	}

}
}