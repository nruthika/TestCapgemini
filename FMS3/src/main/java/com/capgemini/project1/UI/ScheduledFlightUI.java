package com.capgemini.project1.UI;

import com.capgemini.project1.dao.*;
import com.capgemini.project1.Model.*;
import com.capgemini.project1.Service.*;
import com.capgemini.project1.Service.FlightException;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.regex.*;
public class ScheduledFlightUI {

	public static void main(String[] args) throws FlightException, ParseException 
	{

		Flight flight;
		int availableSeats = 0;
		int flightno;
		Schedule schedule;
		String arrDate, depDate, airportLocation, airportName, airportCode, carriername, flightmodel, arrTime, depTime,
				sourceAirport, destinationAirport;
		int seatcapacity;
		int id;

		Scanner s = new Scanner(System.in);

		DateTime dt = new DateTime();
		Flight f = new Flight();
		Schedule sd = new Schedule();
		Airport a = new Airport();
		ScheduledFlightServiceImpl sfservice = new ScheduledFlightServiceImpl();
		 ScheduledFlight sf=new ScheduledFlight();
		int ch = 0, ch1 = 0;

		while (ch1 != 6) {
			System.out.println("List of options");
			System.out.println("\n1.Add Schedule Flight");
			System.out.println("2.View Flights with flight no");
			System.out.println("3.View all Flight details");
			System.out.println("4.Modify Scheduled flight");
			System.out.println("5.Delete Scheduled flight");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			try 
			{
				ch1 = s.nextInt();
			s.nextLine();
			}
			catch(Exception e)
			{
				System.err.println("PLEASE ENTER CORRECT OPTION");
				s.nextLine();
			}
			switch (ch1) {
			case 1:
				
				try {
				
						System.out.println("Enter carrier name");
						carriername = s.next() + s.nextLine();
						f.setCarrierName(carriername);
						sf.setCarriername(carriername);
						
 
						System.out.println("Enter flight model");
						flightmodel = s.next() + s.nextLine();
						f.setFlightModel(flightmodel);
						sf.setFlightmodel(flightmodel);
						
						System.out.println("Enter seat capacity");
						seatcapacity = s.nextInt();
						f.setSeatCapacity(seatcapacity);
						sf.setSeatcapacity(seatcapacity);
				 		 if(seatcapacity!=(int)seatcapacity)
				 		 {
				 			 throw new FlightException("Incorrect entry type");
				 		 }
				 
				 		 System.out.println("Enter arrival date and time in dd/mm/yy hh:mm format");
				 		 arrDate = s.next() + s.nextLine();
				 		 Date arrivalDate = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(arrDate);
				 		 dt.setArrivalDate(arrDate);
				 		 sd.setArrivalTime(arrivalDate);
				 		 sf.setArrivalDate(arrivalDate);
				 		 
				 		SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy HH:mm");
					    sdfrmt.setLenient(false);
					    
					    try
					    {
					        Date mDate = sdfrmt.parse(arrDate); 
					    }
					    catch (ParseException e)
					    {
					        System.out.println(arrDate+" is Invalid Date format");
					        
					    }
				 		 

				 		 System.out.println("Enter departure date and timein dd/mm/yy hh:mm format");
				 		 depDate = s.next() + s.nextLine();
				 		 Date departureDate = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(depDate);
				 		 dt.setDepartureDate(depDate);
				 		 sd.setDepartureTime(departureDate);
				 		 sf.setDepartureDate(departureDate);
				 		 try
						    {
						        Date mDate = sdfrmt.parse(depDate); 
						      
						    }
						   
						    catch (ParseException e)
						    {
						        System.out.println(depDate+" is Invalid Date format");
						        
						    }
							
				 		 System.out.println("Enter the source airport");
				 		 sourceAirport = s.nextLine() + s.nextLine();
				 		 sd.setSourceAirport(sourceAirport);
				 		 sf.setSourceAirport(sourceAirport);
				 	 		 
				 		 				 		 
				 		 System.out.println("Enter the destination airport");
				 		 destinationAirport = s.next() + s.nextLine();
				 		 sd.setDestinationAirport(destinationAirport);
				 		 sf.setDestinationAirport(destinationAirport);
				 		
				 		 System.out.println("Enter the airport name ");
				 		 airportName = s.next() + s.nextLine();
				 		 a.setAirportName(airportName);
				 		 sf.setAirportName(airportName);
				 		

				 		 System.out.println("Enter the airport code ");
				 		 airportCode = s.next() + s.nextLine();
				 		 a.setAirportCode(airportCode);
				 		 sf.setAirportCode(airportCode);
				 		
				 		 System.out.println("Enter the airport location ");
				 		 airportLocation = s.next() + s.nextLine();
				 		 a.setAirportLocation(airportLocation);
				 		 sf.setAirportLocation(airportLocation);
				 		 
				 		
				 		
				 		System.out.println("Enter available seats");
				 		availableSeats=s.nextInt();
				 		if(availableSeats>seatcapacity)
				 		{
				 			throw new FlightException("Available seats are more than seat capacity");
				 		}
				 		
				 		
				 		
				ScheduledFlight sf50 = new ScheduledFlight(flightmodel, carriername, seatcapacity,availableSeats, airportName,airportCode, airportLocation, sourceAirport, destinationAirport,arrivalDate, departureDate);

				int updatecount = sfservice.scheduleFlight(sf50);
				System.out.println("Schedule of flight no " + updatecount + " is added");
				
				}
				catch(FlightException fe)
				{
					System.out.println(fe.getMessage());
				}
				break;

			case 2:
				System.out.println("Enter flight no to view the list of flights");
				id = s.nextInt();

				ScheduledFlight sf1 = sfservice.viewScheduledFlights(id);
				if (sf1.getFlightno() == id) {
					System.out.println("Schedule flight details: Flightno " + sf1.getFlightno() + "\n Flight model "
							+ sf1.getFlightmodel() + "\n Carrier Name " + sf1.getCarriername() + "\n Airport Name "
							+ sf1.getAirportName() + "\n Airport Code " + sf1.getAirportCode() + "\n Airport Location "
							+ sf1.getAirportLocation() + "\n Source Airport " + sf1.getSourceAirport()
							+ "\n Destination Airport " + sf1.getDestinationAirport() + "\n Arrival Date and Time "
							+ sf1.getArrivalDate() + "\n Departure Date and Time " + sf1.getDepartureDate());
				}
				// System.out.println(sf1);
				else {
					System.out.println("No");
				}

				break;
			case 3:
				List list = sfservice.viewScheduledFlight();
				Iterator i = list.iterator();
				while (i.hasNext()) {
					System.out.println(i.next());
				}
				break;
			
			  case 4:
				  System.out.println("Enter the flight no which should be modified");
				  flightno=s.nextInt();
				  
				  
				  ScheduledFlight sfbean=new ScheduledFlight();
				 
				  System.out.println("List of options ");
				  System.out.println("1.Flight model");
				  System.out.println("2.Carrier Name");
				  System.out.println("3.Seat Capacity");
				  System.out.println("4.Airport Name");
				  System.out.println("5.Airport Code");
				  System.out.println("6.Airport Location");
				  System.out.println("7.Source Airport");
				  System.out.println("8.Destination Airport");
				  System.out.println("9.Arrival Date and Time");
				  System.out.println("10.Departure Date and Time");
				  System.out.println("Enter your choice which is required to be modified");
				  int choice=s.nextInt();
				  {
					  switch(choice)
					  {
					  case 1:
						  
						  try{
							  	sfbean=sfservice.modifyScheduledFlight(flightno,sf,choice);
							  	System.out.println(sfbean);
						     }	
						  	catch (ParseException e) 
						  	{
							// TODO Auto-generated catch block
							e.printStackTrace();
						  	}
					  		
					  				break;
					  case 2:	
						  
						  try {
							  sfbean=sfservice.modifyScheduledFlight(flightno,sf,choice);
								System.out.println(sfbean);
						  	} 
						  catch (ParseException e) 
						  	{
							// TODO Auto-generated catch block
							e.printStackTrace();
						  	}
			  				
						    		break;
					  case 3:
						  try{
							  	sfbean=sfservice.modifyScheduledFlight(flightno,sf,choice);
							  	System.out.println(sfbean);
						     }	
						  	catch (ParseException e) 
						  	{
							// TODO Auto-generated catch block
							e.printStackTrace();
						  	}
						    		break;
					  case 4:
						  try{
							  	sfbean=sfservice.modifyScheduledFlight(flightno,sf,choice);
							  	System.out.println(sfbean);
						     }	
						  	catch (ParseException e) 
						  	{
							// TODO Auto-generated catch block
							e.printStackTrace();
						  	}
						  		  break;
						  		  
					  case 5:	
						  try{
							  	sfbean=sfservice.modifyScheduledFlight(flightno,sf,choice);
							  	System.out.println(sfbean);
						     }	
						  	catch (ParseException e) 
						  	{
							// TODO Auto-generated catch block
							e.printStackTrace();
						  	}
						  			break;
					  case 6:	
						  try{
							  	sfbean=sfservice.modifyScheduledFlight(flightno,sf,choice);
							  	System.out.println(sfbean);
						     }	
						  	catch (ParseException e) 
						  	{
							// TODO Auto-generated catch block
							e.printStackTrace();
						  	}
					  							  
						  			break;
					  case 7:	
						  try{
							  	sfbean=sfservice.modifyScheduledFlight(flightno,sf,choice);
							  	System.out.println(sfbean);
						     }	
						  	catch (ParseException e) 
						  	{
							// TODO Auto-generated catch block
							e.printStackTrace();
						  	}
						  
						  		break;
					  case 8:	
						  try{
							  	sfbean=sfservice.modifyScheduledFlight(flightno,sf,choice);
							  	System.out.println(sfbean);
						     }	
						  	catch (ParseException e) 
						  	{
							// TODO Auto-generated catch block
							e.printStackTrace();
						  	}
						  		break;
					  case 9:
						  try{
							  	sfbean=sfservice.modifyScheduledFlight(flightno,sf,choice);
							  	System.out.println(sfbean);
						     }	
						  	catch (ParseException e) 
						  	{
							// TODO Auto-generated catch block
							e.printStackTrace();
						  	}
						  		break;
					  case 10:
						  try{
							  	sfbean=sfservice.modifyScheduledFlight(flightno,sf,choice);
							  	System.out.println(sfbean);
						     }	
						  	catch (ParseException e) 
						  	{
							// TODO Auto-generated catch block
							e.printStackTrace();
						  	}
						  		break;
					 
					  default:
						  break;
						  
					  }
					  			
				  }
			  
			  break;
			 
			case 5:
				System.out.println("Enter flight no which should be deleted");
				flightno = s.nextInt();
				sfservice.deleteScheduledFlight(flightno);
				break;
			case 6:
				System.exit(0);
			default:

			}

		}

	}

}
