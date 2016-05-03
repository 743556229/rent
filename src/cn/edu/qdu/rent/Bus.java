package cn.edu.qdu.rent;

public class Bus extends Auto{
    private int seatCount;
	public Bus(String number) {
		super(number);
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public double rent(int day){
		if(seatCount<=16){
			setDailyRate(1000);
		}
		else {
			setDailyRate(2000);
		}
		return super.rent(day);
	}

}
