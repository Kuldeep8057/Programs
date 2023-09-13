#include<stdio.h> 
#include<stdlib.h> 
int main( )  
{  
FILE *fp ,*fp1; 
char ch ;  
fp = fopen("write_file.c","r") ; 
fp1=fopen("test.txt","w");
if(fp==NULL){
    printf("File not found!");
    exit(1);
} 
while ( 1 )  
{  
ch = fgetc ( fp ) ;  
if ( ch == EOF )  
break ;  
fprintf(fp1,"%c",ch) ;  
}  
fclose (fp ) ;  

}