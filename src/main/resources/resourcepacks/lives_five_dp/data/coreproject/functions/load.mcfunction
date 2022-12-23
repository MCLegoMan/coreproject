gamerule doImmediateRespawn true

scoreboard objectives add Deaths deathCount
scoreboard objectives add Lives dummy
scoreboard objectives add finalDeath dummy "Final Death"
scoreboard objectives setdisplay list Lives

team add 5
team add 4
team add 3
team add 2
team add 1
team add 0
team modify 5 color dark_green
team modify 4 color green
team modify 3 color yellow
team modify 2 color gold
team modify 1 color red
team modify 0 color gray