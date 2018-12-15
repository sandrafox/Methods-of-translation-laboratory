use strict;
use warnings;

$_ = "";
$, = "\n";
#open(FIL, "input.txt");
while (my $line = <>) {
    $_ = $_.$line;
}


my @lines = /<\s*\ba\b.*?href\s*=\s*["|']\s*(.*?)\s*["|']/gis;
#s/^.*\/\///gm;
#s/(\/|:).*$//gm;
my %links;
for my $line (@lines) {
    #$line =~ s/\s+//;
    $line =~ s/^(.*?\/\/)?(.*?@)?(\w+:\w+@)?([\w\.\-\_]+)(:\d+)?([\/|\?|#].*)?$//;
	if ($4 and ($1 or $5)) {
	    $links{$4} = 0;
	}
}
#@lines = sort keys %links;
print sort keys %links;
#my $prevline = "";
#my $first = 1;
#print @lines;
#print "Links: \n";
#for my $line (@lines) {
	#print $4;
 #   if (($line ne $prevline) and $line) {
	#    $prevline = $line;
	#	if (!$first) {
	#		print "\n";
	#	} else {
	#	    $first = 0;
	#	}
	#	print $line;
	#}
#} 