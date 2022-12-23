execute as @a[gamemode=spectator] run execute if score @s Deaths matches ..4 run function coreproject:revival
execute as @a[gamemode=spectator] run execute if score @s Deaths matches 5 run execute as @s[scores={finalDeath=0}] run function coreproject:death

execute as @a[team=] run function coreproject:newplayer