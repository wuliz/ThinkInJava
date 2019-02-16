package com.wlz.java.chapterTen_innerClass;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private List<Event> eventlist = new ArrayList<Event>();

	public void addEvent(Event c) {
		eventlist.add(c);
	}

	public void run() {
		while (eventlist.size() > 0) {
			for (Event e : new ArrayList<Event>(eventlist)) {
				if (e.ready()) {
					System.out.print(e);
					e.action();
					eventlist.remove(e);
				}
			}
		}
	}

}
