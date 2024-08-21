public class BigbenchClone{    
    public void sign(PrivateKey key, String algorithm, String provider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        try {
            if (readOnly) throw new CRLException("cannot over-write existing CRL");
            Signature sigEngine = null;
            if ((provider == null) || (provider.length() == 0)) sigEngine = Signature.getInstance(algorithm); else sigEngine = Signature.getInstance(algorithm, provider);
            sigEngine.initSign(key);
            sigAlgId = AlgorithmId.get(sigEngine.getAlgorithm());
            infoSigAlgId = sigAlgId;
            DerOutputStream out = new DerOutputStream();
            DerOutputStream tmp = new DerOutputStream();
            encodeInfo(tmp);
            sigAlgId.encode(tmp);
            sigEngine.update(tbsCertList, 0, tbsCertList.length);
            signature = sigEngine.sign();
            tmp.putBitString(signature);
            out.write(DerValue.tag_Sequence, tmp);
            signedCRL = out.toByteArray();
            readOnly = true;
        } catch (IOException e) {
            throw new CRLException("Error while encoding data: " + e.getMessage());
        }
    }
}