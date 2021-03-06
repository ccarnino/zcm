/* ZCM type definition class file
 * This file was automatically generated by zcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package zcmtypes;
 
import java.io.*;
import java.util.*;
import zcm.zcm.*;
 
public final class nested2 implements zcm.zcm.ZCMEncodable
{
    public byte g;
    public zcmtypes.b b_array[][];
 
    public nested2()
    {
    }
 
    public static final long ZCM_FINGERPRINT;
    public static final long ZCM_FINGERPRINT_BASE = 0xead96bf817b15699L;
 
    static {
        ZCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(zcmtypes.nested2.class))
            return 0L;
 
        classes.add(zcmtypes.nested2.class);
        long hash = ZCM_FINGERPRINT_BASE
             + zcmtypes.b._hashRecursive(classes)
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(ZCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeByte(this.g); 
 
        for (int a = 0; a < this.g; a++) {
            for (int b = 0; b < 5; b++) {
                this.b_array[a][b]._encodeRecursive(outs); 
            }
        }
 
    }
 
    public nested2(byte[] data) throws IOException
    {
        this(new ZCMDataInputStream(data));
    }
 
    public nested2(DataInput ins) throws IOException
    {
        if (ins.readLong() != ZCM_FINGERPRINT)
            throw new IOException("ZCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static zcmtypes.nested2 _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        zcmtypes.nested2 o = new zcmtypes.nested2();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.g = ins.readByte();
 
        this.b_array = new zcmtypes.b[(int) g][(int) 5];
        for (int a = 0; a < this.g; a++) {
            for (int b = 0; b < 5; b++) {
                this.b_array[a][b] = zcmtypes.b._decodeRecursiveFactory(ins);
            }
        }
 
    }
 
    public zcmtypes.nested2 copy()
    {
        zcmtypes.nested2 outobj = new zcmtypes.nested2();
        outobj.g = this.g;
 
        outobj.b_array = new zcmtypes.b[(int) g][(int) 5];
        for (int a = 0; a < this.g; a++) {
            for (int b = 0; b < 5; b++) {
                outobj.b_array[a][b] = this.b_array[a][b].copy();
            }
        }
 
        return outobj;
    }
 
}

