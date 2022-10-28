# Pool Game Builder

To run the application, please use:

gradle run

To generate a javadoc, please use:

gradle javadoc

# Game Notes
- In order to hit the ball, click and hold onto the edge of the cue ball where you'd like to hit. 
- Then, drag your cursor away (in the angle you'd like to hit), and then release.
- The power of your hit will be based on the length of your drag (although ball velocity is capped). 

# Config Notes
When entering config details, please note the following restrictions:
- Friction must be value between 0 - 1 (not inclusive). [Would reccomend switching between 0.95, 0.9, 0.85 to see changes].
- Ball X and Y positions must be within the size of the table width and length, including the ball radius (10).
- Ball colours must be Paint string values as expected.


# Key input
- Restart game when lost -> R
- Undo/Redo -> on screen buttons
- Switch difficulty (can only switch to a level different than the current one)
    - E = Easy
    - N = Normal
    - H = Hard
- Cheat: remove all balls on screen -> C

# Note:
- You cannot save/restore if you are at winning/losing screen.
- Upon reset, you cannot restore to a previous state (e.g. when you switch difficulty).