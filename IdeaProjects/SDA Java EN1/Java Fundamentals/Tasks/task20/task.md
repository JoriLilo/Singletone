Write a method that takes 2 dates as String parameters in the formats `yyyy::MM::dd` and `MM-yyyy-dd`.

The method then calculates the difference between the first and second dates.

The method returns an array of numbers (int), where the index of years is below the index of 0, the difference of months is below the index of 1, and the difference of days is below the index of 2.

For example, for the dates `"2014::01::23"` and `"03-2020-30"` returns the array `[6, 2, 7]`.