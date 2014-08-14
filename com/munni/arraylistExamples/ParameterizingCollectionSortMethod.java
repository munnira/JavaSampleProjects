package com.munni.arraylistExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Measurement {
	int objspeed;
	String objName;
	String objLocation;

	public Measurement(int mobjspeed, String mobjName, String mobjLocation) {
		this.objspeed = mobjspeed;
		this.objName = mobjName;
		this.objLocation = mobjLocation;

	}

	@Override
	public String toString() {
		return String.format("{%d,%s,%s}", objspeed, objName, objLocation);
	}

	public static Comparator<Measurement> getComparator(EnumSortParam... sortParams){
	return new MeasurementComparator(sortParams);
}
}

class MeasurementComparator implements Comparator<Measurement> {
	private EnumSortParam[] parameter;

	public MeasurementComparator(EnumSortParam... parameter) {
		this.parameter = parameter;
	}

	@Override
	public int compare(Measurement m1, Measurement m2) {
		int comparison;
		for (EnumSortParam param : parameter)
			switch (param) {
			case SPEED:
				comparison = m1.objspeed - m2.objspeed;
				if (comparison != 0)
					return comparison;
				break;
			case NAME:
				return (m1.objName).compareTo(m2.objName);

			}

		return 0;

	}

}

public class ParameterizingCollectionSortMethod {
	public static void main(String[] s) {
		List<Measurement> places = Arrays.asList(new Measurement(40, "car",
				"USA"), new Measurement(60, "OA", "Qatar"), new Measurement(34,
				"Mecca", "Saudi"), new Measurement(32, "Delhi", "India"));
		
//		 new MeasurementComparator(EnumSortParam.SPEED)
		Collections
				.sort(places, Measurement.getComparator(EnumSortParam.NAME));
	}

}
