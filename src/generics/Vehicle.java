package generics;

public class Vehicle {
    int id;

    public Vehicle() {
        this.id = 2;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj instanceof Vehicle)
            return this.id == ((Vehicle) obj).id;
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + this.id;

        return result;
    }
}
