package datamodel;
import java.util.Date;

public class Payment {
	private int PayId;
	private String payMode;
	private Date paydate;
	public int getPayId() {
		return PayId;
	}
	public void setPayId(int payId) {
		PayId = payId;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public Date getPaydate() {
		return paydate;
	}
	public void setPaydate(Date paydate) {
		this.paydate = paydate;
	}
	
	
	
}
