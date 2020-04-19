import random

diceRolls = 0
noDiceRemoved = 0
diceRemaining = 100
total = 0
print("{0:15}{1:21}{2:19}".format("Dice Rolls", "No. Dice Removed", "Remaining Dice"))
while diceRemaining is not 0:
    total = 0
    i = 0
    while i < diceRemaining:

        ranNum = random.randint(1, 6)

        if ranNum is 6:
            total = total + 1
            diceRemaining = diceRemaining - 1
        i = i + 1

    diceRolls = diceRolls + 1
    noDiceRemoved = total + noDiceRemoved
    print("{0:<14} {1:<20} {2:<19}".format(diceRolls, noDiceRemoved, diceRemaining))
