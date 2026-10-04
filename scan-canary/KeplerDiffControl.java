package kepler.scanfixtures;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/** Negative control: an ordinary checksum of a constant, outside the build. */
final class KeplerDiffControl {
    static byte[] checksum() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256")
            .digest("kepler-diff-control".getBytes(StandardCharsets.UTF_8));
    }
}
