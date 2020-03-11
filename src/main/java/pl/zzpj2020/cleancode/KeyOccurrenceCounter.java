package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyOccurrenceCounter {

	Map<Integer, Integer> records = new HashMap<>();
	private int minValueKey = Integer.MIN_VALUE;
	private int maxValueKey = Integer.MAX_VALUE;


	public void countKeyOccurrence(List<Integer> keys) {
		for (Integer key : keys) {
			int value = getValueForSpecificKey(key);
			records.put(key, value + 1);
			if (key > minValueKey) {
				minValueKey = key;
			}

			if (key < maxValueKey) {
				maxValueKey = key;
			}
		}
	}

	public int getValueForSpecificKey(int key) {
		return records.getOrDefault(key, 0);
	}

	public int getMinValue() {
		return minValueKey;
	}

	public int getMaxValue() {
		return maxValueKey;
	}

}