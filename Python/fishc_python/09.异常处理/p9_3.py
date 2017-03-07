try:
    f = open('我为什么是一个文档: ')
    print(f.read())
    f.close()
except OSError:
    print('文件的打开过程中出错啦~')
