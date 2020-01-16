package version1.weather;

import java.util.Observer;

public interface Sujet {
	
	public void registerObserver(Observateur o);
	public void removeObserver(Observateur o);
	public void notifyObservers();
}
