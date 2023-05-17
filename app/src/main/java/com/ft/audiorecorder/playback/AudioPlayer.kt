package com.ft.audiorecorder.playback

import java.io.File

interface AudioPlayer {
    fun playFile(file: File)
    fun stop()
}