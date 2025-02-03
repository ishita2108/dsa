package dsa;

import java.util.Arrays;
import java.util.Comparator;

class Activity {

	int start;
	int finish;

	Activity(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}
}

public class ActivitySelection {

	private static void selectActivities(Activity[] activities) {
		// TODO Auto-generated method stub
		Arrays.sort(activities, Comparator.comparing(a -> a.finish));

        System.out.println("Selected activities are:");
        // The first activity is always selected
        Activity previous = activities[0];
        System.out.println("Activity: (Start: " + previous.start + ", Finish: " + previous.finish + ")");

        
        for(int i =1; i<activities.length; i++) {
        	if(activities[i].start >= previous.finish) {
        		 System.out.println("Activity: (Start: " + activities[i].start + ", Finish: " + activities[i].finish + ")");
        		 previous = activities[i];
        		 
        	}
        	
        }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity[] activities = { new Activity(1, 3), new Activity(2, 4), new Activity(0, 6), new Activity(5, 7),
				new Activity(8, 9), new Activity(5, 9) };

		// Call the activity selection function
		selectActivities(activities);

	}

}
