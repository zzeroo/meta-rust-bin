
# Recipe for cargo 20180517
# This corresponds to rust release nightly

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "84ec7024cf51fee0774234e2f67c344a",
        "arm-unknown-linux-gnueabi": "fd7b281be6a4627fe50e40a88f4df3d5",
        "arm-unknown-linux-gnueabihf": "1b1d40244a2e7df3bd004e5e8a3ec785",
        "armv7-unknown-linux-gnueabihf": "ab58a625fe2407a25cfa047550f6df83",
        "i686-unknown-linux-gnu": "3a43fc34653b35379456c8dbe85834c0",
        "x86_64-unknown-linux-gnu": "fecea8a07bab61926de3624b95e08b26",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e1f81dd38c4cf004af2855f675cf3f5c6b002d5644d800df0238430f11705f83",
        "arm-unknown-linux-gnueabi": "c56eee57b7f0be7d0e10f8750e6a58f299bd87de6e737a0b022bd3a512c9d2ae",
        "arm-unknown-linux-gnueabihf": "dde9f507e4f47194bae3f0ab1242c88c83d9cef94c64100cf8d3dfbb31f08618",
        "armv7-unknown-linux-gnueabihf": "3b60b7cb958463004f7d494d274d358f8d4b429ec29a13f451376c9c2a97cef2",
        "i686-unknown-linux-gnu": "3f3cd80c863111ed01edddf6aa7b616e006ad86be66e751e2e42b65e1115e9fc",
        "x86_64-unknown-linux-gnu": "7794a4dd187f436b801646d3bffa1c89ab4935e2e489d20668ca2cc1d81a87df",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-05-17/cargo-nightly-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-05-17/cargo-nightly-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-05-17/cargo-nightly-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-05-17/cargo-nightly-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-05-17/cargo-nightly-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-05-17/cargo-nightly-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= nightly)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
