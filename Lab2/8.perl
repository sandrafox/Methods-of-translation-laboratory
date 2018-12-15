while (<>) {
   s/(\d+)0(\b)/$1$2/g;
   print;
}