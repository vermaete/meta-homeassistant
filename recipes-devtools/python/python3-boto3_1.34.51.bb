DESCRIPTION = "AWS SDK for Python"
HOMEPAGE = "https://github.com/boto/boto3"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = "\
    git://github.com/boto/boto3.git;protocol=https;branch=master \
    file://run-ptest \
"
SRC_URI[sha256sum] = "0e966b8a475ecb06cc0846304454b8da2473d4c8198a45dfb2c5304871986883"
SRCREV = "97c442ad6c4e9037e1262cc2b6868b1878eb0d23"

inherit setuptools3 ptest

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "\
    python3-botocore (>=1.34.51) \
    python3-jmespath (>=0.7.1) \
    python3-s3transfer (>=0.10.0) \
"

RDEPENDS:${PN}-ptest = "\
    python3-pytest \
    python3-unittest-automake-output \
"

do_install_ptest() {
    install -d ${D}${PTEST_PATH}/tests
    cp -rf ${S}/tests/* ${D}${PTEST_PATH}/tests/
}
