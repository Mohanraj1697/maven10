package org.screenShort;

import java.io.IOException;

import org.base.BaseClass;

public class screen extends BaseClass{
public static void main(String[] args) throws IOException {
	readExcel("Book1", "Sheet1", 1, 1);
	System.out.println("done");
	
	createExcel("mohan", "Sheet1", 1, 2, "RajMohan");
	
}
}
