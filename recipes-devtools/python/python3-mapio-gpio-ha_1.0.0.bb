SUMMARY = "MAPIO GPIO HA python module"
DESCRIPTION = "\
    This Python wheel contains the applicative code to manage some \
    MAPIO GPIOs from Home Assistant."

HOMEPAGE = "https://github.com/pcurt/mapio_gpio_ha"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_SRC_URI = "git://github.com/pcurt/mapio_gpio_ha;protocol=https;branch=main"
SRC_URI = ""
SRCREV = "42b91433bbc8e87958ada90e4a3abb36e0fd710e"

inherit setuptools3 pypi

# nooelint: oelint.var.order.S
S = "${WORKDIR}/git"

RDEPENDS:${PN} = "\
    python3-homeassistant-mqtt-binding \
    userland \
"

