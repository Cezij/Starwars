scoreboard players enable @a[ team= ] Jedi
scoreboard players enable @a[ team= ] Sith
team join Jedi @a[ scores= {Jedi = 1..}]
team join Sith @a[ scores= {Sith = 1..}]
scoreboard players reset @a[ scores= {Jedi = 1..}] Sith
scoreboard players reset @a[ scores= {Sith = 1..}] Jedi
scoreboard players reset @a[ scores= {Sith = 1..}] Sith
scoreboard players reset @a[ scores= {Jedi = 1..}] Jedi

execute at @e[ tag= Jedi] run tp @a[ team= Sith, distance= ..35] 100.50 49.00 0.50 90.90 0.13
execute at @e[ tag= Sith] run tp @a[ team= Jedi, distance= ..35] 100.50 49.00 0.50 90.90 0.13