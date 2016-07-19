package com.raghav.corejava.java_util.comparatorInterface;

public class Country{
    int countryId;
    String countryName;
    String countryCaptial;

    public Country(int countryId, String countryName, String countryCaptial) {
        super();
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryCaptial=countryCaptial;
    }

    public int getCountryId() {
        return countryId;
    }


    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    public String getCountryName() {
        return countryName;
    }


    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

	public String getCountryCaptial() {
		return countryCaptial;
	}

	public void setCountryCaptial(String countryCaptial) {
		this.countryCaptial = countryCaptial;
	}

}