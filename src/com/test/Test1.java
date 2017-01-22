package com.test;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {

		Test1 str = new Test1();
		str.doubleNum(1237);		
		str.swap();
		str.stringConvert(101010101);
	}

	// recursion
	public void doubleNum(int n) {
		System.out.println(n);
		if (n <= 5000) {
			doubleNum(n * 2);
		}
		System.out.println(n);
	}

	//数组元素顺序颠倒
	public void swap() {

		int[] a = new int[] { (int) (Math.random() * 1000),
				(int) (Math.random() * 1000), (int) (Math.random() * 1000),
				(int) (Math.random() * 1000), (int) (Math.random() * 1000) };
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		int len = a.length;
		for (int i = 0; i < len / 2; i++) {
			int tmp = a[i];
			a[i] = a[len - 1 - i];
			a[len - 1 - i] = tmp;
		}

		System.out.println(Arrays.toString(a));
	}
	
	//金额转换
	public void stringConvert(int money) {
		final char[] data = new char[] { '零', '壹', '贰', '叁', '肆', '伍', '陆','柒', '捌', '玖' };
		final char[] units = new char[] { '元', '拾', '佰', '仟', '万', '拾', '佰','仟', '亿' };
		StringBuffer sbf = new StringBuffer();
		int unit = 0;
		while (money != 0) {
			sbf.insert(0, units[unit++]);
			int number = money % 10;
			sbf.insert(0, data[number]);
			money /= 10;
		}
		System.out.println(sbf.toString());
		System.out.println(sbf.toString().replaceAll("零[拾佰仟]","零").replaceAll("零+万","万").replaceAll("零+元","元").replaceAll("零+","零"));
		
	}

}
