package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "How to become a admin.", usage = "/<command>", aliases = "admininfo")
public class Command_ai extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        
            
            playerMsg(ChatColor.GREEN + "To apply for admin you need to go to the forums at http://freedomop.boards.net");
            playerMsg(ChatColor.YELLOW + "Then go to the board 'Super Admin Applications' and read the thread labeled 'CrafterSmith12's super admin application - EXAMPLE!.");
            playerMsg(ChatColor.PURPLE + "Then if your ready to make a admin application, go and hit CREATE THREAD, and follow the questions!.");
            playerMsg(ChatColor.RED + "We ask for you not to ask existing admins for recommendations, this will get your application denied.");
            playerMsg(ChatColor.GOLD + "Good Luck!");
            return true;
    }
}
