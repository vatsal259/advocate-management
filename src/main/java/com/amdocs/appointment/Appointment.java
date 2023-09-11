package com.amdocs.appointment;

public class Appointment 
{
	private int id;
	private int advtId;
	private String advocateName;
	private int custId;
	private String customerName;
	private String caseType;
	private String checkIn;
	private String checkOut;
	public int getId() {
		return id;
	}
	public int getAdvtId() {
		return advtId;
	}
	public String getAdvocateName() {
		return advocateName;
	}
	public int getCustId() {
		return custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCaseType() {
		return caseType;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAdvtId(int advtId) {
		this.advtId = advtId;
	}
	public void setAdvocateName(String advocateName) {
		this.advocateName = advocateName;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	@Override
	public String toString() {
		return "Appointment Id: " + id + " | Advocate Id: " + advtId + " | Advocate Name: " + advocateName + " | Customer Id: " + custId
				+ " | Customer Name: " + customerName + " | Case Type: " + caseType + " | Timing advocate is available: " + checkIn + " to "
				+ checkOut;
	}
	
}
