package edu.neu.cs4500.cs4500sp19s3kakadeo.models;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    // constructor
    public User(){ }

    public User(Integer id, String username, String password, String firstName, String lastName) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // provide a public set and get method for each of the class variables above
    // make sure to use proper naming conventions for Java methods, e.g.,
    // methods should be camelcase. Here's an example using the firstName variable:
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

