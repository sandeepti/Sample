/**
 * 
 */
package com.operation;

import com.DDT.ReadData;

/**
 * @author sandeepti
 *
 */
public class calltoReadDataLib {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadData rd = new ReadData("D:\\selenium\\DATA\\TestData.xlsx");
		rd.Excelconfig(0, 0, 0);

	}

}
