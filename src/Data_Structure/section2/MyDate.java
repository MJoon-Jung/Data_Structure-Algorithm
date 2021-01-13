package Data_Structure.section2;

public class MyDate {
	int year;
	int month;
	int day;
	
	MyDate(int y,int m, int d){
		year = y;
		month = m;
		day = d;
	}
	public int compareTo(MyDate other) {
		if(year < other.year || year == other.year && month < other.month 
				|| year == other.year && month == other.month && day < other.day)
			return -1;
		else if(year > other.year || year == other.year && month > other.month 
				|| year == other.year && month == other.month && day > other.day)
			return 1;
		else 
			return 0;
	}
	public String toString() {
		return year+"/"+month+"/"+day;
	}
}
