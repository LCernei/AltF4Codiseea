# find the original text in Odiseea.txt with the regex: [a-z]{3}\s[a-z]{4},\s[a-z]{2}\s[a-z]{4}\.
# compare original with encrypted and create the decryption dictionary

def convert(item, haystack):
    result = item
    isUpper = item.isupper()
    needle = item.lower() if isUpper else item
    if needle in haystack:
        result = haystack.get(needle)
    return result.upper() if isUpper else result


decrypt = {
    'k': 't',
    'v': 'a',
    'o': 'i',
    'g': 'd',
    's': 'u',
    'a': 'b',
    'i': 'o',
    'x': 's',
    'e': 'c',
    'z': 'e',
    'w': 'p',
    'q': 'l',
    'b': 'r',
    'r': 'm',
    'y': 'f',
    'h': 'v',
    'c': 'g',
    'u': 'h',
    'f': 'z',

    'j': 'x',
    'm': 'q',
    'p': 'y',
    't': 'w'
}
encrypt = {v: k for k, v in decrypt.items()}

with open('new_out.txt', 'r') as f:
    sampleString = f.read()
sampleList = list(sampleString)
for i in range(len(sampleList)):
    sampleList[i] = convert(sampleList[i], decrypt)
sampleString = ''.join(str(x) for x in sampleList)
with open('decripted.txt', 'w') as f:
    f.write(sampleString)


with open('new_in.txt', 'r') as f:
    sampleString = f.read()
sampleList = list(sampleString)
for i in range(len(sampleList)):
    sampleList[i] = convert(sampleList[i], encrypt)
sampleString = ''.join(str(x) for x in sampleList)
with open('encrypted.txt', 'w') as f:
    f.write(sampleString)

# i wvez-nkbz wiwib xo zq v wsx,
# vkznz gzeo, xeuoraongs-o xibkoo wvxsq,
# xo-vhong ev Rznkib euowsq xvs xo cqvxsq.
