### Section 1: Game.java
Let’s change the pipes so they’re farther apart or closer together horizontally.

Line 10: Change the Pipe delay. 

    The default is 100. 

    Touching is 20.
    
    Too far apart starts at 150.


Let’s change the pipes so they’re farther apart or closer together vertically.

Line 149: Change the vertical height.

    The default is 175.
    
    No gap is when this is set to 0.
    
    Pipes almost all the way off the edges is set to 300.


### Section 2: Bird.java

So, that’s not enough, let’s change the bird some.

Line 31: Change the gravity.

    The default is 0.5
    
    Set to 0.1 (Launches bird off the top of the screen)
    
    Set to 0.8 (Makes the bird more controllable)


Easier to play with space bar instead of up arrow

Line 46: Change to allow the space bar as jump

    Between the two )) add the following
    
    “ || keyboard.isDown(KeyEvent.VK_SPACE)”


### Section 3: Game.java

I’m still terrible, let’s just downright cheat

Line 113: Increase the score every time the pipes move

    Add “score++” or “score = score + 1”

    For real fun, do “score = score + 1 + score”


### Section 4: Game.java

Now that it’s easy to have a high score, let’s change the look of the game.

Line 72: Change the background: lib/background.png, mountain-background.png, tress-background.png

Line 78: Change the foreground: lib/foreground.png, lib/lava-foreground.png


### Section 5: Bird.java

Let’s change the bird out for something else.

Line 64: Change the bird: lib/bird.png, lib/brown-bird.png, lib/dragon.png


### Line 6: Pipe.java

Last, let’s change the pipes

Line 60: Change the pipe: lib/pipe-“…, lib/red-pipe-“…, lib/lava-pipe-“…
