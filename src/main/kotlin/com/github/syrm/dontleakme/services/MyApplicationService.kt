package com.github.syrm.dontleakme.services

import com.github.syrm.dontleakme.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))
    }
}
