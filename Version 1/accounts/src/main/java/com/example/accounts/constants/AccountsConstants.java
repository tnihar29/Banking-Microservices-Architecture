package com.example.accounts.constants;

public final class AccountsConstants {

    private AccountsConstants() {
        // restrict instantiation
    }
    public static final String  MOBILE_NUMBER_REGEX = "^$|[0-9]{10}";
    public static final String  INVALID_MOBILE_NUMBER = "Mobile number must be 10 digits";
    public static final String  SAVINGS = "Savings";
    public static final String  ADDRESS = "123 Main Street, New York";
    public static final String  STATUS_201 = "201";
    public static final String  MESSAGE_201 = "Account created successfully";
    public static final String  STATUS_200 = "200";
    public static final String  MESSAGE_200 = "Request processed successfully";
    public static final String  STATUS_417 = "417";
    public static final String  MESSAGE_417_UPDATE= "Update operation failed. Please try again or contact Dev team";
    public static final String  MESSAGE_417_DELETE= "Delete operation failed. Please try again or contact Dev team";
    // public static final String  STATUS_500 = "500";
    // public static final String  MESSAGE_500 = "An error occurred. Please try again or contact Dev team";

}
