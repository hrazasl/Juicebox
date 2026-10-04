package kepler.scanfixtures;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Inert scanner canary. Outside the application source tree and build.
 * Hashes a constant only; no input, authentication, file access, or network use.
 * The PEM-shaped text is deliberately invalid and is not a credential.
 */
final class KeplerDiffCanary {
    static final String INVALID_KEY_CANARY =
        "-----BEGIN RSA PRIVATE KEY-----\n"
        + "aW52YWxpZC1rZXBsZXItc2Nhbm5lci1maXh0dXJlLW5vdC1hLWtleQ==\n"
        + "-----END RSA PRIVATE KEY-----";

    static byte[] legacyChecksumCanary() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("MD5")
            .digest("kepler-diff-canary-webhook".getBytes(StandardCharsets.UTF_8));
    }
}
