package com.virendra.positrarxuploadmedia.module

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import com.virendra.positrarxuploadmedia.helper.MetaDataReader
import com.virendra.positrarxuploadmedia.helper.MetaDataReaderImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class VideoPlayerModule {
    @Provides
    @ViewModelScoped
    fun provideVideoPlayer(application: Application): Player {
        return ExoPlayer.Builder(application)
            .build()
    }

    @Provides
    @ViewModelScoped
    fun provideMetaDataReader(application: Application): MetaDataReader {
        return MetaDataReaderImpl(application)
    }
}