SUMMARY = "MAPIO diplay python module management"
DESCRIPTION = "\
    This Python wheel contains the applicative code to drive the \
    MAPIO epaper display. The epaper is a waveshare 2in13 V3 \
    (https://www.waveshare.com/product/displays/e-paper/epaper-3/2.13inch-e-paper.htm)"

HOMEPAGE = "https://github.com/pcurt/mapio_display"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_SRC_URI = "git://github.com/pcurt/mapio_display;protocol=https;branch=main"
SRC_URI = ""
SRCREV = "fe4aa7cee54bde858190cc3931926acc7563954d"

inherit setuptools3 pypi

# nooelint: oelint.var.order.S
S = "${WORKDIR}/git"

RDEPENDS:${PN} = "\
    liberation-fonts \
    python3-click \
    python3-gpiod \
    python3-netifaces \
    python3-pillow \
    python3-psutil \
    python3-qrcode \
    python3-spidev \
"

