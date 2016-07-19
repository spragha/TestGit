import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;


public class LoadingFileFromClassPath {


	public final static String KM_PROP="java_ws.ini";

	public static void main(String[] args) throws IOException {

		 InputStream LoadFile= LoadingFileFromClassPath.class.getResourceAsStream(KM_PROP);

		 URL Path=LoadingFileFromClassPath.class.getResource(KM_PROP);
		 InputStream LoadFile1=Path.openStream();

		 Properties properties=new Properties();
		 properties.load(LoadFile);

		 System.out.println(properties.getProperty("keyStorePath"));
	}

}
