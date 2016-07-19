package com.raghav.corejava.java_util.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		Country indiaCountry = new Country(1, "India","Delhi");
		Country chinaCountry = new Country(4, "China"," String countryCaptial");
		Country nepalCountry = new Country(3, "Nepal","Kathmandu");
		Country bhutanCountry = new Country(2, "Bhutan","Thimphu");

		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);

		System.out.println("Before Sort by id : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country = (Country) listOfCountries.get(i);
			System.out.println("Country Id: " + country.getCountryId() + "||"
					+ "Country name: " + country.getCountryName()+ "||"
							+ "Country CapitalName: " + country.getCountryCaptial());
		}
		Collections.sort(listOfCountries, new CountrySortByIdComparator());

		System.out.println("After Sort by id: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country = (Country) listOfCountries.get(i);
			System.out.println("Country Id: " + country.getCountryId() + "|| "
					+ "Country name: " + country.getCountryName()+ "||"
							+ "Country CapitalName: " + country.getCountryCaptial());
		}

		//Sort by countryName using anonymous inner class
		Collections.sort(listOfCountries, new Comparator<Country>() {

			//@Override
			public int compare(Country o1, Country o2) {
				return o1.getCountryName().compareTo(o2.getCountryName());
			}
		});

		System.out.println("After Sort by name: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country = (Country) listOfCountries.get(i);
			System.out.println("Country Id: " + country.getCountryId() + "|| "
					+ "Country name: " + country.getCountryName()+ "||"
							+ "Country CapitalName: " + country.getCountryCaptial());
		}
	}

}