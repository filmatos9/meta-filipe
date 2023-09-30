SUMMARY = "My custom image as a linux box for development"

# from core-image-minimal
IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

# from core-image-full-cmdline
IMAGE_FEATURES += "splash ssh-server-openssh"
IMAGE_INSTALL += "packagegroup-core-full-cmdline"

# add python3
IMAGE_INSTALL += "packagegroup-meta-python3"

# add selinux packages
IMAGE_INSTALL += "packagegroup-core-selinux"

inherit selinux-image
