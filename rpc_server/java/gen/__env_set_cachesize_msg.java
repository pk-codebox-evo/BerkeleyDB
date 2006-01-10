/*
 * Automatically generated by jrpcgen 0.95.1 on 8/2/05 1:49 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
package com.sleepycat.db.rpcserver;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class __env_set_cachesize_msg implements XdrAble {
    public int dbenvcl_id;
    public int gbytes;
    public int bytes;
    public int ncache;

    public __env_set_cachesize_msg() {
    }

    public __env_set_cachesize_msg(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(dbenvcl_id);
        xdr.xdrEncodeInt(gbytes);
        xdr.xdrEncodeInt(bytes);
        xdr.xdrEncodeInt(ncache);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        dbenvcl_id = xdr.xdrDecodeInt();
        gbytes = xdr.xdrDecodeInt();
        bytes = xdr.xdrDecodeInt();
        ncache = xdr.xdrDecodeInt();
    }

}
// End of __env_set_cachesize_msg.java