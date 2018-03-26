
# Recipe for cargo 20180326
# This corresponds to rust release nightly

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f923a8ba13832a240ac81f64f0a79f4b",
        "arm-unknown-linux-gnueabi": "5f7791c98f2d30360bc0bb3623946ab9",
        "arm-unknown-linux-gnueabihf": "8d7c668888b2500e28e2678a11d0ebe4",
        "armv7-unknown-linux-gnueabihf": "2929f14cb88e9a8d694003a1a2951763",
        "i686-unknown-linux-gnu": "f27633becad0ac0f3602c8d8a8b37d77",
        "x86_64-unknown-linux-gnu": "a7795c9b3878623dbb3aaa4d724e0f4b",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e07b141214caa5ffbbc746e273a2b0ce347f6c5116c67a6bd91635ec23976bdf",
        "arm-unknown-linux-gnueabi": "3cb1ae9df68177a5e4a0803a3cbea1bd51be60e2988538ba705a524e058524a4",
        "arm-unknown-linux-gnueabihf": "e590c8074abf69a449cffc732d4f1fbbac8e0818c905408f4a21ecaac35a5fd3",
        "armv7-unknown-linux-gnueabihf": "7d72a0a88eab4f443a40877cfc545c1ba8838a3bcd0f7a8a893d1b93756efc21",
        "i686-unknown-linux-gnu": "ab86c7bf19961ea09b2a7324634683efd5c8e7180be385eace287c2ad1e2306b",
        "x86_64-unknown-linux-gnu": "8c98933e9473926809562ed15165d0996bff5c68b4ff05efae1e48804e4404ac",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-03-26/cargo-nightly-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-03-26/cargo-nightly-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-03-26/cargo-nightly-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-03-26/cargo-nightly-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-03-26/cargo-nightly-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-03-26/cargo-nightly-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= nightly)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
