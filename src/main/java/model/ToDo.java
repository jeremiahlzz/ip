package model;

/**
 * The {@code ToDo} class represents "To Do" tasks.
 * 
 * <p> This is an immutable class.
 * 
 * <p> Contains:
 * <ul>
 * <li>a {@code String} name.</li>
 * <li>a {@code boolean} done state.</li>
 * </ul>
 */
public class ToDo implements Task {
    private final String name;
    private final boolean done;

    /**
     * Contructor to create a new {@code ToDo} object, with {@code done} set to {@code false} by default.
     * 
     * @param name Name of the "To Do" task.
     */
    ToDo(String name) {
        this.name = name;
        done = false;
    }

    private ToDo(String name, boolean done) {
        this.name = name;
        this.done = done;
    }

    /**
     * {@inheritDoc}
     * 
     * @return {@code ToDo} object with {@code done} set as {@code true}.
     */
    public ToDo mark() {
        return new ToDo(name, true);
    }

    /**
     * {@inheritDoc}
     * 
     * @return {@code ToDo} object with {@code done} set as {@code false}.
     */
    public ToDo unmark() {
        return new ToDo(name, false);
    }

    public boolean nameContains(String s) {
        return name.contains(s);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        String d = this.done ? "X" : " ";
        return String.format("[T][%s] %s", d, name);
    }
}
