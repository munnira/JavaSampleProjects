package com.munni.arraylistExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class VisitedPlaces {

	String placeName;
	String state;
	String country;

	public VisitedPlaces(String vname, String vstate, String vcountry) {
		this.placeName = vname;
		this.state = vstate;
		this.country = vcountry;
	}

	@Override
	public String toString() {
		return String.format("{name=%s,state=%s,country=%s}", placeName, state,
				country);

	}

}

class NameComparator implements Comparator<VisitedPlaces> {

	@Override
	public int compare(VisitedPlaces name1, VisitedPlaces name2) {
		return (name1.placeName).compareTo(name2.placeName);
	}

}

class StateComparator implements Comparator<VisitedPlaces> {

	@Override
	public int compare(VisitedPlaces name1, VisitedPlaces name2) {
		return (name1.state).compareTo(name2.state);
	}

}

// in the above two comparators there is just a change in attribute , so is it
// necessary to write two comparators for this -- we can parameterize second attribute --see in class()

public class ListSortingUsingComparator {

	public static void main(String[] args) {
		List<VisitedPlaces> places = Arrays.asList(new VisitedPlaces(
				"Bay beach", "CA", "USA"), new VisitedPlaces("Aquarium", "OA",
				"Qatar"), new VisitedPlaces("Riyad", "Mecca", "Saudi"),
				new VisitedPlaces("Agra", "Delhi", "India"));

		// sort with two parameter
		Collections.sort(places, new StateComparator());
		for (VisitedPlaces place : places)
			System.out.println(place.toString());

	}

}
