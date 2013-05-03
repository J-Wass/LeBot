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

public class LeBotJoinCore extends ListenerAdapter 
{
    public void onConnect(ConnectEvent event) throws Exception
	{
         System.out.println("Bot joined " + Values.channelName);
		 event.getBot().identify(Values.botPass);
	}
}