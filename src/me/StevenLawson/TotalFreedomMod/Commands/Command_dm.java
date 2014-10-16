package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH)
@CommandParameters(description = "For developers who are testing new commands!", usage = "/<command>", aliases = "devmode")
public class Command_dm extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        
             
            playerMsg(ChatColor.GREEN + "Confirmed! Please test your commands!");
            TFM_Util.bcastMsg("Loading.. Dev Mod Confirmed!", ChatColor.GREEN);
            TFM_Util.bcastMsg("Warning: A Dev turned on DM (DevMode) He is testing a plugin! Expect weird things!", ChatColor.RED);
            return true;
    }
}
