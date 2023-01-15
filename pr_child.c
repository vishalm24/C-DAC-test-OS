#include<stdio.h>
#include<sys/wait.h>
#include<stdlib.h>
#include<unistd.h>
void main(){
pid_t id;
id=fork();
if(id>0)
{
printf("Execution of parent has been started \n");
printf("Waiting for child \n");
wait(NULL);
printf("Exiting parent \n");
}
else{
printf("Executing Child \n");
int arr[]={54,64,84,102,42};
int i;
for(i=0;i<5;i++){
sleep(5);
printf("%d \n",arr[i]);
}
printf("Child finished \n");
exit(0);
}
}
