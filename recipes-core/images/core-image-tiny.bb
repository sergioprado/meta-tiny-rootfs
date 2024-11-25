SUMMARY = "A tiny image to boot into a terminal"

LICENSE = "MIT"

IMAGE_INSTALL = " \
    busybox \
    base-files \
    base-passwd \
    netbase \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

IMAGE_FEATURES = "${EXTRA_IMAGE_FEATURES}"

IMAGE_LINGUAS = ""

inherit core-image
