# ExsandOhs
This is the Final Project for Adam Abbas and Inbar Pe'er, Period 10. Our goal was to create a platform where a user can play both the original, and several different variations on the popular game Tic Tac Toe! Here's what we've done:


<h2> Features! </h2>
<ul>

<li><h3> Our Main GUI </h3></li>
<p style="color:blue;"> Our GUI is built on a 2x4 Grid Layout. The first row containes buttons that open the 4 different TicTacToe games. The second row is comprised of JLabels, which display the score (X vs O). Keep in mind that this is a two player game! </p>

<li><h3> Classic Tic Tac Toe </h3></li>
<p style="color:red;"> The og TicTacToe, our bread and butter and the first thing we coded. The way this (and pretty much all our Tic Tac Toes) work is by arranging a GridLayout of buttons. When a button is pressed, its lettering changes, as well as a value in an array called valUs is changed. Our program checks to see if it was a winning move until it finds one, in which case it ends the game by communicating with the XsNOs(GUI) file. </p>

<li><h3> Misere Tic Tac Toe </h3> </li>
<p style = "color:blue;"> A slightly different take on the classic. When a letter gets 3 in a row, the OTHER person gets a win! It's a simple difference, but adds a completely different strategy to the game. </p>

<li><h3> Ultimate Tic Tac Toe </h3> </li>
<p> Also known as TicTacToeception. Ultimate Tic Tac Toe involves us making a TicTacToe class (3x3 GridLayout) and then adding that to a bigger class (also a 3x3 GridLayout). The classes share the XorO variable, which determines whether the next click is an X or an O. Once a victory is had on an individual board, the pane is modified to change from a TicTacToe() to an icon of the winning letter, where is then evaluated as a regular TicTacToe game. NOTE: This code uses threads, to infinitely run a loop to check all of the TicTacToes. Stopping a thread is considered dangerous/outdated so when our code is compiled something that looks like an error message appears. It should be ignored!</p>

<li><h3> MNK Tic Tac Toe </h3></li>
<p> The craziest Tic Tac Toe we have! MNK Tic Tac Toe involves a pregame window, where the user selects m and n, the dimensions of the board and k -- the amount they need to get in a row.
