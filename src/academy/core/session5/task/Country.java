package academy.core.session5.task;

import java.util.Arrays;
import java.util.Comparator;

public class Country {
	private String name;
	
	public Country(String name) {
		this.name = name;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Country> NameComparator = new Comparator<Country>() {

        @Override
        public int compare(Country c1, Country c2) {
            return c1.getName().compareTo(c2.getName());
        }
    };
    
    @Override
    public String toString() {
    	return "name= " + this.name;
    }

    public static void main(String... args) {
    	Country[] countries = new Country[4];
    	countries[0] = new Country("Germany");
    	countries[1] = new Country("USA");
    	countries[2] = new Country("France");
    	countries[3] = new Country("Japan");

    	Arrays.sort(countries, Country.NameComparator);
    	System.out.println("Countries list sorted by Name:\n"+Arrays.toString(countries));
    }
}
