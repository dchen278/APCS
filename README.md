# APCS

## Markdown

**0.** The base is the number of digits that a counting system uses to represent numbers. Example: Binary uses 2 digits, 1 and 0; base 10 or decimal uses 10 digits, 0-9; and base 16 or hexadecimal uses 0-9 and A-F.

**1.** Binary is the base 2 counting system. We care because the system is simpler to work with and is less expensive than larger bases.

**2.** **Steps**
1. List powers of `2` for all the digits starting from the right.
2. Starting from the right, multiply the number by its respective power of `2`.
3. Find the sum of all the products.

Example: `100` to decimal

0 -> 0 * 2<sup>0</sup> = 0 \
0 -> 0 * 2<sup>1</sup> = 0 \
1 -> 1 * 2<sup>2</sup> = 4 \
        sum -> 4

**3.**
**Steps**
1. Divide number by `2`
2. Use integer quotient for next cycle
3. Use remainder for binary digit (right to left)
4. Repeat until quotient equals `0`


Example: `4` to binary

 n/2 | Quotient   | Remainder
-----|------------|-------------
4/2  |      2     |      0
2/2  |      1     |      0
1/2  |      0     |      1


4<sub>10</sub> = 100<sub>2</sub>
 
