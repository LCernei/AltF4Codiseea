from PIL import Image
# 59008105 incorrect: sum red channel values for all pixels
# 09820390 incorrect: sum red channel values for non white pixels
# 49187715 incorrect

im = Image.open('best.bmp')
sumAll = 0
for x in range(im.width):
    for y in range(im.height):
        r, g, b = im.getpixel((x, y))
        sumAll += r
        count += 1
print(sumAll)
