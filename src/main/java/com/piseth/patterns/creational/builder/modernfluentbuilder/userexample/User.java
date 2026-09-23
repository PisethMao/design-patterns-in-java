package com.piseth.patterns.creational.builder.modernfluentbuilder.userexample;

public class User {
    private final String username;
    private final String email;
    private final String phoneNumber;
    private final String address;
    private final Integer age;
    private final Boolean isAccountActive;

    public String getUsername() {
        return username;
    }

    public Boolean getAccountActive() {
        return isAccountActive;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", isAccountActive=" + isAccountActive +
                '}';
    }

    public static class Builder {
        private String username;
        private String email;
        private String phoneNumber;
        private String address;
        private Integer age;
        private Boolean isAccountActive;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder isAccountActive(Boolean isAccountActive) {
            this.isAccountActive = isAccountActive;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.age = builder.age;
        this.isAccountActive = builder.isAccountActive;
    }

    public static Builder builder() {
        return new Builder();
    }
}
