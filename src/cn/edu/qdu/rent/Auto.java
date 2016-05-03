package cn.edu.qdu.rent;

public abstract class Auto {
	private String number;
	private int dailyRate;
	
	public Auto(String number){
		this.number=number;
	}
	public double rent(int day){
		System.out.println("该车日租价为："+dailyRate);
		return dailyRate*day;
	}
	public String getNumber() {
		return number;
	}
	public void setNoumber(String number) {
		this.number = number;
	}
	public int getDailyRate() {
		return dailyRate;
	}
	public void setDailyRate(int dailyRate) {
		this.dailyRate = dailyRate;
	}

}
