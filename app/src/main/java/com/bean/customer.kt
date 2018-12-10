package com.bean

import android.util.Log

/**
 * Created by nicestars on 2018/12/10 23:15.
 * nicestars.cn@gmail.com
 */
class customer {

    var value :Int =0
    get() = field
    set(value){
        Log.e("NiceStarsX",value.toString())
        field=value
    }
}