import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class Values
{ 
    String placeholder = "";
    public static String owner = "";
    public static String botName = "";
	public static String botPass ="";
	public static String channelName = "";

    public static String spammer = "";
	public static String lastKicked = "";

	public static boolean isUpper(String capsMessage)
    {
	     String message = capsMessage.replaceAll(" ", "");
         for(char c : message.toCharArray())
         {
              if(!Character.isUpperCase(c))
		      {
                   return false;
              }                        
	     }
		 if(message.length() < 6)
         {
		      return false;
		 }
	   	 return true;
    }

public void load()
{
    System.out.println(" \r\n Loading your configuration settings...");
	try
	{
	   File config = new File("config.txt");
	   Scanner scanner = new Scanner(config);

	   placeholder = scanner.nextLine();
	   owner = scanner.nextLine();
	   botName = scanner.nextLine();
	   botPass = scanner.nextLine();
	   channelName = scanner.nextLine();

	   System.out.println("Configuration finished. \n Owner loaded as " + owner + ".\n Bot nick loaded as " + botName + ".\n Bot password loaded. \n Channel name loaded as " + channelName + ".");
	}
	catch(Exception e)
	{
	    System.out.println("Exception found: " + e);
	}
}
}