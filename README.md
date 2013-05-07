LeBot
=====

Link to PircBotx framework: https://code.google.com/p/pircbotx/

##About LeBot

LeBot is an IRC Bot specifically for irc.esper.net, however, it can be used on other hosts.
LeBot started out as just an experiment, but is now a full time active maintenance
bot on several channels. LeBot is meant to be a customizable, yet simple and powerful bot.

##Running and Configuring LeBot

To customize LeBot, open up config.txt. If config.txt is missing, run xRun.bat, which will 
generate a new one. Once the config.txt has been loaded, close the cmd prompt, and open config.txt.
Editing config.txt is very simple.

###There are directions directly in the file itself. Here are config.txt's contents:

ORDER OF CONFIG: Owner, Bot Name, Password (optional), Channel <br />
Owner <br />
BotName <br />
Bot Password <br />
&#35;lobby <br />

###An example of a LeBot config.txt:

ORDER OF CONFIG: Owner, Bot Name, Password (optional), Channel <br />
LeChosenOne <br />
LeChosenOne's_Bot <br />
password <br />
&#35;chat <br />

Although it is not required, setting a password for your bot is highly recommended for saftey and security.
To set a password for your bot on irc.esper.net, log in as your bot name, and type <br />
/msg nickserv register <desired password> <email>
After, this go to your email and follow the instructions. Once the password is set, use that in your config.txt.

To run LeBot, simply run xRun.bat. Ontop of running your bot, xRun.bat will also double as a mini irc chat client.
It will display all chat feed and actions happening on the channel.

##Licensing
LeBot - Copyright (c)LeChosenOne <2013> 
This software is writted with the PircBotx framework, and is open sourced.
You can distribute, modify, sell, merge, publish, sublicense, copy, or deal with the software in any way without limitation.

I ask that if you take substancial parts of LeBot's code or fork it, that you either send a link to this page or copy over
this license.

And thank you for using LeBot!
   
   
