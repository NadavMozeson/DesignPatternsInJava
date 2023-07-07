package StructuralPatterns.Proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader{
    private final Map<String, Video> videoCache = new HashMap<>();
    private final VideoDownloader realSubject = new RealVideoDownloader();

    @Override
    public Video getVideo(String videoName) {
        if (!videoCache.containsKey(videoName)){
            videoCache.put(videoName, realSubject.getVideo(videoName));
        }
        return videoCache.get(videoName);
    }
}
