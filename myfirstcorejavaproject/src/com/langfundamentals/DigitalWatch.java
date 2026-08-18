package com.langfundamentals;

public class DigitalWatch {
	
	String brandName;
	String watchType;
	int price;
	
	int hours;
	int minutes;
	int seconds;
	
	void displayTime() {
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
	void displayWatchDetails() {
		System.out.println("Watch Details :");
		System.out.println("Brand Name :"+brandName);
		System.out.println("Watch Type :"+watchType);
		System.out.println("Price :"+price);
	}
	void updateHour() {
		hours+=1;
		if(hours>=24) {
			hours=0;
		}
	}
	void updateMinutes() {
		minutes+=5;
		if(minutes>=60) {
			minutes-=60;
			updateHour();
		}
	}

	public static void main(String[] args) {
		
		DigitalWatch d = new DigitalWatch();
		
		d.brandName="FASTRACK";
		d.watchType="DIGITAL";
		d.price=2500;
		d.hours=10;
		d.minutes=55;
		d.seconds=00;
		
		d.displayWatchDetails();
		d.displayTime();
		
		System.out.println("***************************************************************");
		
		d.updateHour();
		d.updateMinutes();
		
		d.displayTime();
	}

}
