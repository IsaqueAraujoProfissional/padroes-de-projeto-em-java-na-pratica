package io.github.isaquearaujo.factory.apple.after;

import io.github.isaquearaujo.factory.apple.after.factory.IPhone11ProFactory;
import io.github.isaquearaujo.factory.apple.after.factory.IPhoneFactory;
import io.github.isaquearaujo.factory.apple.after.factory.IPhoneXFactory;
import io.github.isaquearaujo.factory.apple.after.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);
	}
}
