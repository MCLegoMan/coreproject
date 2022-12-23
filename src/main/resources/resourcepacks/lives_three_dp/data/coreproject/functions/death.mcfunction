title @s times 20 60 20
title @s subtitle {"text":"You have been respawned...","color":"gold"}
title @s title {"text":"YOU DIED!","bold":true,"color":"red"}

execute as @s run scoreboard players set @s Lives 3
execute as @s run scoreboard players operation @s Lives -= @s Deaths

execute if score @s Deaths matches 3 run team join 0 @s