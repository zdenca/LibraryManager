package cz.librarymanager.model;

/**
 * Created by Zdenca on 4/18/2016.
 */
public class Author {
    private Name name;

    public Author(Name name) {
        this.name = name;
    }


    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name=" + name +
                '}';
    }
}
