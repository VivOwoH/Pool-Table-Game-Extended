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
- Friction must be value between 0 - 1 (not inclusive). [Would recommend switching between 0.95, 0.9, 0.85 to see changes].
- Ball X and Y positions must be within the size of the table width and length, including the ball radius (10).
- Ball colours must be Paint string values as expected.

# Features implemented
- Pockets and More Coloured Balls
- Difficulty Level
- Time and Score 
- Undo and Cheat
- More realistic cue stick

# Key input
- Restart game when lost -> R
- Restore to a previous state -> on screen buttons (must save a state before being able to restore)
- Switch difficulty (can only switch to a level different than the current one)
    - E = Easy (default)
    - N = Normal
    - H = Hard
- Cheat: remove balls of the selected color (from dropdown menu) on screen -> C

# Note:
- You cannot save/restore if you are at winning/losing screen.
- Upon reset, you cannot restore to a previous state (e.g. when you switch difficulty).
- Cheat dropdown menu has all possible ball colors, even such colored balls are not on screen (subsequently, choosing such color to cheat has no effect)

# Design pattern
- State pattern: GameManager, Difficulty <- Easy, Hard, Normal
- Observer pattern: BallInPocketListener <- GameState, ResetListener <- GameManager,Ball
- Memento pattern: GameManager, GameState (includes BallState), StateTracker 