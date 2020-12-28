//package com.ranhaoliu.utilsdemo;
//
//import java.io.FileReader;
//import java.io.Reader;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.Properties;
//
//public class DBUtils {
//	private static String driver;
//	private static String url;
//	private static String user;
//	private static String password;
//
//	static Connection conn = null;
//
//	static {
//		Properties properties = new Properties(); // 鍒涘缓涓�涓猵roperties瀵硅�?
//		Reader inReader; // 涓�涓猺eader灞炴��;
//
//		try {
//			String path = Thread.currentThread().getContextClassLoader().getResource("jdbc.properties").getPath();
//			inReader = new FileReader(path); // 鐢ㄨ繖涓柟娉曡幏鍙杙roperties閰嶇疆鏂囦欢;
//			properties.load(inReader); // 鍔犺浇load鍐呴儴鐨勫湴鍧�;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		// 閫氳繃properties.getProperty("driver");鏂规硶鑾峰彇鍊�
//		driver = properties.getProperty("driver");
//		url = properties.getProperty("url");
//		user = properties.getProperty("user");
//		password = properties.getProperty("password");
//	}
//
//	/**
//	 * 鎵撳紑鏁版嵁搴撹繛鎺�?
//	 * 
//	 * @return
//	 */
//	public static Connection open() {
//		try {
//			Class.forName(driver);
//			System.out.println("杩炴帴鎴愬姛......");
//			return DriverManager.getConnection(url, user, password);
//		} catch (Exception e) {
//			System.out.println("杩炴帴鏁版嵁搴撳け璐�?....");
//		}
//		return null;
//	}
//
//	/**
//	 * 鍏抽棴鏁版嵁搴撹繛鎺�?
//	 * 
//	 * @return
//	 */
//	public static Connection close() {
//		if (conn != null) {
//			try {
//				conn.close();// 鍏抽棴鏁版嵁搴�
//				System.out.println("鍏抽�?...");
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println("鏁版嵁搴撳叧闂け璐�?...");
//			}
//		}
//		return null;
//	}
//}
