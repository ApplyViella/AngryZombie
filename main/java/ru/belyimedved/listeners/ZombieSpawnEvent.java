package ru.belyimedved.listeners;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

public class ZombieSpawnEvent implements Listener {

    @EventHandler
    public void onZombieSpawn(EntitySpawnEvent event){
        if(!(event.getEntity() instanceof Zombie)) return;

        ItemStack helmet = new ItemStack(Material.NETHERITE_HELMET);
        ItemStack chestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
        ItemStack leggings = new ItemStack(Material.NETHERITE_LEGGINGS);
        ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS);
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);

        Zombie zombie = (Zombie) event.getEntity();

        zombie.getEquipment().setHelmet(helmet);
        zombie.getEquipment().setChestplate(chestplate);
        zombie.getEquipment().setLeggings(leggings);
        zombie.getEquipment().setBoots(boots);

        zombie.getEquipment().setItemInMainHand(sword);

        zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 5));
    }

}
