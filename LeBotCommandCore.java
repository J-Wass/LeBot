import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;
import static org.pircbotx.ReplyConstants.*;
import org.pircbotx.exception.IrcException;
import org.pircbotx.exception.NickAlreadyInUseException;
import org.pircbotx.hooks.CoreHooks;
import org.pircbotx.hooks.Event;
import org.pircbotx.hooks.Listener;
import org.pircbotx.hooks.events.*;
import org.pircbotx.hooks.managers.GenericListenerManager;
import org.pircbotx.hooks.managers.ListenerManager;
import org.pircbotx.hooks.managers.ThreadedListenerManager;
import org.pircbotx.User;
import org.pircbotx.Channel;
import java.util.Date;
import java.util.Random;

public class LeBotCommandCore extends ListenerAdapter 
{

        public void onMessage(MessageEvent event) 
        {
		        Channel channel = event.getChannel();

		        //help command
				if((event.getMessage().toLowerCase().contains("lcbot") && event.getMessage().toLowerCase().contains("help")) || event.getMessage().equalsIgnoreCase("!help"))
				{
				    event.respond("I currently support !time, !help, !joke, !about, !ping and some other stuff.");
				}

				//owner command
                if (event.getMessage().equalsIgnoreCase("!owner") || (event.getMessage().toLowerCase().contains("who") && event.getMessage().toLowerCase().contains("owner")))
                {
                    event.respond("The bot owner is " + Values.owner);						
                }

		        //time command
                if (event.getMessage().equalsIgnoreCase("!time"))
                {
                    event.respond("The current time is " + new Date());						
                }

				//ping command
                if (event.getMessage().equalsIgnoreCase("!ping"))
                {
                    event.respond("Pong!");						
                }

				//joke command
				if (event.getMessage().equalsIgnoreCase("!joke"))
                {
                    String[] jokes = 
					{         
					           "Energizer Bunny was arrested, charged with battery.",
                               "I usually take steps to avoid elevators.",
                               "Schrodinger's Cat: Wanted dead and alive.",
                               "If at first you don't succeed; call it version 1.0",
                               "CONGRESS.SYS Corrupted: Re-boot Washington D.C (Y/n)?",
                               "We live in a society where pizza gets to your house before the police.",
                               "Light travels faster than sound. This is why some people appear bright until you hear them speak.",
                               "Evening news is where they begin with 'Good evening', and then proceed to tell you why it isn't.",
                               "You do not need a parachute to skydive. You only need a parachute to skydive twice.",
                               "When in doubt, mumble.",
                               "War does not determine who is right – only who is left...",
                               "I wondered why the frisbee was getting bigger - then it hit me.",
                               "Never argue with a fool, they will lower you to their level, and then beat you with experience.",
                               "There are 3 kinds of people in the world: Those who can count and those who can't.",
                               "Never hit a man with glasses. Hit him with a baseball bat instead.",
                               "Nostalgia isn't what it used to be."
                     };
           
                      Random randJoke = new Random();
                      event.respond(jokes[randJoke.nextInt(jokes.length)]); 
                }
			
			    //about command
				if(event.getMessage().equalsIgnoreCase("!about")) 
                {                    
                     event.respond("LegendCraft is an open sourced minecraft classic software that is based off of 800Craft and fCraft. It is developed by LeChosenOne and DingusBungus. For more information, visit http://www.legendcraft.webuda.com");
                }

				
        }
}