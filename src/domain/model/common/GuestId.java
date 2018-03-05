package domain.model.common;

public class GuestId extends AbstractIdentity<String> {

    protected GuestId(String id) {
        super(id);
    }

    protected GuestId(AbstractIdentity<String> id) {
        super(id);
    }
}
