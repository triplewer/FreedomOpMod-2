package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Ban;
import me.StevenLawson.TotalFreedomMod.TFM_BanManager;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerList;
import me.StevenLawson.TotalFreedomMod.TFM_ServerInterface;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Ban a user for griefing!", usage = "/<command> <player>")
public class Command_gban extends TFM_Command
{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) {
		   if (args.length == 0)
	        {
	            return false;
	        }

	        final Player player = getPlayer(args[0]);

	        if (player == null)
	        {
	            playerMsg(TFM_Command.PLAYER_NOT_FOUND, ChatColor.RED);
	            return true;
        }
        TFM_Util.bcastMsg(ChatColor.RED + sender.getName() + " - Banning  " + player.getName() + " For Griefing!");


        server.dispatchCommand(sender, "co rb u:" + player.getName() + " t:24h r:global");
        player.kickPlayer(ChatColor.RED + "Core Protect gave results of you griefing, you have been banned for 24 hours  '" + sender.getName() + "'.  Miscommunication, misunderstanding, wrongly banned?  Appeal at FreedomOP.boards.net");
        // ban IPs
        for (String playerIp : TFM_PlayerList.getEntry(player).getIps())
        {
            TFM_BanManager.addIpBan(new TFM_Ban(playerIp, player.getName()));
        }

        // ban uuid
        TFM_BanManager.addUuidBan(player);
        //IPBAN
        player.kickPlayer("Dont grief you idiot, look at the rules!");
        return true;
	}

}
