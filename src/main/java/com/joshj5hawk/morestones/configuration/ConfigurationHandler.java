package com.joshj5hawk.morestones.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.util.concurrent.ExecutionException;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //Get Config File
        Configuration configuration = new Configuration(configFile);

        try
        {
            //Load the config
            configuration.load();

            //Read config options
            boolean debugEnable = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Enable Debug Mode?").getBoolean(true);
        }
        catch (Exception e)
        {
            //Log the exception
        }
        finally
        {
            //Save the config
            configuration.save();
        }
    }
}