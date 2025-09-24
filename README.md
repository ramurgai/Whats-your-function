Why doesn't the integer change after the method call?
The integer does not change after the method call because when you reference the number in the function you essentially get a copy of that value to work with in the function. So when you reference it outside of the function it goes to the original value and not the copy you have in the function.

Why does the array change after the method call?
When you define an array you give it a location in memory. When you reference it and change the values you change the values in the memory location. When you reference the array elsewhere it pulls from that memory location and so it stays the same outside of the function.

What happens when you try to access y outside the loop?
When you try to access y outside of the loop you get an error because you defined it inside the for loop. Because you defined it inside the for loop it technically doesn't exist outside of the loop and so you get an error.
