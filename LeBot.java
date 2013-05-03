import org.pircbotx.PircBotX;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import static java.lang.Thread.*;

public class LeBot 
{
        public static void main(String[] args) throws Exception 
        {
                PircBotX bot = new PircBotX();

				File configFile = new File("config.txt");
				if(!configFile.exists())
				{
				   System.out.println("WARNING: Config.txt not found.\n Please refer to README.txt on how to set up config.txt.\n Attempting to creating default config.txt... This may take a moment.");
				   try
				   {
				      configFile.createNewFile();
					  FileWriter configWriter = new FileWriter(configFile, true);

					  configWriter.write("ORDER OF CONFIG: Owner, Bot Name, Password (optional), Channel \r\n" + "Owner \r\n" + "BotName \r\n" + "Bot Password \r\n" + "#lobby");
					  configWriter.close();
				   }
				   catch(Exception e)
				   {
				      e.printStackTrace();
				   }
				   try
				   {
				      Thread.sleep(2000);
				   }
				   catch(Exception e)
				   {
				      e.printStackTrace();
				   }
				}

				//attach cores
		        bot.getListenerManager().addListener(new LeBotCommandCore());
				bot.getListenerManager().addListener(new LeBotJoinCore());
				bot.getListenerManager().addListener(new LeBotMessageCore());

				Values config = new Values();
				config.load();

                bot.setName(Values.botName);
                bot.connect("irc.esper.net");
                bot.joinChannel(Values.channelName);
        }
}