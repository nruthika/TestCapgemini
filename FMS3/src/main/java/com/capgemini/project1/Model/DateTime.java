package com.capgemini.project1.Model;

public class DateTime {

	private String arrivalTime;
	private String arrivalDate;
	private String departureTime;
	private String departureDate;
	public DateTime()
	{
		super();
	}
	public DateTime(String arrivalTime, String arrivalDate, String departureTime, String departureDate) {
		super();
		this.arrivalTime = arrivalTime;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.departureDate = departureDate;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	
	
	
}
