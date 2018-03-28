
# Recipe for cargo 20180327
# This corresponds to rust release nightly

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "bebfca02a011180a5cd0688248551c30",
        "arm-unknown-linux-gnueabi": "0a27dcf4092dba60a4e391ed305daa7e",
        "arm-unknown-linux-gnueabihf": "54fda72e072203d9648dd5831f6f715b",
        "armv7-unknown-linux-gnueabihf": "12ab48a8d499d3883e3854e0cb8de6bf",
        "i686-unknown-linux-gnu": "7046b86f9cb8febb25154d84c6024b43",
        "x86_64-unknown-linux-gnu": "e7b136dd76572815c1aaf5c928cad5a5",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0b6c2ed64798d0a9cd7f77b132263d813ca3990b85d4ac990bf07cbeaac36b84",
        "arm-unknown-linux-gnueabi": "e6d9360da2e2c516db1e2188fb07beacca5c57ab34f78e4dd266677fc34807bf",
        "arm-unknown-linux-gnueabihf": "9979083e1185e425f206dea42aef21b7b95f88174a9b27c2a43d4df0722581bd",
        "armv7-unknown-linux-gnueabihf": "84f7bb78f57c9691554f4d1270463d26cd84359604d85a9160478061f262c863",
        "i686-unknown-linux-gnu": "b146da0c8f79822d964047c7626386c9d7948fc25ea5d7b78155d6dc8efd3548",
        "x86_64-unknown-linux-gnu": "97fad8cacf406e961d9708f402f02be3ffd833292aef7f283b25fcae0ff5a863",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-03-27/cargo-nightly-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-03-27/cargo-nightly-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-03-27/cargo-nightly-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-03-27/cargo-nightly-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-03-27/cargo-nightly-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-03-27/cargo-nightly-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= nightly)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
