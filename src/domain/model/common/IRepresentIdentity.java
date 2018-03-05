package domain.model.common;

public interface IRepresentIdentity<TIdentity> {
    TIdentity getId();
    boolean equals(Object anObject);
}
