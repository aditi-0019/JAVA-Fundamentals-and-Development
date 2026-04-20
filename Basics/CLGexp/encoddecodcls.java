import java.util.Base64;
import java.util.Scanner ;

public static void main(String[] args){
     String originalstring="Welcome to JAVA program .com  \n good day" ;

    //  create base simple encoder object 
    Base64.Encoder simpleEncoder=Base64.getEncoder() ;


    // Encoding String using simple encode 

    String encodedString= simpleEncoder.encodeToString(originalstring.getbytes());
}
