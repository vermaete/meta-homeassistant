SUMMARY = "Minimal pure python memcached client"
HOMEPAGE = "https://github.com/aio-libs/aiomcache/"
LICENSE = "BSD-2-Clause & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6fef79088f61f537b76a803b9ffcb726"

SRC_URI = "\
    git://github.com/aio-libs/aiomcache.git;protocol=https;branch=master \
    file://run-ptest \
"
SRC_URI[sha256sum] = "4792c7f6efc960cf27ea0f2272e7e619d1930d992a4380647242e5e87b0630e6"
SRCREV = "9e93cd5a8dcde40340a6b78a72318f339bd7258c"

inherit setuptools3

S = "${WORKDIR}/git"

PACKAGES += "\
    python-version-smaller-3-dot-11 \
"

# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "python-version-smaller-3-dot-11"
PACKAGECONFIG[python-version-smaller-3-dot-11] = ",,,python3-typing_extensions"

PYPI_PACKAGE = "aiomcache"
