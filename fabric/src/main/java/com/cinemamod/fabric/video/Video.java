package com.cinemamod.fabric.video;

import net.minecraft.network.PacketByteBuf;
import org.apache.commons.lang3.NotImplementedException;

public class Video {

    private VideoInfo videoInfo;
    private long startedAt;

    public Video(VideoInfo videoInfo, long startedAt) {
        this.videoInfo = videoInfo;
        this.startedAt = startedAt;
    }

    public Video() {

    }

    public VideoInfo getVideoInfo() {
        return videoInfo;
    }

    public long getStartedAt() {
        return startedAt;
    }

    public Video fromBytes(PacketByteBuf buf) {
        videoInfo = new VideoInfo().fromBytes(buf);
        if (videoInfo == null) return null;
        startedAt = buf.readLong();
        return this;
    }

}
