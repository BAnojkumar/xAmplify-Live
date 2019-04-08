package pom.xamplifylive.xamplifylive;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.InputStream;
import java.util.Properties;


public class PropertiesFile {


public static Properties readPropertyFile(String in){

Properties properties = new Properties();

File file = new File(in);

FileInputStream fileInput = null;
try {
fileInput = new FileInputStream(file);

} 
catch (FileNotFoundException e) {
e.printStackTrace();
}


//load properties file
try {
	properties.load(fileInput);
} catch (IOException e) {
e.printStackTrace();
}
return properties;
}


}