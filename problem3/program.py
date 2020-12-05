originale = []
reallyShuffled = []
with open('originale.txt') as f:
    originale = f.read().splitlines()
with open('really_shuffled.txt') as f:
    reallyShuffled = f.read().splitlines()

result = ''
for shuffled in reallyShuffled:
    for original in originale:
        if sorted(shuffled) == sorted(original):
            result += original
            break
print(result)  # lopatavremeasosindfrumosrotundurechinimenigleznecatargvislas
