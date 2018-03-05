package domain.model.common;

public abstract class Entity<TIdentity>
    implements IRepresentIdentity<TIdentity> {

    TIdentity id;

    public Entity(TIdentity id){
        this.id = id;
    }

    public TIdentity getId() {
        return id;
    }

    @Override
    public boolean equals(Object anObject) {
        boolean equalObjects = false;
        if (anObject != null && this.getClass() == anObject.getClass()) {
            IRepresentIdentity typedObject = (IRepresentIdentity) anObject;
            equalObjects = this.getId().equals(typedObject.getId());
        }

        return equalObjects;
    }

    @Override
    public int hashCode() {
        int hashCodeValue =
                + (57853 * 31)
                        + this.getId().hashCode();

        return hashCodeValue;
    }
}
