# ExsandOhs
This is the Final Project for Adam Abbas and Inbar Pe'er, Period 10. Our goal was to create a platform where a user can play both the original, and several different variations on the popular game Tic Tac Toe! Here's what we've done:


<h2> Features! </h2>
<ul>

<li><h3> Our Main GUI </h3></li>
<p style="color:blue;"> Our GUI is built on a 2x4 Grid Layout. The first row containes buttons that open the 4 different TicTacToe games. The second row is comprised of JLabels, which display the score (X vs O). Keep in mind that this is a two player game(we’re trying to encourage new friendships here so find a buddy)! </p>

<li><h3> Classic Tic Tac Toe </h3></li>
<p style="color:red;"> The og TicTacToe, our bread and butter and the first thing we coded. The way this (and pretty much all our Tic Tac Toes) work is by arranging a GridLayout of buttons. When a button is pressed, its lettering changes, as well as a value in an array called valUs is changed. Our program checks to see if it was a winning move until it finds one, in which case it ends the game by communicating with the XsNOs(GUI) file. If you run this file not through the Main GUI(through the terminal) you can change the images used for the Xs and Os. All you have to do is add the two files that you want into the directory and then type the names of the files as parameters when running Classic Tic Tac Toe. (We know our faces are beautiful but we figured if you got sick of them, it would be nice to be able to change the images!) </p>

<li><h3> Misere Tic Tac Toe </h3> </li>
<p style = "color:blue;"> A slightly different take on the classic. When a letter gets 3 in a row, the OTHER person gets a win! It's a simple difference, but adds a completely different strategy to the game.  </p>

<li><h3> Ultimate Tic Tac Toe </h3> </li>
<p> Also known as TicTacToeception. This game is not for Tic Tac Toe beginners so proceed with caution… Ultimate Tic Tac Toe involves us making a TicTacToe class (3x3 GridLayout) and then adding that to a bigger class (also a 3x3 GridLayout). The classes share the XorO variable, which determines whether the next click is an X or an O. Once a victory is had on an individual board, the pane is modified to change from a TicTacToe() to an icon of the winning letter, where is then evaluated as a regular TicTacToe game. NOTE: This code uses threads, to infinitely run a loop to check all of the TicTacToes. Stopping a thread is considered dangerous/outdated so when our code is compiled something that looks like an error message appears. It should be ignored! </p>

<li><h3> MNK Tic Tac Toe </h3></li>
<p> The craziest Tic Tac Toe we have! MNK Tic Tac Toe involves a pregame window, where the user selects m and n, the dimensions of the board and k -- the amount they need to get in a row. A game is then generated with the correct dimensions and played like a super large (or super small if you’re into that!) Tic Tac Toe game! Definitely not for beginners either, this game will test your Tic Tac Toe skills to the limit. </p>

</ul>
<h2> Unresolved Bugs (ew)</h2>
<p>We did a lot of debugging the day the project was due and now we don’t feel as though there are glaring bugs. If there are bugs (lets face it most code does!) then we are not aware of them unfortunately. I guess the biggest unresolved aspect of the project is the changing of the images doesn’t work through the GUI, only through the terminal. </p>

<h2> Compilation Directions </h2>
<p>
You will need to compile a the following files:</p>
<ul>
<li>XsNOs.java</li>
<li>MisereTicTacToe.java</li>
<li>ClassicTicTacToe.java</li>
<li>MNK.java</li>
<li>MNKGUI.java</li>
<li>TicTacToe.java</li>
<li>UltimateTicTacToe.java</li>
*When you compile UltimateTicTacToe it will give you an error because we used some “dangerous” code, please ignore it! It runs fine!*
</ul>

<h2> Playing the Game </h2>
<p>Run XsNOs!
Select your choice of the different TicTacToe games by pressing on the buttons.<br>
If you are playing MNK then enter in your M N and K values in the window that pops up! (Make sure your K value is less than your M and N values otherwise an error message will pop up and you will not be able to proceed)<br>
Keep playing and watch the score change as you win(or lose) the different tic tac toe games!<br>
If you want to spice things up you can run ClassicTicTacToe independently in the terminal with two parameters. These two parameters should be the names of images that you have put in the same ExsandOhs directory. (Not sure why you would do this though, our faces our beautiful)<p>




