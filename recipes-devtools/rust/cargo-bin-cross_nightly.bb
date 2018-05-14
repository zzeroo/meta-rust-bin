
# Recipe for cargo 20180514
# This corresponds to rust release nightly

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4673f1f548a93b99e0a5af7879c4c7d8",
        "arm-unknown-linux-gnueabi": "0a6ad1f4ffbf0e8515c552b6538d7878",
        "arm-unknown-linux-gnueabihf": "68e97988ba9af7e35db59140d996c6c2",
        "armv7-unknown-linux-gnueabihf": "c093e17b03bd63f3fdf5268743fdf5dc",
        "i686-unknown-linux-gnu": "313bf826fe41cefa5ae974d1043e4d87",
        "x86_64-unknown-linux-gnu": "6395e203ca193d2dfd38aaa66f45d7d3",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "acd931d6e1648cb4ae30d9f52523618cb9429cf3d21e437e98e456b771d299c4",
        "arm-unknown-linux-gnueabi": "fddc41a8f2f9e3407196c4de7d03cc5a69a80ea5f94d3cb587adab0e33f51877",
        "arm-unknown-linux-gnueabihf": "5fe46a8567f2c40d11b4770d35abaa9b4653e9407b0e8a6de037a11336383c47",
        "armv7-unknown-linux-gnueabihf": "8ac7b5030147a522144385a4bebc50f0941efd8cff11f59f97f7d5fb1828776c",
        "i686-unknown-linux-gnu": "1b9230044026b08b664ce365b4d5bdcf469a982d80d7a6d284d3016faa3c9a20",
        "x86_64-unknown-linux-gnu": "1ae0adcdab057aec7673f7244aa3e8e4614d074a21000513b787f5cedd0d0f7a",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-05-14/cargo-nightly-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-05-14/cargo-nightly-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-05-14/cargo-nightly-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-05-14/cargo-nightly-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-05-14/cargo-nightly-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-05-14/cargo-nightly-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= nightly)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
