package domain.model.common;

public abstract class AbstractIdentity<TIdentity>
        extends ValueObject
        implements IRepresentIdentity<TIdentity> {

    private TIdentity id;

    protected AbstractIdentity(TIdentity id){
        this.id = id;
    }

    protected AbstractIdentity(AbstractIdentity<TIdentity> id){
        this.id = id.getId();
    }

    public TIdentity getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [id= " + this.id + "]";
    }

    @Override
    public boolean equals(Object anObject) {
        boolean equalObjects = false;
        if (anObject != null && this.getClass() == anObject.getClass()) {
            AbstractIdentity typedObject = (AbstractIdentity) anObject;
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