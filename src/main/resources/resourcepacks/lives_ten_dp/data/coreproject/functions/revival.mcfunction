gamemode survival @s

title @s times 20 60 20
title @s subtitle {"text":"You have been respawned...","color":"gold"}
title @s title {"text":"YOU DIED!","bold":true,"color":"red"}
effect give @s minecraft:regeneration 60 255 true

execute as @s run scoreboard players set @s Lives 10
execute as @s run scoreboard players operation @s Lives -= @s Deaths

execute if score @s Deaths matches ..0 run team join 10 @s
execute if score @s Deaths matches 1 run team join 9 @s
execute if score @s Deaths matches 2 run team join 8 @s
execute if score @s Deaths matches 3 run team join 7 @s
execute if score @s Deaths matches 4 run team join 6 @s
execute if score @s Deaths matches 5 run team join 5 @s
execute if score @s Deaths matches 6 run team join 4 @s
execute if score @s Deaths matches 7 run team join 3 @s
execute if score @s Deaths matches 8 run team join 2 @s
execute if score @s Deaths matches 9 run team join 1 @s
execute if score @s Deaths matches 10 run team join 0 @s