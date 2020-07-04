package utility;

public class DriverPath {
	public static final String currentDir = System.getProperty("user.dir");
	public static final String chromeDriver=currentDir + "\\src\\test\\java\\utility\\chromedriver.exe";
	public static final String firefoxDriver=currentDir + "\\src\\test\\java\\utility\\geckodriver.exe";
	public static final String ieDriver=currentDir + "\\src\\test\\java\\utility\\iedriver.exe";

}
