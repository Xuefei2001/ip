package duke.list;

public class Deadline extends Task{
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        setBy(by);
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getBy() {
        return by;
    }

    @Override
    public String toString() {
        return ("[D]" + super.toString() + " (by: " + by + ")");
    }
}
