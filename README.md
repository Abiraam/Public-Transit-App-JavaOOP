# Public-Transit-App-JavaOOP

#### Objective: Develop a Public Transit Application based on the given scenario

##### Scenario: You are an IT Support Administrator Specialist and are charged with the task of creating accounts for new customers. "newCustomers.txt" contains the information on each line needed for each new customer. The total number of customers is the first line in the file and can be presumed as correctly formatted and has the stated number of customers. 

##### Once the accounts have been created, then a second file of orders, "orders.txt", is processed. This file contains the following information and may have incorrect last names or mobile phone numbers. In addition, not all of the customers may be included. It can be presumed that it contains the stated number of orders and that the order information is fine. 

##### From the customer's order, the most economical fare can be calculated and the PAYG card is pay as you go and would need to be periodically reloaded with money. In addition, the PAYG card would not charge a traveler more than $10 per day. 

##### Finally, the "customersorder.txt" file should be output and list of all customers in alphabetical order by last name with their order recommendations. Any errors in the order file is listed at the end. 

#### Constraints & Classes: 

###### All classes are expected to have default, n-argument, and copy-constructors along with accessors and mutators for instance variables. 
###### All classes should have toString and equals methos as appropriate.
###### Exception and privacy leak handling is included.

#### Classes: 

###### -> Customer abstract class with first name, last name, customer type, email address, discount, and mobile phone number instance variables. 
###### -> Classes extending the Customer abstract class: 
      - Regular customer concrete class with reward number instance variable
      - Student customer concrete class with school name instance variable
      - Military customer concrete class with military branch instance variable
      - Elderly customer concrete class with birth year instance variable
###### -> Customer File class with a Customer array instance variable to hold the customers input from the "newcustomers.txt" file and to process the "orders.txt" file.

###### -> Main class with main method to instantiate the Customer File class and call a method in the Customer File Class to output all customers with their order recommendations (if they have one) to a file "customerorders.txt"
