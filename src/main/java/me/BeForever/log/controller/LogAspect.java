package me.BeForever.log.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

//    private LogService logService;
    private int count = 0;

//    @Resource
//    public void setLogService(LogService logService) {
//        this.logService = logService;
//    }

    //TODO 具体情况具体分析

//    @AfterReturning("execution(* me.BeForever.*.service.*.add* (..))")
//    public void logAdd(JoinPoint joinPoint) throws Throwable {
//        String methodName = joinPoint.getSignature().getName();
//        Object[] content = joinPoint.getArgs();
//        Log log = new Log();
//        logService.addLog(log);
//        System.out.println(methodName + ":" + Arrays.toString(content));
//    }

//    @AfterReturning("execution(* me.BeForever.*.service.*.update* (..))")
//    public void logUpdate(JoinPoint joinPoint) throws Throwable {
//        String methodName = joinPoint.getSignature().getName();
//        Object[] content = joinPoint.getArgs();
//        Log log = new Log();
//        logService.addLog(log);
//        System.out.println(methodName + ":" + Arrays.toString(content));
//    }

//    @AfterReturning("execution(* me.BeForever.*.service.*.delete* (..))")
//    public void logDelete(JoinPoint joinPoint) throws Throwable {
//        String methodName = joinPoint.getSignature().getName();
//        Object[] content = joinPoint.getArgs();
//        Log log = new Log();
//        logService.addLog(log);
//        System.out.println(methodName + ":" + Arrays.toString(content));
//    }

    @AfterReturning("execution(* me.BeForever.*.service.*.* (..))")
    public void logTeacherAction(JoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] content = joinPoint.getArgs();
        count++;
        System.out.println();
        System.out.println("第" + count + "次：");
        System.out.println("**************************************************************************");
        System.out.println("method : " + methodName);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("arg : ");
        for (Object aContent : content) {
            System.out.println(aContent);
        }
        System.out.println("**************************************************************************");
        System.out.println();
    }
}