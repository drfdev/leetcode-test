package dev.drf.leetcode.encode.and.decode.tinyurl;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * https://leetcode.com/problems/encode-and-decode-tinyurl/
 */
public class EncodeAndDecodeTinyurlProblem implements Problem {
    public static class Codec {
        private static final String CODE_MAP = "1234567890qwertyuiopasdfghjklzxcvbnm";
        private final Map<String, String> shortUrlCache = new HashMap<>();
        private final Map<String, String> longUrlCache = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            if (longUrlCache.containsKey(longUrl)) {
                return longUrlCache.get(longUrl);
            } else {
                String newShortUrl = generate();
                shortUrlCache.put(newShortUrl, longUrl);
                longUrlCache.put(longUrl, newShortUrl);
                return newShortUrl;
            }
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return shortUrlCache.get(shortUrl);
        }

        private String generate() {
            StringBuilder sb = new StringBuilder("http://tinyurl.com/");
            Random random = ThreadLocalRandom.current();
            for (int i = 0; i < 6; i++) {
                int index = Math.abs(random.nextInt() % 36);
                sb.append(CODE_MAP.charAt(index));
            }
            return sb.toString();
        }
    }
}
