package de.bht.se.gwt.Example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtExample implements EntryPoint {
   private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

   public void onModuleLoad() {
      AppStarter starter = GWT.create(AppStarter.class);
      starter.start(greetingService);
   }

}
