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

public class LeBotMessageCore extends ListenerAdapter 
{
        public void onMessage(MessageEvent event) 
        {
		        Channel channel = event.getChannel();

		        //display channel messages to bot
				System.out.println(event.getUser().getNick() + ": " + event.getMessage());

		        //trollin`
				if(event.getMessage().toLowerCase().contains("its getting bigger") || event.getMessage().toLowerCase().contains("fun time last night") || event.getMessage().toLowerCase().contains("its so hard") || event.getMessage().toLowerCase().contains("good stamina") || event.getMessage().toLowerCase().contains("go deeper"))
				{
				     event.respond("That's what she said");
				}

				//Caps Detection
				if(Values.isUpper(event.getMessage()))
				{				    
				    //if spammer was already kicked and warned again for spamming
					if(Values.spammer == event.getUser().getNick() && Values.lastKicked == event.getUser().getNick())
					{
					   event.getBot().ban(channel, event.getUser().getHostmask());
					   event.getBot().kick(channel, event.getUser());
					   System.out.println("Spam Detected. BANNING: " + event.getUser().getNick());
					   Values.spammer = "";
					   Values.lastKicked = "";
					}
                    //if the spam infringer was the last person caught spamming
					if(Values.spammer == event.getUser().getNick())
					{	
					    event.getBot().kick(channel, event.getUser());		
						System.out.println("Spam Detected. KICKING: " + event.getUser().getNick());		    
						Values.lastKicked = event.getUser().getNick();
						Values.spammer = ""; 
					}
					//if spam infringer was not the last person caught spamming
					else
					{
					    event.respond("Please do not spam. You have been warned.");
						Values.spammer = event.getUser().getNick();
					}
				}
		}
}