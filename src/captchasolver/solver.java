package captchasolver;

import java.io.*;
import javax.imageio.*;
import javax.net.ssl.HttpsURLConnection;
import javax.xml.ws.WebServiceException;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.google.gson.JsonObject;

import java.net.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.commons.codec.binary.Base64;



public class solver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		
		String mykey = "0c5d71229b104bfbf35d020c04b94116";
			
		Point image1 = new Point(470, 160);
		Point image2 = new Point(600, 160);
		Point image3 = new Point(730, 160);
		
		Point image4 = new Point(0, 0);
		Point image5 = new Point(0, 0);
		Point image6 = new Point(0, 0);
		
		Point image7 = new Point(0, 0);
		Point image8 = new Point(0, 0);
		Point image9 = new Point(0, 0);
			
		
		try {
			
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://raiblocks.net/#/distribution");
		String  handle= driver.getWindowHandle();
		 	 
		byte[] arrScreen = driver.getScreenshotAs(OutputType.BYTES);
		BufferedImage imageScreen;
		
			imageScreen = ImageIO.read(new ByteArrayInputStream(arrScreen));


		Thread.sleep(2000);
		
		
		WebElement textbox = driver.findElementByXPath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[2]/textarea");
		textbox.sendKeys("test123");
		
		
		
//		WebElement cap = driver.findElementByXPath("//span[@id = 'recaptcha-anchor']");
		WebElement frameswitch = driver.findElementByXPath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[3]/div/div/iframe");
		driver.switchTo().frame(frameswitch);				
		WebElement click = driver.findElement(By.cssSelector("div[class=recaptcha-checkbox-checkmark]"));
		click.click();	
		driver.switchTo().window(handle);
		Thread.sleep(2000);

		WebElement frameswitch2 = driver.findElementByXPath("/html/body/div[3]/div[4]/iframe");
//		driver.switchTo().frame(frameswitch2);
		
	
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage  fullImg = ImageIO.read(screenshot);	
		Point point = new Point(448, 150);
		int eleWidth = 370;
		int eleHeight = 370;
		BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "png", screenshot);
		
		int type = eleScreenshot.getType() == 0? BufferedImage.TYPE_INT_ARGB : eleScreenshot.getType();
		BufferedImage resizedImage = new BufferedImage(98, 98, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(eleScreenshot, 0, 0, 98, 98, null);
		g.dispose();	
		
		
		File screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		ImageIO.write(resizedImage, "png", screenshot3);
		
		
		FileUtils.copyFile(screenshot3, new File("c:\\test\\1.png"));
		System.out.println("file copied");

		
		File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage  fullImg2 = ImageIO.read(screenshot2);	
		Point point2 = new Point(450, 20);
		int eleWidth2 = 370;
		int eleHeight2 = 100;
		BufferedImage eleScreenshot2= fullImg.getSubimage(point2.getX(), point2.getY(), eleWidth2, eleHeight2);
		ImageIO.write(eleScreenshot2, "png", screenshot2);
		FileUtils.copyFile(screenshot2, new File("c:\\test\\2.png"));
		
		System.out.println("Success in creating image!");
		
		
		
		
		
		
		byte[] base64EncodedData = Base64.encodeBase64(loadFileAsBytesArray("c:\\test\\1.png"), true);
		writeByteArraysToFile("targetFile1", base64EncodedData);
		
		byte[] base64EncodedData2 = Base64.encodeBase64(loadFileAsBytesArray("c:\\test\\2.png"), true);
		writeByteArraysToFile("targetFile2", base64EncodedData2);
		
		
		
//		Socket socket = new Socket ("localhost", 4000);
		String site = "http://2captcha.com/in.php";
		URL url = new URL (site);
		List<NameValuePair> params = new ArrayList<NameValuePair>();
//		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
//		con.setRequestMethod("POST");
//		con.setRequestProperty("enctype", "multipart/form-data");		
//		con.setRequestProperty("method", "base64");
//		con.setRequestProperty("key", mykey);
		
	
		BufferedImage uploadimage = ImageIO.read(screenshot);
		BufferedImage uploadimage2 = ImageIO.read(screenshot2);
		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
		ByteArrayOutputStream byteArray2 = new ByteArrayOutputStream();
		ImageIO.write(uploadimage, "png", byteArray);
		ImageIO.write(uploadimage2, "png", byteArray2);
		byte[] byteImage = byteArray.toByteArray();
		String dataImage = new Base64().encodeAsString(byteImage);
		byte[] byteImage2 = byteArray2.toByteArray();
		String dataImage2 = new Base64().encodeAsString(byteImage2
				);
		
		params.add(new BasicNameValuePair("method", "base64"));
		params.add(new BasicNameValuePair("key", mykey));
		params.add(new BasicNameValuePair("recaptcha", "1"));
		params.add(new BasicNameValuePair("imginstructions", dataImage2));
		params.add(new BasicNameValuePair("column", "3"));
		params.add(new BasicNameValuePair("row", "3"));
		params.add(new BasicNameValuePair("submit", "download and get the ID"));
		params.add(new BasicNameValuePair("body", dataImage));
		
		
		

//		
//		HttpClient httpClient = new DefaultHttpClient();
//		HttpPost httpPost = new HttpPost("http://2captcha.com/in.php");
//		httpPost.setEntity(new UrlEncodedFormEntity(params));
//		HttpResponse response = httpClient.execute(httpPost);
//        System.out.println("Status: " + response);
//		
//        
//        
        
        
		
		
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("method", "base64");
		con.setRequestProperty("key", mykey);
		con.setRequestProperty("recaptcha", "1");
		con.setRequestProperty("imginstructions", dataImage2);
		con.setRequestProperty("column", "3");
		con.setRequestProperty("row", "3");
		con.setRequestProperty("submit", "download and get the ID");
		


		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(dataImage);
		wr.flush();
		wr.close();
		
		
		
		
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
	
		
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		System.out.println(response.toString());
		
		
		
		
		
//        StringBuilder stringbuilder = new StringBuilder();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()), 65728);
//        String line = null;
//        
//        while ((line = reader.readLine()) != null) {
//        	stringbuilder.append(line);
//        }
//		
//        System.out.println("Response: " + stringbuilder.toString());
        
        
        
        
        
        

		
		
		

		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	private static void encode (String sourceFile, String targetFile, boolean isChunked) throws Exception {
		
	}
	
    public static void writeByteArraysToFile(String fileName, byte[] content) throws IOException {
    	 
        File file = new File(fileName);
        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file));
        writer.write(content);
        writer.flush();
        writer.close();
 
    }
    
	public static byte[] loadFileAsBytesArray(String fileName) throws Exception {
		 
        File file = new File(fileName);
        int length = (int) file.length();
        BufferedInputStream reader = new BufferedInputStream(new FileInputStream(file));
        byte[] bytes = new byte[length];
        reader.read(bytes, 0, length);
        reader.close();
        return bytes;
 
    }
	

}
