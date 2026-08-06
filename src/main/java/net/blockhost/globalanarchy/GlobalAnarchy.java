package net.blockhost.globalanarchy;

import net.fabricmc.api.ClientModInitializer;

public class GlobalAnarchy implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // The server-blocklist bypass is applied entirely through BlockedServersMixin;
        // no runtime initialization is required.
    }
}
