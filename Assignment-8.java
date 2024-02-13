public abstract class Item {
    private String id;
    private String title;
    private String subject;

    public Item(String id, String title, String subject) {
        this.id = id;
        this.title = title;
        this.subject = subject;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getSubject() { return subject; }

    public void setId(String id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setSubject(String subject) { this.subject = subject; }
}

public interface Borrowable {
    void borrowItem();
    void returnItem();
}


public class Book extends Item implements Borrowable {
    public Book(String id, String title, String subject) {
        super(id, title, subject);
    }

    @Override
    public void borrowItem() { /* implementation */ }

    @Override
    public void returnItem() { /* implementation */ }
}


public class DVD extends Item implements Borrowable {
    public DVD(String id, String title, String subject) {
        super(id, title, subject);
    }

    @Override
    public void borrowItem() { /* implementation */ }

    @Override
    public void returnItem() { /* implementation */ }
}


public abstract class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}


public class Librarian extends User {
    public Librarian(String id, String name) {
        super(id, name);
    }
}


public class Member extends User {
    public Member(String id, String name) {
        super(id, name);
    }
}


public class LibraryUtils {
    public static void doSomething() { /* implementation */ }
}


public class Main {
    public static void main(String[] args) {
    }
}