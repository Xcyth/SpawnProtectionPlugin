package xyz.xcyth.spawnprotect

import org.bukkit.plugin.java.JavaPlugin

class SpawnProtect: JavaPlugin() {
    override fun onEnable() {
        BlockPlace(this)
        BlockBreak(this)
    }

    override fun onDisable() {
        println("[SpawnProtect] Disabled.")
    }
}