package de.bht.se.gwt.Example.client;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class NoAppStarter implements AppStarter {

   @Override
   public void start(GreetingServiceAsync greetingService) {
      HTML title = new HTML("Sorry! You need a browser to see the contents of this site.");
      RootPanel.get("myTitle").add(title);
   }

}
