gamerule doImmediateRespawn true

scoreboard objectives add Deaths deathCount
scoreboard objectives add Lives dummy
scoreboard objectives setdisplay list Lives

team add 3
team add 2
team add 1
team add 0
team modify 3 color dark_green
team modify 2 color yellow
team modify 1 color red
team modify 0 color gray