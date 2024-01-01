//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        problem_solutions code = new problem_solutions();

        code.sumOfArrayElements();

        code.largestElementOfTheArray();

        code.checkEvenOrOdd();

        code.reverseTheElementsOfArray();

        code.factorialCalculation();

        code.palindromeCheck();

        code.primeNumberCheck();

        code.fibonacciSeries();

        System.out.println(code.linearSearch(7));
        System.out.println();
        System.out.println(code.linearSearch(13));
        System.out.println();

        code.binarySearch();

        System.out.println(code.duplicateElements());
        System.out.println();

        code.countVowelsAndConsonants();

        code.multiplicationTable();

        int[][] matrix = code.matrixAddition();
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        code.calculateAverage();

        code.leapYearCheck();

        code.patternPrinting();

        code.stringReversal();

        code.armstrongNumber();

        code.findMinimumAndMaximum();

        code.calculateSimpleInterest();

        code.temperaturesConversion();

        code.checkInputType();

        code.secondLargestNumberOfArray();

        code.sumOfAllNumbersInString();
    }
    /*
1. Sum of Array Elements: Write a program to find the sum of all elements in an array.

Largest Element in Array: Find and print the largest element in an array.

Even or Odd Numbers: Check if a given number is even or odd using if-else. (also count in an array)

Reverse an Array: Reverse the elements of an array.

Factorial Calculation: Write a program to calculate the factorial of a given number.*** + recursive solution.

6. Palindrome Check: Check if a given string is a palindrome. (use char string)

Prime Number Check: Determine whether a given number is prime.

Fibonacci Series: Generate and print the first N elements of the Fibonacci series.** + recursive solution.

Linear Search: Implement a linear search algorithm to find an element in an array. (true or false return type)

Binary Search: Implement binary search for a sorted array.

11. Duplicate Elements: Find and print duplicate elements in an array. (true or false return type)

Count Vowels and Consonants: Count the number of vowels and consonants in a given string. (a, e, i, o, u)

Multiplication Table: Print the multiplication table for a given number. (2 x 1 = 1, 2 x 2 = 4)

Matrix Addition: Add two matrices and print the result. 5x5 5x5 (return 2d array)

Calculate Average: Calculate the average of elements in an array.

16. Leap Year Check: Determine whether a given year is a leap year.

Pattern Printing: Print a pattern (e.g., a pyramid) using loops. (google patterns of loop)

String Reversal: Reverse a given string without using built-in functions. apple, elppa

Armstrong Number: Check if a number is an Armstrong number.

Find Minimum and Maximum: Write a program to find the minimum and maximum values in an array.

21. Calculate the simple interest for given principal, rate of interest, and time.
Write a program to convert temperatures from Celsius to Fahrenheit and vice versa.
Write a program that checks whether the input character is an uppercase letter, lowercase letter, a digit, or a special 24. character.
Write a program to find the second largest number in a given array.
Given a string containing both letters and numbers, find the sum of all the numbers in the string.
     */
}