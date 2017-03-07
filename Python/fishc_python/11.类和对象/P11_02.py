import random as r

class Fish:
    def __init__(self):
        self.x = r.randint(0, 10)
        self.y = r.randint(0, 10)

    def move(self):
        # 这里主要是演示类的继承机制, 就不考虑检查场景边界和移动方向的问题

        # 假设所有的鱼都是一路向西游
        self.x -= 1
        print('我现在的位置是: ', self.x, self.y)

class Goldfish(Fish):
    pass

class Carp(Fish):
    pass

class Salmon(Fish):
    pass

# 上面几个都是食物,食物不需要个性, 所以直接继承Fish类的全部属性和方法即可
# 下面定义鲨鱼类, 这个是吃货, 除了继承Fish类的属性和方法, 还要添加一个吃的方法

class Shark(Fish):
    def __init__(self):
        # Fish.__init__(self)
        super().__init__()
        self.hungry = True
    def eat(self):
        if self.hungry:
            print('吃货的梦想就是天天有的吃^_^')
            self.hungry = False
        else:
            print('饱了, 吃不下了!')
