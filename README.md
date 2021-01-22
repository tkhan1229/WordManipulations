# Word Manipulations
A coding exercise for Maersk which looks at incorporating four programs:

###### 1. String Anagram
A program to check if two given strings are anagrams of each other. Returning true if two strings are anagram, false otherwise. 
> A string is said to be an anagram if it contains the same characters and same length, but in a different order, e.g. army and Mary are anagrams.

###### 2. Integer Palindrome
A program to check if given integer is a palindrome or not. Returning true, false otherwise. 
> An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234.

###### 3. String Permutations
A program to print all permutations of a given string. 
> For example, if given string is *"GOD"* then your program should print all 6 permutations of this string, e.g. *"GOD," "OGD," "DOG," "GDO," "ODG," and "DGO."*

###### 4. Armstrong Number
A program to check if a number is called an Armstrong number. This is if it is equal to the cube of its every digit. Returning true, false otherwise. 
> For example, 153 is an Armstrong number because of 153 = 1+125+27, which is equal to 1^3+5^3+3^3.

## Installation

Clone the repository and open the program folder using a Java IDE such as IntelliJ to compile the classes.

## How It Works
1. Compile and run project.
2. Open the console and select program option from the menu.

## Usage

```java
Statement addStatement = connection.createStatement();
        for (Employee employee: list) {
            addStatement.executeUpdate("INSERT INTO employeesDB.employees" + " VALUES(" + employee.getEmployeeID() + ",'" + employee.getPrefix() + "','" + employee.getFirstName() + "','" + employee.getInitial() + "','" + employee.getLastName() + "','" + employee.getGender() + "','" + employee.getEmail() + "','" + employee.getDob() + "','" + employee.getJoinDate() + "'," + employee.getSalary() + ")");
        } // running query to populate the database with employees data from the CSV file
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

