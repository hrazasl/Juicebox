# Kepler package advisory validation

Metadata-only scanner fixture. These package coordinates intentionally match published malicious-package advisories, plus lodash as a clean control.

Do not install this fixture. No package payloads, executable code, scripts, or registry download URLs are included. This directory has no package.json and is not part of the application build.

Expected: 3 malicious-package findings, no malicious-package finding for lodash. This PR is for validation only and should not be merged.

Validation rerun: verify branch-scoped finding identities and base-versus-head dependency comparison.

Recovery validation: verify failed-ingestion cleanup. Lodash is a malware-negative control, not a vulnerability-free package.

Final validation: compare malware advisories against the base commit and update one PR summary without invented line annotations.
