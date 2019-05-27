package com.appdeveloperws.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UpdateUserDetails {
    @NotNull(message = "FirstName cannot be null")
    @Size(min = 2, message = "First Name must be less than 2 char")
    private String firstName;

    @NotNull(message = "LastName cannot be null")
    @Size(min = 2, message = "Last name must be less than 2 char")
    private String lastName;

    public UpdateUserDetails() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
