# vado
How to use github.

First run:
  Install git:
  http://git-scm.com/downloads
  Choose default settings for most things. Choose the option to run git from windows console since that gives you the most control.
  
  
  Clone the repository:
  Move into a new directory and run the following code in command prompt: (the easiest way to do this is to go to the folder you want, hold shift and right click in the folder. Select "open command window here")
  git clone https://github.com/twhite14/vado/
  It will ask for your github username and password, enter it.
  You're done! Add or modify files as needed.
  
After first run:
  From here on make sure you're running a command prompt in the same directory as the git repo.

  To update your local files from the server run the following command:
  git pull
  It's worth noting now that wenever git asks for a username and password, enter your github username and password. It's safe.
  Your local files are now up to date and match the server files! Please note that any changes you made locally will probably be lost.

  After making edits to your local copy of files you'll want to upload them to github. Do this periodically so we don't wind up with conflicting files that break each other.
  To update the copy on the server, run the following commands:
  git add *
  This adds any files you modified to a list to modify on the server's end.
  git commit
  A text editing program called VIM will appear in the command prompt. Enter a description of what you're commiting, press the escape key, then type :wq and press enter to exit and save what you wrote.
  git push
  This actually writes any files you changed to the server.
  The server is now up to date!
  
  If you're ever unsure if pulling the current repo will break something locally, simply copy the files you're concerned about into a folder outside of the folder you use for github and they'll remain unchanged.
  
  
Keep in mind that mistakes can be undone, that's half the purpose of having a git repo. Mak
  
