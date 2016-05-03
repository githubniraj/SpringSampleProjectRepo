package com.cubic.jpaaspect;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.cubic.jpatransaction.JPAEntity;

@Component
@Aspect
public class JPATransactionMgmt {
	
	
	@Pointcut("execution(* com.cubic.jpatransaction.Hibernate*.executeInsert(..))")
	public void myMethod(){
		
	}
	
	
	
	
	
	

	@Around("myMethod()")
	public void callAround(ProceedingJoinPoint joinPoint) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			System.out.println("inside JPATransactionMgmt ");
			emf = Persistence.createEntityManagerFactory("OracleUnit");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();

			Object obj = joinPoint.getTarget();
			
			if(obj instanceof JPAEntity){
				System.out.println("setting entity manager");
				JPAEntity jpa = (JPAEntity)obj;
				jpa.setEntityManager(em);
			}
			else{
				System.out.println("class is not an instance of jpa entity");
			}
			
			joinPoint.proceed();

			et.commit();
		} catch (Throwable e) {
			System.out.println("expception in JPATransactionMgmt");
			e.printStackTrace();
			et.setRollbackOnly();
		} finally {
			if (em != null) {
				em.close();
			}

			if (emf != null) {
				emf.close();
			}
		}
	}

}
