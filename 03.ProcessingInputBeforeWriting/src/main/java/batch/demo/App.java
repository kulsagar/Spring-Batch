package batch.demo;



import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Throwable{
    	
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beanConfig.xml");
        
/*        JobRegistry jobRegistry = ctx.getBean("jobRegistry", JobRegistry.class);
        JobLauncher jobLauncher = ctx.getBean("jobLauncher", JobLauncher.class);
        JobRepository jobRepository = ctx.getBean("jobRepository", JobRepository.class);
        
        System.out.println("JobRegistry: "+jobRegistry );
        System.out.println("JobLauncher: "+jobLauncher);
        System.out.println("jobRepository: "+jobRepository);
*/        
        JobLauncher jobLauncher =  ctx.getBean("jobLauncher",JobLauncher.class);
        Job job = ctx.getBean("insertIntoDbFromCsvJob",Job.class);
        JobExecution jobExecution  = jobLauncher.run(job, new JobParameters());
        System.out.println("Exit Status :: "+jobExecution.getStatus());
    }
}
