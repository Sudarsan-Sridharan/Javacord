package org.javacord.event.server.role;

import org.javacord.DiscordApi;
import org.javacord.entity.permission.Role;
import org.javacord.event.server.ServerEvent;
import org.javacord.event.server.ServerEvent;

/**
 * A Role event.
 */
public abstract class RoleEvent extends ServerEvent {

    /**
     * The role of the event
     */
    private final Role role;

    /**
     * Creates a new role event.
     *
     * @param api The api instance of the event.
     * @param role The role of the event.
     */
    public RoleEvent(DiscordApi api, Role role) {
        super(api, role.getServer());
        this.role = role;
    }

    /**
     * Gets the role of the event.
     *
     * @return The role of the event.
     */
    public Role getRole() {
        return role;
    }
}