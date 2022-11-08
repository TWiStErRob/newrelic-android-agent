// automatically generated by the FlatBuffers compiler, do not modify

package com.newrelic.mobile.fbs.models;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class InteractionTraceBundle extends Table {
  public static InteractionTraceBundle getRootAsInteractionTraceBundle(ByteBuffer _bb) { return getRootAsInteractionTraceBundle(_bb, new InteractionTraceBundle()); }
  public static InteractionTraceBundle getRootAsInteractionTraceBundle(ByteBuffer _bb, InteractionTraceBundle obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public InteractionTraceBundle __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int accountId() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateAccountId(int accountId) { int o = __offset(4); if (o != 0) { bb.putInt(o + bb_pos, accountId); return true; } else { return false; } }
  public long appId() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateAppId(long appId) { int o = __offset(6); if (o != 0) { bb.putLong(o + bb_pos, appId); return true; } else { return false; } }
  public int appVersionId() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateAppVersionId(int appVersionId) { int o = __offset(8); if (o != 0) { bb.putInt(o + bb_pos, appVersionId); return true; } else { return false; } }
  public String countryCode() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer countryCodeAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer countryCodeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public String device() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer deviceAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer deviceInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }
  public String os() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer osAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public ByteBuffer osInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 1); }
  public String entityGuid() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer entityGuidAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public ByteBuffer entityGuidInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 16, 1); }
  public String dispatcher() { int o = __offset(18); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer dispatcherAsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public ByteBuffer dispatcherInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 18, 1); }
  public InteractionTrace interactionTraces(int j) { return interactionTraces(new InteractionTrace(), j); }
  public InteractionTrace interactionTraces(InteractionTrace obj, int j) { int o = __offset(20); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int interactionTracesLength() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }

  public static int createInteractionTraceBundle(FlatBufferBuilder builder,
      int accountId,
      long appId,
      int appVersionId,
      int countryCodeOffset,
      int deviceOffset,
      int osOffset,
      int entityGuidOffset,
      int dispatcherOffset,
      int interactionTracesOffset) {
    builder.startObject(9);
    InteractionTraceBundle.addAppId(builder, appId);
    InteractionTraceBundle.addInteractionTraces(builder, interactionTracesOffset);
    InteractionTraceBundle.addDispatcher(builder, dispatcherOffset);
    InteractionTraceBundle.addEntityGuid(builder, entityGuidOffset);
    InteractionTraceBundle.addOs(builder, osOffset);
    InteractionTraceBundle.addDevice(builder, deviceOffset);
    InteractionTraceBundle.addCountryCode(builder, countryCodeOffset);
    InteractionTraceBundle.addAppVersionId(builder, appVersionId);
    InteractionTraceBundle.addAccountId(builder, accountId);
    return InteractionTraceBundle.endInteractionTraceBundle(builder);
  }

  public static void startInteractionTraceBundle(FlatBufferBuilder builder) { builder.startObject(9); }
  public static void addAccountId(FlatBufferBuilder builder, int accountId) { builder.addInt(0, accountId, 0); }
  public static void addAppId(FlatBufferBuilder builder, long appId) { builder.addLong(1, appId, 0L); }
  public static void addAppVersionId(FlatBufferBuilder builder, int appVersionId) { builder.addInt(2, appVersionId, 0); }
  public static void addCountryCode(FlatBufferBuilder builder, int countryCodeOffset) { builder.addOffset(3, countryCodeOffset, 0); }
  public static void addDevice(FlatBufferBuilder builder, int deviceOffset) { builder.addOffset(4, deviceOffset, 0); }
  public static void addOs(FlatBufferBuilder builder, int osOffset) { builder.addOffset(5, osOffset, 0); }
  public static void addEntityGuid(FlatBufferBuilder builder, int entityGuidOffset) { builder.addOffset(6, entityGuidOffset, 0); }
  public static void addDispatcher(FlatBufferBuilder builder, int dispatcherOffset) { builder.addOffset(7, dispatcherOffset, 0); }
  public static void addInteractionTraces(FlatBufferBuilder builder, int interactionTracesOffset) { builder.addOffset(8, interactionTracesOffset, 0); }
  public static int createInteractionTracesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startInteractionTracesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endInteractionTraceBundle(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishInteractionTraceBundleBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedInteractionTraceBundleBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }
}

