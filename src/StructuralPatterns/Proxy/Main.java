package StructuralPatterns.Proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("Cat Playing Piano"); // video downloaded
        videoDownloader.getVideo("Me at the Zoo"); // video downloaded
        videoDownloader.getVideo("Cat Playing Piano"); // loaded from cache
        videoDownloader.getVideo("Despacito"); // video downloaded
        videoDownloader.getVideo("Me at the Zoo"); // loaded from cache
    }
}
