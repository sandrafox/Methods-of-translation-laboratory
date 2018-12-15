while (<>) {
    print if /(\b|\W)(\d)+(\b|\W)/;
}