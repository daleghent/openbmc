OBMC_MACHINE_FEATURES += "\
        obmc-phosphor-fan-mgmt \
        obmc-phosphor-chassis-mgmt \
        obmc-phosphor-flash-mgmt \
        obmc-host-ipmi \
        obmc-chassis-state-mgmt \
        obmc-bmc-state-mgmt \
        "

PREFERRED_PROVIDER_virtual/obmc-chassis-mgmt = "packagegroup-x86-apps"
PREFERRED_PROVIDER_virtual/obmc-fan-mgmt = "packagegroup-x86-apps"
PREFERRED_PROVIDER_virtual/obmc-flash-mgmt = "packagegroup-x86-apps"
PREFERRED_PROVIDER_virtual/obmc-system-mgmt = "packagegroup-x86-apps"
