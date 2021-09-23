package xyz.xcyth.spawnprotect

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockPlaceEvent

class BlockPlace(plugin: SpawnProtect) : Listener {
    init {
        Bukkit.getPluginManager().registerEvents(this, plugin)
    }

    @EventHandler
    fun blockPlace(e: BlockPlaceEvent) {
        val worldSpawn = e.player.world.spawnLocation
        if (e.block.location.blockX < worldSpawn.blockX + 3 || e.block.location.blockY == worldSpawn.blockY) {
            e.setBuild(false)
            e.player.sendMessage("Hey! You can't build so close to spawn.")
        }
    }
}