use strict;
use warnings;

$_ = "";
open(FIL, "input.txt");
while (my $line = <FIL>) {
    $_ = $_.$line;
}
s/\h{2,}/ /g;
s/^\h+//mg;
s/\h+$//mg;
s/(\n\s*\n)+/\n \n/g;
s/^(\s*\n)+//;
s/(\n\s*)+$//;
print;