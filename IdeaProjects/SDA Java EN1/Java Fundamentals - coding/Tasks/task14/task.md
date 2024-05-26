Write an application, that will read two positive integers and will write their **greatest common divisor** (GCD) using
Euclid's algorithm with modulo variation.
Greatest common divisor (GCD) or two numbers is the biggest natural number, that both numbers are divisible by.
 
 For example, **GCD of `6` and `16` equals `2`**, because it's the smallest number that both `6` is divisile by (giving
 result `3`) and `16` is divisible by (giving result `8`). 
 
 Euclid's algorithm for numbers `a` and `b`, using temporary variable `c`, goes as follows:
```
1. As long as b!=0 do steps 2..5; otherwise go to step 6.
2.      c = remainder after division a by b
3.      let 'a' equal 'b'
4.      let 'b' equal 'c'
5.      go to step 1.
6. The answer is number 'a'
```