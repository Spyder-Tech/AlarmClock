package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Alarm Clock Program
        // Uses Military time
        
        Scanner scanner = new Scanner(System.in);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        
        // audio file placed inside project folder so there's no need to use an absolute file path
        String filePath = "Pokémon Emerald - Deoxys Battle Theme (Remix).wav";
        
        while(alarmTime == null)
        {
            try{
                System.out.println("Using Military time EX: (1PM is 13)");
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();
                
                // Parsing inputTime string to alarmTime
                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for: " + alarmTime);
            } catch(DateTimeParseException e)
            {
                System.out.println("Invalid Format. Please use HH:MM:SS");
            }
        }
        
        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
        
    }
}