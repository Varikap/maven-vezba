package kael.example.vezba;

import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public int countWords(String words) {
	String[] sW = StringUtils.split(words,' ');
	return (sW == null) ? 0 : sW.length;


    }

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
	int count = app.countWords("I have four wordsxD");
	System.out.println("Word Count: " + count);
    }
}
