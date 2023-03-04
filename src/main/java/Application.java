import java.util.Map;


public class Application {
    /**
     * This class contains a main method that allows you to manually test the Exception lab.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     *
     * The Lab.mustThrow method should throw an exception.
     */
    public static void main(String[] args) {
        Lab mapLab = new Lab();
        Map<Integer, String> myMap = mapLab.createMap();
        System.out.println(myMap);

        

    }
}
