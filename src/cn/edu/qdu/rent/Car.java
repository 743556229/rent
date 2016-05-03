package cn.edu.qdu.rent;

import java.util.Scanner;

public class Car extends Auto{
    private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Car(String number) {
		super(number);
	}
	public double rent(int day){
		if(type.equals("bmw")){
			setDailyRate(500);
		}
		else if(type.equals("Audi")){
			setDailyRate(400);
		}
		else{
			setDailyRate(600);
		}
		return super.rent(day);
	}
}
