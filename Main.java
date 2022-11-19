import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

class Main
{
	public static void downloadFile(URL url, String fileName) throws Exception {
		try (InputStream in = url.openStream()) {
			Files.copy(in, Paths.get(fileName));
		}
	}
	public static void main(String[] args) throws Exception {
		// call to `downloadFile()` method
	}
}