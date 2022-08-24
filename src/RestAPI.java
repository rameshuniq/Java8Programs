import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import javax.net.ssl.HttpsURLConnection;

public class RestAPI {

	public String submitRestAPIRequest(CourseFromJavaClass course) throws IOException {

		String iteratorResponse = "";
		String scheduleResponse = new String();
		String restEndPointURI = null;

		try {

			restEndPointURI = "";

			URL url = new URL(restEndPointURI);
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");

			connection.setReadTimeout(300000);
			connection.setConnectTimeout(300000);

		} finally {
		}

		return "";
	}

}
