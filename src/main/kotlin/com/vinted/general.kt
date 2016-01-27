package com.vinted

inline fun <reified T> tryGet(default: T, block: () -> T): T {
    try {
        return block()
    } catch(e: Throwable) {
        return default
    }
}