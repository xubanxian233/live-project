package pojo;

public class Campaign {
	private int times; // 预约轮次
	private int total;// 口罩数
	public void setTimes(int param) {
		times=param;
	}
	public void setTotal(int param) {
		total=param;
	}
	public int getTimes() {
		return times;
	}
	public int getTotal() {
		return total;
	}
}
