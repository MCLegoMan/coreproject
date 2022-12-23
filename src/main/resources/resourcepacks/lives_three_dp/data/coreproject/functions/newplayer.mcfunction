title @s times 20 60 20
title @s subtitle {"text":"You have 3 lives...","color":"gold"}
title @s title {"text":"Welcome to Core!","bold":true,"color":"red"}

execute as @s run scoreboard players set @s Deaths 0
execute as @s run scoreboard players set @s Lives 3

execute if score @s Deaths matches ..0 run team join 3 @s
execute if score @s Deaths matches 1 run team join 2 @s
execute if score @s Deaths matches 2 run team join 1 @s