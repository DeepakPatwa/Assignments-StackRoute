# Assignments-StackRoute

Practice Assignment 3(PE3) :===============================================================================================

Inheritance and useful Java Classes : Practice Exercise 3
1.     Create a class called StudentMarks, which prompts user for the number of students, reads it from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the grades of each of the students and saves them in an int array called stuGrades. Your program shall check that the grade is between 0 and 100 else has to trow an error message.
2.     Write a program to compute the addition of two matrix, Read the number of rows and columns as input, also the values of each matrix
  Output:
  Input number of rows of matrix: 3
  Input number of columns of matrix: 2
  Input elements of first matrix: 1 2 3 4 5 6
  Input the elements of second matrix: 9 8 7 6 5 4
  Sum of the matrices:-
                     10        10      
                     10        10      
                     10        10

3. Write a java program to calculate first and last date of a week.
  Output:
  First Date of Week:             Mon 24/07/2017
  Last date of the week:          Sun 30/07/2017

4. Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console
 Input:
    India
    United States
    Germany
     Egypt
     czechoslovakia

Output:
    Place Name without Vowels:0 Ind
    Place Name without Vowels:1 Untd Stts
    Place Name without Vowels:2 Grmny
    Place Name without Vowels:3 Egypt
    Place Name without Vowels:4 czchslvk

5. Write a program to create a ChessBoard pattern with the help of multidimensional array, where WWrepresents white color and BB represents Black color.
 Output:
 My Chess Board
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|

6. Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier, assume the digits are a string and use split()
 Input: 98,96,95,94,93
 Output: 98,96,95,94,93 non consecutive numbers
  
 Input: 54,53,52,51,50,49,48
 Output : 54,53,52,51,50,49,48 are consecutive numbers
  
 Input: 1,2,3,4,5,6,6
 Output: 1,2,3,4,5,6,6 non consecutive numbers

7. Create a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.

8. Write a program that will generate exceptions of type NegativeArraySizeException, IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by displaying the message stored in the exception object.








<<=============================Working with Strings : Practice Exercise 4=========================================================================>

1.     Write a java program to count the total number of occurrences of a given character in a string without using any loop?
	For Example- Java is java again java again count number of occurrence of a in the given string

2.     Write a program to replace all d with f and all l with t in the given String
	Input: daily dry
	Output: faity fry
	Original string: daily dry
	New String: faity fry

3.     Write a program that sets up a String variable containing a paragraph of text of your choice.
	a. Extract the words from the text and sort them into alphabetical order.   
	b. Display the sorted list of words.

4.     Write a program to transpose the given string.
	 Input String : a quick brown fox jumps over the lazy dog
	 Output String: a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god

5. Write a program with the implementation of Regular Expression to find the presence of the name Harry in a string.
	 Input: This is Harry.
	 Output: Is Harry here ? true
	 Input : This is Henry.
	 Output: Is Harry here ? false

6. Write a program to find out the multiple occurrences of the given word in a string using Matcher methods.
	 Input : She sells seashells by the seashore   
	 Given word: se
	 Output : 
        Found at: 4 - 6         
        Found at: 10 - 12         
        Found at: 27 - 29



<==================================================# PE5 #==========================================================>

	Collections : Practice Exercise

1. Write a Java program to update specific array element by given element and empty the array list .
	Input: [Apple, Grape, Melon, Berry]
	Output: [Kiwi, Grape, Mango, Berry]
	Array list after removing all elements []

2. Write a program to find the number of counts in the following String . Store the output in
	Map< String ,Integer> as key value pair.
	Input : String str = “one one -one___two,,three,one @three*one?two”;
	Output : {"one":5 , "two":2, "three" :2}

3. Write a program where an array of strings is input and output is a Map< String ,boolean> where
	each different string is a key and its value is true if that string appears 2 or more times in the array
	Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
	Output - {“a” : true,”b” :false ,”c” :true,”d” : false}

4. Create a Student class that represents the following information of a student: id, name, and age all
	the member variables should be private .
	a. Implement `getter and setter` .
	b. Create a `StudentSorter` class that implements `Comparator interface` .
	c. Write a class `Maintest` create Student class object(minimum 5)
	d. Add these student object into a List of type Student .
	e. Sort the list based on their age in decreasing order, for student having same
	age, sort based on their name.
	f. For students having same name and age, sort them according to their ID.

5. Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
	Modify and return the given map as follows:
		a. If the key `val1` has
		b. Set the key `val1` to
	Example 1:
		The map {"val1": "java",
		"java"}
	Example 2:
		The map {"val1": "mars",
		"mars"}
		a value, set the key `val2` to have that value, and
		have the value `" "` (empty string ).
		"val2": "c++"} should return {"val1": " ", "val2":
		"val2": "saturn"}
		should return {"val1": " ", "val2":

6. Write a program to implement set interface which sorts the given randomly ordered names in
	ascending order. Convert the sorted set in to an array list
	Input : Harry Olive Alice Bluto Eugene
	Output :
	Sorted Set : Alice Bluto Eugene Harry Olive
	Array list from Set : Alice Bluto Eugene Harry Olive
	
