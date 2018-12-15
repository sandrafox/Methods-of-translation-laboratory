use strict;
use warnings;

$_ = "";
#open(FIL, "input.txt");
while (my $line = <>) {
    $_ = $_.$line;
}
s/^\s*(\S)/$1/;
s/(\S)\s*$/$1/;

s/^\h*//gm;
s/\h*$//gm;
s/(\S)\n(\s)*\n(\S)/$1\n\n$3/g;
s/(\h)\h\h*/$1/g;
print;

