package com.bean

import android.util.Log

/**
 * create by NiceStars on 2018.12.10
 * kotlin 构造器相关学习  主要是调用顺序
 */
class Person(url: String) {

    init {
        Log.e("NiceStars", url)
    }

    //如果第二构造器调用了主构造器的话 那么调用顺序为先主构造器 再第二构造器
    constructor(value: Int) : this("NiceStarsX") {
        Log.e("NiceStarsX", value.toString())
    }

    //如果第二构造器调用了主构造器的话 那么调用顺序为先主构造器 再第二构造器
    constructor(d: String, urll: String) : this("{" + urll + "}") {
        Log.e("NiceStarsX", d + ":" + urll)
    }

    //通过this调用第二构造器  并且调用了主构造器
    constructor() : this(20) {
        Log.e("NiceStarsX", "hello kotlin")
    }
    //输出顺序为：
    // NIceStarsX
    //20
    //hello kotlin


}