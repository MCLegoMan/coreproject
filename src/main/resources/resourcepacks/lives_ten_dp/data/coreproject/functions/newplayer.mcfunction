title @s times 20 60 20
title @s subtitle {"text":"You have 10 lives...","color":"gold"}
title @s title {"text":"Welcome to Core!","bold":true,"color":"red"}

execute as @s run scoreboard players set @s Deaths 0
execute as @s run scoreboard players set @s Lives 10

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