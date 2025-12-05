# Alarm Clock

A simple Java-based alarm clock program that allows you to set a specific time (in 24-hour format) to trigger an alarm sound. The program plays a sound file when the alarm time is reached, and you can stop the alarm by pressing Enter.

## Features

- Set an alarm time using military (24-hour) format (HH:MM:SS)
- Plays an audio file when the alarm goes off
- Real-time display of current time
- User-friendly input and control

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- An audio file in WAV format placed in the project folder

## How to Use

1. Clone the repository or download the source code.
2. Place your preferred WAV audio file in the project folder. Rename it to:
   ```
   Pokémon Emerald - Deoxys Battle Theme (Remix).wav
   ```
   or update the `filePath` variable in `Main.java` to match your audio file's name.
3. Compile the Java files:
   ```bash
   javac Main.java AlarmClock.java
   ```
4. Run the program:
   ```bash
   java Main
   ```
5. When prompted, enter your desired alarm time in `HH:MM:SS` format (e.g., `14:30:00` for 2:30 PM).
6. The program will wait until the specified time, then play the alarm sound.
7. Press Enter to stop the alarm sound.

## Notes

- The program uses the system's current time to trigger the alarm.
- Make sure the audio file is in WAV format for compatibility.
- The program closes the scanner after the alarm; restart the program if you want to set another alarm.

## License

This project is provided as-is. Feel free to modify and improve it!
