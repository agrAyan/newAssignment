package com.college.service;

import com.college.exception.CityNotFoundException;
import com.college.exception.CollegeNotFoundException;
import com.college.model.College;

public class CollegeServiceImplt implements CollegeService {

	

	public College [] getCollege() {
		College [] college= new College[6];
		college[0]= new College("LNCT","BHOPAL",2,70000);
		college[1]= new College("OIST","BHOPAL",6,50000);
		college[2]= new College("SGSITS","INDORE",5,4000);
		college[3]= new College("LNCTS","BHOPAL",4,70000);
		college[4]= new College("OIST","INDORE",2,60000);
		college[5]= new College("MITS","SAGAR",6,40000);
		return college;
		
	}

	@Override
	public College[] getByCity(String city) throws CityNotFoundException {
		College [] c1= new College[3];
		int count=0;
		
		College [] c= getCollege();
		try {
		for(College college: c) {
			if(college.getCity().equals(city))
				{
				c1[count]= college;
			count=count+1;
			}
			
			
		}
		if(count==0)
			throw new CityNotFoundException("city not found");
		}catch(Exception e) {
			System.out.println("city not found");
		}
		return c1;
		}
		
		
		
		

	@Override
	public College[] getAll() throws CollegeNotFoundException {
		return getCollege();
	}

	@Override
	public College getCollegeDetails(String collegeName) throws CollegeNotFoundException {
		boolean check= false;
		College [] c= getCollege();
		for(College college: c) {
			if(college.getClgName().equals(collegeName)) {
				check= true;
				return college;
			}
			
		}
		if(!check)
			throw new CollegeNotFoundException("college name is not available");
		
		return null;
		
		
	}

	
	

}
