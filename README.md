# BetterMultiDex

## 这是什么
BetterMultiDex是早期个人为了解决Unity在Android平台上方法数超过64k而出现的；

MultiDex.install(Context context)会自动读取apk根目录下的classesN.dex文件，但是这里有两个局限性：
1. 命名的局限性，dex名字必须遵循classesN.dex的命名方式;
2. dex文件位置的局限性；

这些局限性让Dex文件难以维护。

## 如何使用
### 手动分包
将所有SDK的jar包手动编译成dex文件。
### 
在assets文件夹下面新建secondary_dexs文件夹，把dex文件全部放进去，然后Application运行：
```java
BetterMultiDex.install(this);
```
