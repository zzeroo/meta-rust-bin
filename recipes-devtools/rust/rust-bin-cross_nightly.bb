
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "fc29ddc2178286ddd733cfd7d3811b97",
        "arm-unknown-linux-gnueabi": "769d2be4790402e72f86537ddbe4337a",
        "arm-unknown-linux-gnueabihf": "48f2ed61980cca3a587fd6ef2c658ec8",
        "armv7-unknown-linux-gnueabihf": "f58ed3a07e257063333f8a045d3b4c22",
        "i686-unknown-linux-gnu": "15f8d3d588f5c0e938c13a45429a2e9d",
        "mips-unknown-linux-gnu": "9aa6ce6d3f342f97aec920c1e058d347",
        "mipsel-unknown-linux-gnu": "467f13f6d4887e83348fc32f5dc0e0e2",
        "powerpc-unknown-linux-gnu": "efc9b129f006473121753f1d0018ed6b",
        "x86_64-unknown-linux-gnu": "5d07b561f999c96899580e0ccf37496a",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e3241b9b1b4c8dcf20e298b6149f93a3669cfcae48b442f018f6412bb5a50efc",
        "arm-unknown-linux-gnueabi": "ef18fcb5e71a8ba320c1cbb012457fc662a23bc7da3873e6ef3cb679c07e9144",
        "arm-unknown-linux-gnueabihf": "7ed273153f606b5d2a10aa7fec098d09432ea31122ab059b9c93c6fb53978e34",
        "armv7-unknown-linux-gnueabihf": "179a7b5a2bb9d61548ae02c35cbee9835a58a236759d8d22eae88447a4983ce0",
        "i686-unknown-linux-gnu": "de43196df3a98c374d7ac792c37253b23aadb367b10988b42c66d61c7f2e5ce6",
        "mips-unknown-linux-gnu": "a698eaa0aa1659e531c7a0b4b6023147a71d94bcf75f50f43c8a941b059cb49f",
        "mipsel-unknown-linux-gnu": "b93461cf6a86d88e9422f9640ce5a1dd73be90b09e4fd7073dd62622454dc408",
        "powerpc-unknown-linux-gnu": "ce8ce32ba8074ca9bd25ee55d018d0ccf696147eec7975b1be587a512a559356",
        "x86_64-unknown-linux-gnu": "e57fe528878c3b26777c4885dbac1492eb5bf5d21e6be82757c5b1a54809e677",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c33a46654385263086b39704900bc734",
        "arm-unknown-linux-gnueabi": "f614d5472def06bb1a3349be14c69915",
        "arm-unknown-linux-gnueabihf": "4a844268287c4774500a299921cce782",
        "armv7-unknown-linux-gnueabihf": "49da84b4a97713889b50bd8582c8ca9e",
        "i686-unknown-linux-gnu": "fceaae97abed0598d882f36f50bc428a",
        "x86_64-unknown-linux-gnu": "41388c5221aff692717c4a45940f7b8a",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7c87871c69ebe952274f8cb650cdaac3b2801cca554291fa69caabea629ba66f",
        "arm-unknown-linux-gnueabi": "9af281af685f301ce3fd375d81ecc7c0f0e8127b3513cbf310ec8f447045c7bd",
        "arm-unknown-linux-gnueabihf": "f5a2246d88293732887682977ad2a6f640cbac39658a2a04d6949e9cf97e7bc0",
        "armv7-unknown-linux-gnueabihf": "f2d40261996e930cf0d37c9ba4c2355090ab6f3b66e662fc4070d77f9bd0a317",
        "i686-unknown-linux-gnu": "371aa62ad053e21c459827fa81c84b82d0b438f45bdd8dd9141fcacec3d81cd6",
        "x86_64-unknown-linux-gnu": "4dfd2e8ec1b799350f7d3565c9ee91e781c4fa7d6112f41da6a289879a1a5554",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=99c369ad81a36cd5b27f6c6968d01055"

require rust-bin-cross.inc
