gamemode survival @s

title @s times 20 60 20
title @s subtitle {"text":"You have been respawned...","color":"gold"}
title @s title {"text":"YOU DIED!","bold":true,"color":"red"}
effect give @s minecraft:regeneration 60 255 true

execute as @s run scoreboard players set @s Lives 3
execute as @s run scoreboard players operation @s Lives -= @s Deaths

execute if score @s Deaths matches ..0 run team join 3 @s
execute if score @s Deaths matches 1 run team join 2 @s
execute if score @s Deaths matches 2 run team join 1 @s