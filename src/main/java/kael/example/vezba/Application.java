package kael.example.vezba;

import java.util.*;

public class Application {
    public void greet(){
    List<String> greetings = new ArrayList<>();
    greetings.add("Hello");
    for (String g : greetings) {
	     System.out.println("greetings" + g);
	}
    }
    public Application() {
        System.out.println ("Inside Application");
    }
    
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
    }
}
