
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4091bf89af52c6781f04b1e8f46a261c",
        "arm-unknown-linux-gnueabi": "9070e6ffaf838e0e632cbb82a0612b84",
        "arm-unknown-linux-gnueabihf": "147398adadb9eef9ef6296bbdff3c2aa",
        "armv7-unknown-linux-gnueabihf": "241b33fc8b14f3c94b2c2a3a24454783",
        "i686-unknown-linux-gnu": "a17f5ff701ecd4173e75090a237ec8ba",
        "mips-unknown-linux-gnu": "e770ca4af4b8538f7f2387e26f0662f8",
        "mipsel-unknown-linux-gnu": "517ffb79e0b02f86e0c8e67d40532feb",
        "powerpc-unknown-linux-gnu": "b954f6eeb8d8dc542200675de1510443",
        "x86_64-unknown-linux-gnu": "ab9e3fcb5720906f3e0a0fbc76b0c360",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "62a7e7de74a6a6c7e9d12b8c56b04a240b35ed28ee034d12fed3ddc3f964a588",
        "arm-unknown-linux-gnueabi": "691f91a466d9aa140756b5d16e6ac475f42f55ef45342ef98d7ee6d019b5bfcb",
        "arm-unknown-linux-gnueabihf": "f0d2fcfd424e11d777b663719a9367996080afd7db45c0969acb804592259807",
        "armv7-unknown-linux-gnueabihf": "85cdd22c5d7ac02de0fa27bff2b3f31dd3d6863f496c026d107cbe7f82ed4a21",
        "i686-unknown-linux-gnu": "30e7c20528c93862c43f1f40a4958d9250830132aba6456c052ef91f703e04d6",
        "mips-unknown-linux-gnu": "add45f2caeae34af51b1e5633cb361968d1f1157288cb4977807c82a4e2c40e8",
        "mipsel-unknown-linux-gnu": "4bc8e58a0840410a9905c2359a3a5c4f40ba10767d520c805429757360f5c886",
        "powerpc-unknown-linux-gnu": "37bd5258b4e4b7e5e24b22ec9dc7e8714e3bf94f43c8a0367456fb51ee42f5e1",
        "x86_64-unknown-linux-gnu": "d5096fc81448687d1b842534e3f75933930fdd13335a3f1c4ceefd3b4603f169",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b71231bbcbc5f54e9fc8e67934d65ae0",
        "arm-unknown-linux-gnueabi": "b6678a384b7b6b4a75af29516b3b8d75",
        "arm-unknown-linux-gnueabihf": "db03c164e3e4d2f3ac7172657e7ea912",
        "armv7-unknown-linux-gnueabihf": "3b35a119cf9bde6b07ed8af8b728a974",
        "i686-unknown-linux-gnu": "03e4633690bfabf12b92d8236ead64e8",
        "x86_64-unknown-linux-gnu": "ba178885737d19d55b83f69025b6a842",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3aaad1d0422525fc3de2e16fcb8bf6193645edb47b5d072f5329c6f0080c0de0",
        "arm-unknown-linux-gnueabi": "1d7258e7483f53d9ce4c1b8d21ec86633e61bd8fa2dc82759a83e9fd88bb8bf6",
        "arm-unknown-linux-gnueabihf": "efbf1f47f3e3f2350cc61b73ecdb7451216bb80a9bc8d7d54abf8dacc67217b3",
        "armv7-unknown-linux-gnueabihf": "99442041cbe903f9a0ec644cd444cf5e8a9781391468985c5915f0ca76347efd",
        "i686-unknown-linux-gnu": "fef6a70644ee42724f1face1a20b00a9d7790da084b0c6819aa5ee6aeb2ec5ad",
        "x86_64-unknown-linux-gnu": "1ab0b6523039b632f36f499cc63aea4bea46071e96a1c39ef87aa433fd224e7b",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=99c369ad81a36cd5b27f6c6968d01055"

require rust-bin-cross.inc
