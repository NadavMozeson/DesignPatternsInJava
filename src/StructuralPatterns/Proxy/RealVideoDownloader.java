package StructuralPatterns.Proxy;

public class RealVideoDownloader implements VideoDownloader {
    @Override
    public Video getVideo(String videoName) {
        System.out.println("Downloading video " + videoName);
        return new Video(videoName);
    }
}
