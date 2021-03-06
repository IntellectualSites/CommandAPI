package com.intellectualsites.commands.bukkit.senders;

import com.intellectualsites.commands.Command;
import com.intellectualsites.commands.CommandManager;
import com.intellectualsites.commands.parser.Parserable;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;

import java.util.Collection;

public class ConsoleCaller extends BukkitCommandCaller<ConsoleCommandSender> {

    public static final ConsoleCaller instance = new ConsoleCaller();

    @SuppressWarnings("WeakerAccess") protected ConsoleCaller() {
    }

    public ConsoleCommandSender getSuperCaller() {
        return Bukkit.getConsoleSender();
    }

    public void sendRequiredArgumentsList(CommandManager manager, Command cmd,
        Collection<Parserable> required, String usage) {
        // TODO: Implement
    }
}
