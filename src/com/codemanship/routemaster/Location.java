package com.codemanship.routemaster;
import java.util.List;

public interface Location {
	
	public Location findNearest(List<Location> destinations);

}
