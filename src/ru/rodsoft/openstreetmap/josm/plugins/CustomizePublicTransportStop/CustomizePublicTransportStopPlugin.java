package ru.rodsoft.openstreetmap.josm.plugins.customizepublictransportstop;

import org.openstreetmap.josm.gui.MainApplication;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;

/**
 * 
 * @author Rodion Scherbakov
 * Class of plugin of customizing of stop area
 * Plugin for josm editor
 */
public class CustomizePublicTransportStopPlugin  extends Plugin
{
	/**
	 * Stop area customizing action
	 */
	private CustomizeStopAction stopAreaCreatorAction;

	/**
	 * Constructor of plug-in object
	 * @param info Plug-in properties
	 */
    public CustomizePublicTransportStopPlugin(PluginInformation info) {
        super(info);
        stopAreaCreatorAction = CustomizeStopAction.createCustomizeStopAction();
        MainApplication.getMenu().toolsMenu.add(stopAreaCreatorAction);
        System.out.println(getPluginDir());
    }
    
}
