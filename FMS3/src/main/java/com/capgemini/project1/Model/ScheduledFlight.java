package com.capgemini.project1.Model;

import java.io.Serializable;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.print.attribute.DateTimeSyntax;

public class ScheduledFlight implements Serializable{

	private int flightno;
	private String flightmodel;
	private String carriername;
	private int seatcapacity;
	private int availableSeats;
	private String airportName;
	private String airportCode;
	private String airportLocation;
	private String sourceAirport;
	private String destinationAirport;
	private Date arrivalDate;
	private Date departureDate;
	
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public int getFlightno() {
		return flightno;
	}
	public void setFlightno(int flightno) {
		this.flightno = flightno;
	}
	public String getFlightmodel() {
		return flightmodel;
	}
	public void setFlightmodel(String flightmodel) {
		this.flightmodel = flightmodel;
	}
	public String getCarriername() {
		return carriername;
	}
	public void setCarriername(String carriername) {
		this.carriername = carriername;
	}
	public int getSeatcapacity() {
		return seatcapacity;
	}
	public void setSeatcapacity(int seatcapacity) {
		this.seatcapacity = seatcapacity;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	
//	@Override
//	public String toString() {
//		return "ScheduledFlight [flightno="+flightno+" flightmodel=" + flightmodel + ", carriername=" + carriername + ", seatcapacity="
//				+ seatcapacity + ", airportName=" + airportName + ", airportCode=" + airportCode + ", airportLocation="
//				+ airportLocation + ", sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport
//				+ ", arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + "]";
//	}
//	public ScheduledFlight(String flightmodel, String carriername, int seatcapacity,String airportName, String airportCode, String airportLocation, String sourceAirport,String destinationAirport,Date arrivalDate,Date departureDate) {
//		super();
//      Random r = new Random();
//		
//		
//		this.flightno = r.nextInt(9999);
//		this.flightmodel = flightmodel;
//		this.carriername = carriername;
//		this.seatcapacity = seatcapacity;
//		this.airportName = airportName;
//		this.airportCode = airportCode;
//		this.airportLocation = airportLocation;
//		this.sourceAirport = sourceAirport;
//		this.destinationAirport = destinationAirport;
//		this.arrivalDate=arrivalDate;
//		this.departureDate=departureDate;
//	}
//	
//	
	
	public ScheduledFlight(String flightmodel, String carriername, int seatcapacity, int availableSeats,
			String airportName, String airportCode, String airportLocation, String sourceAirport,
			String destinationAirport, Date arrivalDate, Date departureDate) {
		super();
		Random r = new Random();
		
		this.flightno = r.nextInt(9999);
		this.flightmodel = flightmodel;
		this.carriername = carriername;
		this.seatcapacity = seatcapacity;
		this.availableSeats = availableSeats;
		this.airportName = airportName;
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}
	@Override
	public String toString() {
		return "ScheduledFlight [ flightno="+flightno+" flightmodel=" + flightmodel + ", carriername=" + carriername
				+ ", seatcapacity=" + seatcapacity + ", availableSeats=" + availableSeats + ", airportName="
				+ airportName + ", airportCode=" + airportCode + ", airportLocation=" + airportLocation
				+ ", sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport + ", arrivalDate="
				+ arrivalDate + ", departureDate=" + departureDate + "]";
	}
	public ScheduledFlight()
	{
		super();
	}
	
	

	
}
