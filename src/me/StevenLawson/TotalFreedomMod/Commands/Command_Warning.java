package me.StevenLawson.TotalFreedomMod.Commands;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Someone Pissing You Off, But You Cant Smite Them - Warn Them!", usage = "/<command> <playername>")
public class Command_cmdlist extends TFM_Command
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
	        
	        TFM_Util.bcastMsg(sender.getName() + " - Warning " + player.getName(), ChatColor.GREEN);
	        TFM_Util.bcastMsg(sender.getName() + " Says: Stop pissing admins off! Next warning = Smite " + player.getName(), " ! ", ChatColor.RED);
	       final Location targetPos = player.getLocation();
	        for (int x = -1; x <= 1; x++)
	        {
	            for (int z = -1; z <= 1; z++)
	            {
	                final Location strike_pos = new Location(targetPos.getWorld(), targetPos.getBlockX() + x, targetPos.getBlockY(), targetPos.getBlockZ() + z);
	                targetPos.getWorld().strikeLightning(strike_pos);
	            }
	        }
	        final Location targetPos = player.getLocation();
	        for (int x = -1; x <= 1; x++)
	        {
	            for (int z = -1; z <= 1; z++)
	            {
	                final Location strike_pos = new Location(targetPos.getWorld(), targetPos.getBlockX() + x, targetPos.getBlockY(), targetPos.getBlockZ() + z);
	                targetPos.getWorld().strikeLightning(strike_pos);
	            }
	        }final Location targetPos = player.getLocation();
	        for (int x = -1; x <= 1; x++)
	        {
	            for (int z = -1; z <= 1; z++)
	            {
	                final Location strike_pos = new Location(targetPos.getWorld(), targetPos.getBlockX() + x, targetPos.getBlockY(), targetPos.getBlockZ() + z);
	                targetPos.getWorld().strikeLightning(strike_pos);
	            }
	        }
	        
	        final Location targetPos = player.getLocation();
	        for (int x = -1; x <= 1; x++)
	        {
	            for (int z = -1; z <= 1; z++)
	            {
	                final Location strike_pos = new Location(targetPos.getWorld(), targetPos.getBlockX() + x, targetPos.getBlockY(), targetPos.getBlockZ() + z);
	                targetPos.getWorld().strikeLightning(strike_pos);
	            }
	        }
    
    final Location targetPos = player.getLocation();
	        for (int x = -1; x <= 1; x++)
	        {
	            for (int z = -1; z <= 1; z++)
	            {
	                final Location strike_pos = new Location(targetPos.getWorld(), targetPos.getBlockX() + x, targetPos.getBlockY(), targetPos.getBlockZ() + z);
	                targetPos.getWorld().strikeLightning(strike_pos);
	            }
	        }
	        return true;
	        
