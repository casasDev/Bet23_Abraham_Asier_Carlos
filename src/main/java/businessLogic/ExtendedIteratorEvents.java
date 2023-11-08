package businessLogic;

import java.util.List;

import domain.Event;

public class ExtendedIteratorEvents implements
ExtendedIterator<Event> {

	List<Event> l;
	int posList = 0;
	
	public ExtendedIteratorEvents(List<Event> pList) {
		
		this.l = pList;
		
	}
	
	public boolean hasNext() {

		return posList<l.size();
	}

	public Event next() {

		Event event = l.get(posList);
		posList++;
		return event;
	}

	public Event previous() {

		posList--;
		Event event = l.get(posList);
		return event;
	}

	public boolean hasPrevious() {
		
		if(posList!=0) return true;
		else return false;
	}

	public void goFirst() {

		posList=0;
		
		
	}

	public void goLast() {

<<<<<<< HEAD
		posList=l.size();
=======
		posList=l.size()-1;
>>>>>>> branch 'master' of https://github.com/casasDev/Bet23_Abraham_Asier_Carlos.git
		
	}

}
