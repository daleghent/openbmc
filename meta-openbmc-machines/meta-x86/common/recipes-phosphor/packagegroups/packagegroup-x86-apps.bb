SUMMARY = "OpenBMC for x86 - Applications"
PR = "r1"

inherit packagegroup
inherit obmc-phosphor-license

PROVIDES = "${PACKAGES}"
PACKAGES = " \
        ${PN}-chassis \
        ${PN}-fans \
        ${PN}-flash \
        ${PN}-system \
        "

PROVIDES += "virtual/obmc-chassis-mgmt"
PROVIDES += "virtual/obmc-fan-mgmt"
PROVIDES += "virtual/obmc-flash-mgmt"
PROVIDES += "virtual/obmc-system-mgmt"

RPROVIDES_${PN}-chassis += "virtual-obmc-chassis-mgmt"
RPROVIDES_${PN}-fans += "virtual-obmc-fan-mgmt"
RPROVIDES_${PN}-flash += "virtual-obmc-flash-mgmt"
RPROVIDES_${PN}-system += "virtual-obmc-system-mgmt"

SUMMARY_${PN}-chassis = "x86 Chassis"
RDEPENDS_${PN}-chassis = " \
        obmc-control-chassis \
        obmc-host-failure-reboots \
        "

SUMMARY_${PN}-fans = "x86 Fans"
RDEPENDS_${PN}-fans = " \
        obmc-control-fan \
        "

SUMMARY_${PN}-flash = "x86 Flash"
RDEPENDS_${PN}-flash = " \
        obmc-flash-bmc obmc-mgr-download obmc-control-bmc \
        "

SUMMARY_${PN}-system = "x86 System"
RDEPENDS_${PN}-system = " \
        obmc-mgr-system \
        "

