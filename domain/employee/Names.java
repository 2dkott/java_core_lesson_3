package domain.employee;

public class Names implements Comparable<Names>{
    final private String firstName;
    final private String lastName;

    public Names(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName(){
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString(){
        return getFullName();
    }

    @Override
    public int compareTo(Names o) {
        return getFullName().compareTo(o.getFullName());
    }
}
