
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c9ad5b9bd7e6c82f05f3e96a8847704f",
        "arm-unknown-linux-gnueabi": "7a3a0f1f695acb12d6882e635b5517fd",
        "arm-unknown-linux-gnueabihf": "20ead829f9cee3279a721d14402c9435",
        "armv7-unknown-linux-gnueabihf": "708324d4171ba9d245f59172bb638b5a",
        "i686-unknown-linux-gnu": "7e5a67f59bbb908e7ff9972d84032461",
        "mips-unknown-linux-gnu": "63e2405601abf74fcd388de7c82d2a33",
        "mipsel-unknown-linux-gnu": "f07bbc28a00ace035abba005f3f7edf2",
        "powerpc-unknown-linux-gnu": "23c0a96aed2d1bccd319c0eb3a30fe04",
        "x86_64-unknown-linux-gnu": "4112e72d4728de2358747fa9445c3c31",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0fbbbacf9c21d1417313aa65097960e19844e358699eef1e90867ab540f30474",
        "arm-unknown-linux-gnueabi": "1f245b92d3b2cc9f0c0b07c34877442ed91c8f51c4e368d14e503e2a2d613857",
        "arm-unknown-linux-gnueabihf": "a9c358eb2eac80979e99749215a3a0f59695957f24ed2cf13db62f352786b131",
        "armv7-unknown-linux-gnueabihf": "710d2ca6ba49fc2cc9f20ca62b92c7ff101258820d35e5544abdb7fc0dabb367",
        "i686-unknown-linux-gnu": "f8e2dd54b57108159780edea13f05c5902996aaa68efb8e228caabac8612bc85",
        "mips-unknown-linux-gnu": "1ced84f8a1f869e3cf1982b2aed68e067b8bc2e36cf1d1a7554bf0a38389565a",
        "mipsel-unknown-linux-gnu": "aa58f68bd8811dd9de1f93c1cf2fa7ef772d4260ae8aa47d934281c76afb102e",
        "powerpc-unknown-linux-gnu": "bab3f5f6fb544ffd70624c0e9e4eed7de0b007a70eb181e3bf37f1edcf830a2e",
        "x86_64-unknown-linux-gnu": "73fa1065dea5d242f19e9e119e2ede12014c039c71eb37dea6768069db5ca344",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "420a96f816b761bb2b969c0ad8122545",
        "arm-unknown-linux-gnueabi": "40f7e309aabc42ef09b29d18d8adc41f",
        "arm-unknown-linux-gnueabihf": "fe18aeb46db1fe11687e55fe642c7a6e",
        "armv7-unknown-linux-gnueabihf": "11a6741b979d7d503749c31e0d7c4104",
        "i686-unknown-linux-gnu": "5bcc3679cd7af8530ed405fd786f1e71",
        "x86_64-unknown-linux-gnu": "60d1feedc08e12523a5fe515ab25b226",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "db3970ae6c4ad9f5f741ab160ce68c35d56de3e2fad97043e21840f9f6d0d81a",
        "arm-unknown-linux-gnueabi": "fb8507c424bb2eaab3642704f39ed0726de41024de015870060391d0f3c900b1",
        "arm-unknown-linux-gnueabihf": "45be50d07b8a5f785350fc2a1543d3bd1397171c79d9ae2f6493525e8ea2bfa7",
        "armv7-unknown-linux-gnueabihf": "07f33ce8a850958418ff151a4d7001c724fc4fc8fdcc351b143417dc7f4b5d89",
        "i686-unknown-linux-gnu": "2e7c021f92b3cae7b417359231f372362a32998245e00f6307850b5194e045b7",
        "x86_64-unknown-linux-gnu": "2b3fed6f1b4b5546bf711a1a327a79d97cd51eb7e81310d49db3c2d8eb8a99b4",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c709a09d1b062d9a908e3631c1e1cdf5"

require rust-bin-cross.inc
