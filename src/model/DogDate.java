package model;

import java.util.Comparator;

public class DogDate  implements Comparator<Dog> {

	@Override
	public int compare(Dog dog1, Dog dog2) {

		return dog1.getDate().compareTo(dog2.getDate());
	}
	

}
