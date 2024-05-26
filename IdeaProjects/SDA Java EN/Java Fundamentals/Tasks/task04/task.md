Write a program which, based on the variables: amount - `amount (double)` and number of installments - `numberOfInstallments (int)`, will calculate the monthly loan installment and write it to the console. The parameters have restrictions:
* the loan amount must be between 100.00 and 10,000.00,
* the number of installments must be between 6 and 48.

If the loan amount exceeds the acceptable range, the loan amount should be set at 5,000.00. If the number of installments exceeds the acceptable range, the number of installments should be set to 36.

The calculated monthly installment should also include interest. To simplify the calculations, assume that you add X percent to the loan amount depending on the number of installments:
* 6-12 installments - 2.5%,
* 13-24 installments - 5.0%,
* 25-48 installments - 10.0%,

and then calculate the installment amount based on the number of installments.

Get the data from the user in the console using the `Scanner` class.