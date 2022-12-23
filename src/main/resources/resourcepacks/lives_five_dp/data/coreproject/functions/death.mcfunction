playsound coreproject:player_death ambient @a ~ ~ ~ 1 1
tellraw @s ["",{"text":"YOU DIED!","bold":true,"color":"dark_red"},"\n",{"text":"You cannot respawn...","color":"gold"}]

scoreboard players set @s finalDeath 1
execute as @s run scoreboard players set @s Lives 5
execute as @s run scoreboard players operation @s Lives -= @s Deaths

execute if score @s Deaths matches ..0 run team join 5 @s
execute if score @s Deaths matches 1 run team join 4 @s
execute if score @s Deaths matches 2 run team join 3 @s
execute if score @s Deaths matches 3 run team join 2 @s
execute if score @s Deaths matches 4 run team join 1 @s
execute if score @s Deaths matches 5 run team join 0 @s