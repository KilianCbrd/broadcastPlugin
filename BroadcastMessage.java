package me.minecraftserver.economie;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

class BroadcastMessage implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        StringBuilder sb = new StringBuilder();
        String broadcastSender = "[Annonce] "; //* le texte contenue ici peut etre modifier a votre guise
        
        if(args.length >= 1){
            for(String part: args){
                sb.append(part+" ");
            }
            Bukkit.broadcastMessage(broadcastSender+sb);
        }

        return false;
    }
}
