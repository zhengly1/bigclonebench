public class BigbenchClone{    
            public final int call() {
                final short rm = Fetchb();
                if (rm >= 0xc0) {
                    Reg r = Modrm.GetEArd[rm];
                    r.dword = SUBD(Modrm.Getrd[rm].dword, r.dword);
                } else {
                    int eaa = getEaa(rm);
                    Memory.mem_writed(eaa, SUBD(Modrm.Getrd[rm].dword, Memory.mem_readd(eaa)));
                }
                return HANDLED;
            }
}