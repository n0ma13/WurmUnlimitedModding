package org.n0ma13.wurmunlimited.mods.CraftedTwigs;
import com.wurmonline.server.items.CreationCategories;
import com.wurmonline.server.items.CreationEntryCreator;
import java.util.Properties;
import org.gotti.wurmunlimited.modloader.interfaces.ServerStartedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;

public class initiator implements WurmServerMod, ServerStartedListener {

	public void onServerStarted() {
		CreationEntryCreator.createSimpleEntry(1005, 8, 688, 1353, false, true, 10.0F, false, false, 0, 0, CreationCategories.RESOURCES);
	}
}