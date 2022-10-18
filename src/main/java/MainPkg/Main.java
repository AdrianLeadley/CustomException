package MainPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
public class Main {

    static ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "R", "C#", "Swift"));

    public void checkLanguage(String language) throws CustomException {

        if(languages.contains(language)){
            throw new CustomException(language + " Already Exists");
        }
        else {
            languages.add(language);
            System.out.println(language + " is added to the arraylist");
        }

    }

    public static void main(String[] args){
        Main obj = new Main();
        try{
            obj.checkLanguage("fhvjd");
            obj.checkLanguage("dfe");
            obj.checkLanguage("dotNET");
            obj.checkLanguage("Java");

        } catch (CustomException e){
            System.out.println(e);
        }

        System.out.println(languages);

    }
}
