package de.btobastian.javacord.listener.role;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.listener.Listener;
import de.btobastian.javacord.permissions.Role;

public interface RoleCreateListener extends Listener {
    
    /**
     * Called when a new role was created.
     * 
     * @param api The api.
     * @param role The role.
     */
    public void onRoleCreate(DiscordAPI api, Role role);

}
