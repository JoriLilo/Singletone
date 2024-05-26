Write a program that checks if the brackets are correctly matched in the user-specified arithmetic expression. The expression is given as a single string.

If the brackets are correctly paired, the program should write to the console the message: `"OK"`. Otherwise, the program should write to the console the message: `"Incorrect pairing of brackets"`.

* Example a: `"2 * (3.4 - (-7) / 2) * (a-2) / (b-1)))"`, result: `"Incorrect pairing of brackets"`
        
* Example b: `"(2 * (3.4 - (-7) / 2) * (a-2) / (b-1))"` result: `"OK"`

* Example c: `") 2 * 4 ("` result: `"Incorrect pairing of brackets"`

Get the data from the user in the console using the `Scanner` class.