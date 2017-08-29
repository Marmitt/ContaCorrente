package br.com.institutoivoti.test;

import org.junit.Before;
import org.junit.Test;

import br.com.institutoivoti.Conta;
import junit.framework.TestCase;

public class ContaTesteTest extends TestCase {
	
	private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta();
	}
	
	@Test
	public void testaNome() {
		conta.Titular('flex');
		assertEquals(conta.getTitular(), 'flex');
	}

}
