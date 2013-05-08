LeBot
=====

Link to PircBotx framework: https://code.google.com/p/pircbotx/
Link to Java Word Net Library: http://sourceforge.net/projects/jwordnet/?source=dlp

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
/msg nickserv register -desired password- -email- <br />
After, this go to your email and follow the instructions. Once the password is set, use that in your config.txt.

To run LeBot, simply run xRun.bat. Ontop of running your bot, xRun.bat will also double as a mini irc chat client.
It will display all chat feed and actions happening on the channel.

##Licensing

License Information

Java Wordnet Library - Copyright (C) 2000-2007 the JWNL development team (http://www.sourceforge.net/projects/jwordnet)
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided
that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, this list of conditions and the
following disclaimer.
* Redistributions in binary form must reproduce the above copyright notice, this list of conditions and
the following disclaimer in the documentation and/or other materials provided with the distribution.
* Neither the name of the product ("JWNL") nor the names of its contributors may be used to endorse or promote
products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

LeBot - Copyright (c)LeChosenOne <2013> 
This software is writted with the PircBotx framework, and is open sourced.
You can distribute, modify, sell, merge, publish, sublicense, copy, or deal with the software in any way without limitation.

I ask that if you take substancial parts of LeBot's code or fork it, that you either send a link to this page or copy over
this license.

And thank you for using LeBot!
   
   
