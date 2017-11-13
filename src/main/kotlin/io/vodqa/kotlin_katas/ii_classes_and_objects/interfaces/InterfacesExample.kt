package io.vodqa.kotlin_katas.ii_classes_and_objects.interfaces

/**
 * @author sergei.prodanov
 */

interface Audio {
    fun volumeUp()

    fun volumeDown()

    fun setVolume(vol: Int)
}

interface Video {
    val brightness: IntRange
        get() = 0..100

    val contrast: IntRange
        get() = 0..200

    fun setContrast(int: Int)

    fun setBrightness(int: Int)

    fun play() { println("Started video playback") }

    fun pause () { println("Paused video playback") }

    fun stop() { println("Stopped video playback") }
}

open class AudioPlayingDevice : Audio {
    override fun volumeUp() {
        println("Increasing volume")
    }

    override fun volumeDown() {
        println("Decreasing volume")
    }

    override fun setVolume(vol: Int) {
        println("Set volume to $vol")
    }

}

class VideoPlayingDevice: AudioPlayingDevice(), Video {

    override fun setContrast(int: Int) {
        if (int in super<Video>.contrast) {
            println("Setting contrast to $int")
        } else {
            println("Contrast value out of range")
        }
    }

    override fun setBrightness(int: Int) {
        val result: String = if (int in super<Video>.brightness) {
            "Setting brightness to $int"
        } else {
            "Brightness value out of range"
        }

        println(result)
    }

    override fun play() {
        println("Started DVD video playback")
    }
}

fun main(args: Array<String>) {
    val dvdPlayer = VideoPlayingDevice()

    dvdPlayer.setBrightness(10)
    dvdPlayer.setContrast(20)
    dvdPlayer.setVolume(50)
    dvdPlayer.volumeDown()
    dvdPlayer.volumeDown()
    dvdPlayer.play()
    dvdPlayer.pause()
    dvdPlayer.stop()
}
