package aysu.de.neunator.De.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Map;

public class Speed10 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.addPotionEffect( new PotionEffect(PotionEffectType.SPEED, 10000000, 9));
            player.removePotionEffect(PotionEffectType.SLOW);
            player.removePotionEffect(PotionEffectType.BLINDNESS);
            player.removePotionEffect(PotionEffectType.JUMP);
            player.setGameMode(GameMode.SURVIVAL);
            player.setInvulnerable(false);

            if (player.isDead()){
                player.removePotionEffect(PotionEffectType.SPEED);
            }


            sender.sendMessage("Du bist nun Schneller");
        }else
            sender.sendMessage("Du bist kein Spieler!");

        return true;
    }
}
