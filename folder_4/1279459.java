public class BigbenchClone{    
    public void run(Emulator em) throws EmulatorException {
        em.writeRegister(this.rB, em.readByteMemory(em.readRegister(this.rA) + this.imm));
    }
}