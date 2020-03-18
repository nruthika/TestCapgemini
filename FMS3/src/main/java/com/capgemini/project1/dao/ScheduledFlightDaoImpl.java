package com.capgemini.project1.dao;

import com.capgemini.project1.Model.*;
import com.capgemini.project1.Service.*;
import com.capgemini.project1.UI.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.project1.Service.*;



public class ScheduledFlightDaoImpl implements ScheduledFlightDao 
{
	
	static HashMap<Integer,ScheduledFlight> l=new HashMap<Integer,ScheduledFlight>(); 
	
	public int scheduleFlight(ScheduledFlight flight)
	{
	
		l.put(flight.getFlightno(),flight);
		int a=flight.getFlightno();
		
		
		return a;
	}
	
	public ScheduledFlight viewScheduledFlights(int flightId)
	{
		ScheduledFlight sf=new ScheduledFlight();
		if(l.containsKey(flightId))
		{
			sf=l.get(flightId);
			return sf;
		}
		else
			return sf;
	}
	public List<ScheduledFlight> viewScheduledFlight()
	{
		Collection<ScheduledFlight> c=l.values();
		List<ScheduledFlight> list=new ArrayList<ScheduledFlight>((Collection)c);	
		
	return list;
}
	
	  public ScheduledFlight modifyScheduledFlight(int flight,ScheduledFlight sfdto,int i) throws ParseException
	  {
		
		  Scanner s=new Scanner(System.in);
		  ScheduledFlight sfd=new ScheduledFlight();
		  String nv;
		  int newNo;
		  if(l.containsKey(flight))
		  {
			  switch(i)
		  
		  {  case 1:
			  		 
			  		System.out.println("Enter modified model");
			  		 nv=s.next()+s.nextLine();
			  		sfdto.setFlightmodel(nv);
			  		//System.out.println(sfdto);
			  		 sfd=l.replace(flight,sfdto);
			  		
			  		break;
			  		
		  case 2:	  
	  				System.out.println("Enter modified carrier name");
	  				nv=s.next()+s.nextLine();
	  				sfdto.setCarriername(nv);
	  				
			  		break;
		  case 3: 	
			  		  
			  		System.out.println("Enter modified seat capacity");
			  		newNo=s.nextInt();
			  		sfdto.setSeatcapacity(newNo);
			  		
			  
			  		break;
		  case 4:
			  	  
			  		System.out.println("Enter modified airport name");
			  		nv=s.next()+s.nextLine();
			  		sfdto.setAirportName(nv);
			  		
			  		break;
		  case 5:
			  		  
			  		System.out.println("Enter modified airport code");
			  		nv=s.next()+s.nextLine();
			  		sfdto.setAirportCode(nv);
			  		
			  		break;
		  case 6:
			  		
			  		System.out.println("Enter modified airport location");
			  		nv=s.next()+s.nextLine();
			  		sfdto.setAirportLocation(nv);
			  		
			  		
			  		break;
		  case 7:
			  	
			  		System.out.println("Enter modified source airport name");
			  		nv=s.next()+s.nextLine();
			  		sfdto.setSourceAirport(nv);
			  		
		  			  		  
			  		break;
		  case 8:
			       
			       System.out.println("Enter modified destination airport name");
			       nv=s.next()+s.nextLine();
			       sfdto.setDestinationAirport(nv);
			       
			  		
			  		break;
		  case 9:	
			  		
			  		System.out.println("Enter modified arrival date and time");
			  		nv=s.next()+s.nextLine();
			  		Date arrivalDate = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(nv);
			  		sfdto.setArrivalDate(arrivalDate);
			  		
			  			  
			  		break;
			  		
		  case 10:
		  			
		  			System.out.println("Enter modified departure date and time");
		  			nv=s.next()+s.nextLine();
		  			Date departureDate = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(nv);
		  			sfdto.setDepartureDate(departureDate);
		  			
			  
			  		break;
		
		  default:
			  break;
			  		
		  }
			  }
		  return sfdto;
	  }
	
	public void deleteScheduledFlight(int flightno)
	{
		l.remove(flightno);
		if(l.containsKey(flightno))
		{
			System.out.println("Flight no could not be deleted ");
		}
		else
		{
			System.out.println("Flight no "+flightno+"deleted ");
		}
	}
	
}
	

