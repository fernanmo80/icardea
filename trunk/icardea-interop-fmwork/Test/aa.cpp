#define CORES 4

void worker(int id)
{    
    // blablabla work here
    printf("worker %d\n",id);
    printf("[%d] I'm child of %d\n",getpid(),getppid());    
}

int main (int argc, const char * argv[])
{
    int pid;

    for (int i=0; i<CORES; i++)
    {
        pid = fork();
        if (pid == 0) // if child
        {
            worker(i);
            exit(0);
        }
        else if (pid>0)
        {
            printf("[%d] Big father here!\n",getpid());
        }
        else
        {
            printf("--- Fork problem ---");
        }
    }

    return 0;

}