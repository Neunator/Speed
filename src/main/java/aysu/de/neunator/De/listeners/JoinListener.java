package aysu.de.neunator.De.listeners;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Server;
import org.bukkit.event.Event;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.Vector;

public class JoinListener implements Listener {
    @EventHandler
    public void onJoinE(PlayerJoinEvent e) throws InterruptedException {
        Player p = e.getPlayer();

        e.setJoinMessage("§a»Mit /start kannst du die Challenge beginnen!");
        //p.setWalkSpeed(0);
        p.setInvulnerable(true);
        p.setGameMode(GameMode.ADVENTURE);
        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1000,9));
        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000, 9));
        p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000,-100));
    }

}

