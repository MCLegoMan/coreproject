execute as @a[gamemode=spectator] run execute if score @s Deaths matches ..2 run function coreproject:revival
execute as @a[gamemode=spectator] run execute if score @s Deaths matches 3 run function coreproject:death

execute as @a[team=] run function coreproject:newplayer