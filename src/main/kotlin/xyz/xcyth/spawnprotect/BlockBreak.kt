package xyz.xcyth.spawnprotect

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent

class BlockBreak(plugin: SpawnProtect) : Listener {
    init {
        Bukkit.getPluginManager().registerEvents(this, plugin)
    }

    @EventHandler
    fun blockBreak(e: BlockBreakEvent) {
        val worldSpawn = e.player.world.spawnLocation
        if (e.block.location.blockX < worldSpawn.blockX + 3 || e.block.location.blockY == worldSpawn.blockY) {
            e.isCancelled = true
            e.player.sendMessage("Hey! You can't break blocks this close to spawn!")
        }
    }
}