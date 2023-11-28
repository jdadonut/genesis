package uninit.genesis.common

import uninit.genesis.common.platform.OsFamily

actual object Platform {
    actual val osFamily: OsFamily
        get() = when (System.getProperty("os.name")) {
            "Mac OS X" -> OsFamily.MACOS
            "Windows" -> OsFamily.WINDOWS
            "Linux" -> OsFamily.LINUX
            else -> OsFamily.ANDROID
        }

    actual fun vibrate(iosIntensity: Float, iosSharpness: Float, androidTime: Int) {
    }

}