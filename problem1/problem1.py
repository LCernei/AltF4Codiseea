from PIL import Image

im = Image.open('best.bmp')
sumAll = 0
for x in range(im.width):
    for y in range(im.height):
        r, g, b = im.getpixel((x, y))
        sumAll += r
print(sumAll)  # 59008105
