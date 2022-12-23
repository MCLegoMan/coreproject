execute as @a[gamemode=spectator] run execute if score @s Deaths matches ..9 run function coreproject:revival
execute as @a[gamemode=spectator] run execute if score @s Deaths matches 10 run function coreproject:death

execute as @a[team=] run function coreproject:newplayer