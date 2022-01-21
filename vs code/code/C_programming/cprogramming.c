#include<stdio.h>
#include<string.h>
struct s
{
 char ch ;
 int i ;
 float a ;
} ;
main( )
{
 struct s var = { 'C', 100, 12.55 } ;
 f ( var ) ;
 g ( &var ) ;
}
f ( struct s v )
{
 printf ( "\n%c %d %f", v.ch, v.i, v.a ) ;
} 
f ( struct s *v )
{
 printf ( "\n%c %d %f", *v ) ;
} 
