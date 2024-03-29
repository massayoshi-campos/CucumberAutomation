package br.com.common;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Massayoshi Campos Criado em Janeiro/2020
 * @version 1.0.0
 * @since Release 1.0
 */

public class Property {
	
	public static String CHROME_DRIVE_PATH;
	public static String IE32_DRIVE_PATH;
	public static String FIREFOX_DRIVE_PATH;
	public static String EDGE_DRIVE_PATH;
	public static String OPERA_DRIVE_PATH;


	public static final String BROWSER_NAME;
	public static final String SITE_ADDRESS;

	private static final String PROPERTIES_FILE = "br/com/properties/config.properties"; 

	static {
		CHROME_DRIVE_PATH = new File("").getAbsolutePath() + "\\main\\resources\\chromedriver.exe";
		FIREFOX_DRIVE_PATH = new File("").getAbsolutePath() + "\\main\\resources\\geckodriver.exe";
		BROWSER_NAME = get("browser.name");
		SITE_ADDRESS = get("site.address");
				
			}

	/**
	 * Metodo para pegar o valor de alguma propriedade no arquivo de configuração do Selenium.
	 * O caminho e o nome do arquivo podem ser trocados.
	 */
	private static String get(String name) {
		Properties properties = new Properties();
		String value = null;
		try {
			properties.load(Property.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE));
			value = properties.getProperty(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}


}
