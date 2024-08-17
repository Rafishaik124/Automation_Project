package com.vtiger.genericutilities;

public class cd_op {
public static void main(String[] args) throws Throwable {
	PropertyFileUtility pf=new PropertyFileUtility();
	String r = pf.readDataFromPF("un");
	System.out.println(r);
	String r1 = pf.readDataFromPF("pwd");
	System.out.println(r1);
	String r2 = pf.readDataFromPF("browser");
	System.out.println(r2);
	String r3 = pf.readDataFromPF("url");
	System.out.println(r3);
}
}
