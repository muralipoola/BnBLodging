package domain.model.common;

public class Guest extends Entity<GuestId> {

    String name;

    public Guest(GuestId id) {
        super(id);
    }

    public void registerName(String name){
    }
}
