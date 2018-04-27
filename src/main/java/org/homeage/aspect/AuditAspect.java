package org.homeage.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAspect {
	@Pointcut("@annotation(Audit)")
	public void audit() {
	}
}