
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d77637dfe0c20ca62d52b53fe43f52bf",
        "arm-unknown-linux-gnueabi": "d03efb72f4e125fefba334091299b541",
        "arm-unknown-linux-gnueabihf": "1b03e2f68c3c67bd844e7b38a5514f9e",
        "armv7-unknown-linux-gnueabihf": "1dc99ba11657e74d156b240b2a72e0ec",
        "i686-unknown-linux-gnu": "8b92fc89dd34a4f07a77f4f6c0e3045c",
        "mips-unknown-linux-gnu": "1672143cf55fe01a4ce26df736b4f0f6",
        "mipsel-unknown-linux-gnu": "778cee3eca5f265e332e4f4997655e96",
        "powerpc-unknown-linux-gnu": "170a7ffb8ab13a87f364b717aa7fa172",
        "x86_64-unknown-linux-gnu": "176cfc546dd532d5cf8a729ff25b2e7d",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "617785519020118bf9101d58b4b02935db248e4ea368887e3ab90e61143e2934",
        "arm-unknown-linux-gnueabi": "fea75e5d31f8d17a4b2fba65843c9c6ccbc3dda50d888522cbfde81ecebfff66",
        "arm-unknown-linux-gnueabihf": "667455a83e0cece1f47ac50b997840e2b0d5d1be532d9c8d6948ca1acb3ac565",
        "armv7-unknown-linux-gnueabihf": "92c2bf586583d06f884083d62c72540dcf5812ebf325ef86d68421e98a7750f5",
        "i686-unknown-linux-gnu": "4cbeadc11fceb00581700a549caf529376ffa8212ae38651f0e05e7c7d1122e4",
        "mips-unknown-linux-gnu": "7c8de62c23242b367a24b540dbbb822a9c85328411361a5f8e3ff9acfc581490",
        "mipsel-unknown-linux-gnu": "a31ee1d8e5b442e0203966109d3881a3b4a06b30f84172bc42db50d41486ce7a",
        "powerpc-unknown-linux-gnu": "8f841537b03bdd54b6014a3519f2f433bf650da6077fa50b0dc5ca05470f5ecd",
        "x86_64-unknown-linux-gnu": "e5124244bafea1a4d9087ac138623093086334bf88be0dd4998fce6510d44c8c",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "555971e723aaa74f25798562978671f6",
        "arm-unknown-linux-gnueabi": "e2c07a3cb8bff2013328efae49af0ad1",
        "arm-unknown-linux-gnueabihf": "2553c07327f34247d53915a62bb56da6",
        "armv7-unknown-linux-gnueabihf": "7a72dadf9ea026e681b408a238bb8f75",
        "i686-unknown-linux-gnu": "82ec2595e9762eb593b3f2ef8f4cbc91",
        "x86_64-unknown-linux-gnu": "a44df8ce33828fb1d3a6df1b5738d311",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ec389a914fd88827ad6db3373b95faa9b7918bcc780c8c029cab58f139e6626c",
        "arm-unknown-linux-gnueabi": "2523a1aac3d3a838b2898155aa791a5dab46af7a424d573f43c99923518dfc12",
        "arm-unknown-linux-gnueabihf": "f9cf453fd20d5514e4cf5f9fab3747cc5b2c72a5b5040991c92bc94dd5c367ef",
        "armv7-unknown-linux-gnueabihf": "8ee2b654b2c46d4a7c2e85afe4c8f86041894b5ceb57b4d1119a2f5956b72d8b",
        "i686-unknown-linux-gnu": "8a35bd5b5e2fe5cda9fec7357b99117e9b7f1bf39ae91ddc4ee8599ea423d9a3",
        "x86_64-unknown-linux-gnu": "4c205b866bcbfcd2ba3854e4285afd3faf56832786d5fc00ec7378e572e29720",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=99c369ad81a36cd5b27f6c6968d01055"

require rust-bin-cross.inc
