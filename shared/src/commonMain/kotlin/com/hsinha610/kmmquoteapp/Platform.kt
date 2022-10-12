package com.hsinha610.kmmquoteapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform