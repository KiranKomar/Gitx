package SimplePracticeAlreadyDidOne;

import java.util.Objects;

public class Person {
@Override
	public int hashCode() {
		return Objects.hash(k);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return k == other.k;
	}

int k;

public Person(int h) {
	this.k=h;
}
}
