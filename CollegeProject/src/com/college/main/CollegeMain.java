package com.college.main;

import java.util.Scanner;

import com.college.exception.CityNotFoundException;
import com.college.exception.CollegeNotFoundException;
import com.college.model.College;
import com.college.service.CollegeServiceImplt;

public class CollegeMain {
	public static void main(String[] args) throws CollegeNotFoundException, CityNotFoundException {

		Scanner kb = new Scanner(System.in);
		CollegeServiceImplt c = new CollegeServiceImplt();
		College[] collegeDetails = null;
		int choice = 0;
		do {
			System.out.println(
					"enter choice \n Press 1 to get all the deatils " +
					"\n Press 2 to get the college of a city " + 
					"\n Press 3 to get the details the of college" + 
					" \n Press 0 to exit");
			choice = kb.nextInt();
			try {
				switch (choice) {

				case 1:

					collegeDetails = c.getAll();
					for (College coll : collegeDetails) {
						System.out.print(coll.getClgName() + "  ");
						System.out.print(coll.getCity() + "  ");
						System.out.print(coll.getSemester() + "  ");
						System.out.print(coll.getFees() + "  ");
						System.out.println();
						System.out.println("---------------------------------");

					}
					break;

				case 2:
					System.out.println("enter city name");
					String city = kb.next();

					collegeDetails = c.getByCity(city);
					for (College coll : collegeDetails) {
						if (coll != null) {
							System.out.print(coll.getClgName() + "  ");
							System.out.print(coll.getCity() + "  ");
							System.out.print(coll.getSemester() + "  ");
							System.out.print(coll.getFees() + "  ");
							System.out.println();
							System.out.println("---------------------------------");

						}

					}

					break;
				case 3:
					System.out.println("enter college name");
					String collegeName = kb.next();
					College college = c.getCollegeDetails(collegeName);
					System.out.print(college.getClgName() + "  ");
					System.out.print(college.getCity() + "  ");
					System.out.print(college.getSemester() + "  ");
					System.out.print(college.getFees() + "  ");
					System.out.println();
					System.out.println("---------------------------------");

					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("enter right choice");
					break;

				}
			}

			catch (CollegeNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (CityNotFoundException e) {
				System.out.println(e.getMessage());
			}

		} while (choice != 0);

	}

}
