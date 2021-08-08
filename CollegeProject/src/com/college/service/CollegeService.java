package com.college.service;


import com.college.exception.CityNotFoundException;
import com.college.exception.CollegeNotFoundException;
import com.college.model.College;

public interface CollegeService {
public College[] getByCity(String city) throws CityNotFoundException; 
public College[] getAll() throws CollegeNotFoundException;
public College getCollegeDetails(String collegeName) throws CollegeNotFoundException;
}
