# CharacterMultiples
BRIEF DESCRIPTION
<br>This Java program accepts input for 2 parallel arrays: a string array and an int array. The string array contains strings of characters and symbols while the int array provides an integer that represents a multiple of the characters in the corresponding string. The output is an integer array that counts the number of unique characters of a string that are a multiple of the integer that was input.

PROBLEM
<br>Given a string of length L, and a number M, find the number of characters in the string array that appear a multiple of M times. The string may consist of mixed-case alphanumeric characters and symbols. Your code should treat different cases of the same letter as distinct characters.

CONSTRAINTS
<br>0 <= L <= 100,000
<br>1 <= M <= 100,000
<br>L[i] can be A through Z (mixed case), 0 through 9, or basically any symbol on your keyboard.

INPUT FORMAT
<br>You are given a function definition countCharacters that takes strings (as array of T strings) and multiples (an array of T integers) in which to implement your solution. Each index in the parallel arrays is a single test case. 

OUTPUT FORMAT
<br>Return an array characters of length T, where characters[i] is the number of characters (case sensitive) in strings[i] that appear a multiple of multiples[i] times.

EXAMPLE
<br>Strings: [‘aababcabcd’, ‘aababcabcd’]
<br>Multiples: [3, 2]
<br>Output: [1, 2]

EXPLANATION
<br>Output[0] is 1 because only one character (‘b’) appears in strings [0] a multiple of 3 (multiples[0]) times.
<br>Output[1] is 2 because two characters (‘a’ and ‘c’) appear in strings[1] a multiple of 2 (multiples[1]) times (4 and 2 times, respectively).
