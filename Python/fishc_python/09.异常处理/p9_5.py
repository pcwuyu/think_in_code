try:
    sum = 1 + '1'
    f = open('我是一个不存在的文档.txt')
    print(f.read())
    f.close()
except (OSError, TypeError) as reason:
    print('文件出错啦T_T\n文件出错的原因是: ' + str(reason))
