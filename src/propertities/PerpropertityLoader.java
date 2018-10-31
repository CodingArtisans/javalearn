package propertities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class PerpropertityLoader {
    String propertityPath = System.getProperty("user.dir") + "/config/test.property";


    public String getPropertity(String key) throws IOException {
        String result = null;
        Properties p = new Properties();

//        FileReader fr = new FileReader(propertityPath);
//        p.load(fr);

//        System.out.println(System.getProperty("user.dir"));
//        System.out.println(PerpropertityLoader.class.getResource(""));
//        System.out.println(PerpropertityLoader.class.getClassLoader().getResource(""));
//        System.out.println(PerpropertityLoader.class.getClassLoader().getSystemResource(""));
//        System.out.println(ClassLoader.getSystemResource(""));

        ResourceBundle rb = ResourceBundle.getBundle("test", Locale.getDefault());
        System.out.println( rb.getString(key));

        InputStream stream = PerpropertityLoader.class.getClassLoader().getResourceAsStream("test.property");
        p.load(stream);
        result = p.getProperty(key);
        return result;
    }
}
