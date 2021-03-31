package ds.comparator;

import java.util.Comparator;

public class ByName implements Comparator<Student> {

	public int compare(Student v, Student w) {
		return v.fullName.compareTo(w.fullName);
	}

}


