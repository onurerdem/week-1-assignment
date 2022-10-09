# first-Assignment

## Ödev 1 
Kotlin Alıştırmaları

Code Username Validation 
Have the function Codeland Username Validation(str) take the str parameter being passed and determine if the string is a valid username according to the following rules: 
1. The username is between 4 and 25 characters.
 2. It must start with a letter. 
3. It can only contain letters, numbers, and the underscore character.
 4. It cannot end with an underscore character. If the username is valid then your program should return the string true, otherwise return the string false. 
Examples Input: "aa_"  Output: false
Input: "u__hello_world123"

## Ödev 2

In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large. 
Function Description 
Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
 aVeryBigSum has the following parameter(s): 
int ar[n]: an array of integers .
 Return 
long: the sum of all array elements
 Input Format 
The first line of the input consists of an integer . 
The next line contains  space-separated integers contained in the array. 
Output Format Return the integer sum of the elements in the array. 

## Ödev 4

First Factorial
 Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1 and 18 and the input will always be an integer. 

Examples 
Input: 4 Output: 24
Input: 8 Output: 40320

private fun first Factorial(num: Int): Int { }

## Ödev 5

Questions Marks Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers, letters, and question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10. If so, then your program should return the string true, otherwise it should return the string false. If there aren't any two numbers that add up to 10 in the string, then your program should return false as well. For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string. 
Examples: 
Input: "aa6?9" Output: false 
Input: "acc?7??sss?3rr1??????5" Output: true

private fun questionsMarks(str: String): String {}