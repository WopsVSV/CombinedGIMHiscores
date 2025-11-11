package com.gimhiscores.combinedgimhiscores;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class CombinedGIMHiscoresPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(CombinedGIMHiscoresPlugin.class);
		RuneLite.main(args);
	}
}