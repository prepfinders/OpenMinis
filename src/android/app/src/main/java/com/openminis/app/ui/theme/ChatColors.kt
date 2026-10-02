package com.openminis.app.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

// Semantic chat colors mirroring iOS ChatColors (AIChatView.swift).
// Resolved from LocalChatPalette, which is provided by MinisTheme.
//
// iOS reference:
//   systemBackground        -> background
//   secondarySystemBackground -> secondaryBg
//   tertiarySystemFill      -> userBubble
//   tertiarySystemGroupedBackground -> toolBg
//   label                   -> primaryText
//   secondaryLabel          -> secondaryText
//   tertiaryLabel           -> tertiaryText
//   quaternaryLabel         -> sendButtonDisabled
//   separator               -> border
//   systemGray6             -> inlineCodeBg / toolCapsuleBg
@Immutable
data class ChatPalette(
    val isDark: Boolean,
    val background: Color,
    val secondaryBg: Color,
    val inputBg: Color,
    val inputIconBg: Color,
    val inputIconBorder: Color,
    val inputBorder: Color,
    val primaryText: Color,
    val secondaryText: Color,
    val tertiaryText: Color,
    val disabledText: Color,
    val userBubble: Color,
    val toolBg: Color,
    val toolBorder: Color,
    val toolCapsuleBg: Color,
    val separator: Color,
    val sendButton: Color,
    val sendButtonDisabled: Color,
    val codeBlockBg: Color,
    val codeBlockText: Color,
    val inlineCodeBg: Color,
    val inlineCodeText: Color,
    val link: Color,
    val blockquoteBar: Color,
    val thinking: Color,
    val warningBg: Color,
    val warningText: Color,
    val tableBorder: Color,
    val inputShadow: Color,
    val toastBg: Color,
    val thumbnailBorder: Color,
    val sheetHeaderBg: Color,
    val sheetHeaderBorder: Color,
    val fabAccent: Color,
)

// Auris brand light tokens (design_handoff_auris_rebrand/README.md):
// bg Cream #FBFFF1, surface #FFFFFF, grouped #F1F3EA, elevated #EEF0E8,
// text Ink #3C3744 / text2 #665F70 / text3 #948E9C, primary Deep #090C9B,
// accent Royal #3D52D5, chip #E1E8F3, separator rgba(60,55,68,.12),
// inputBorder rgba(60,55,68,.16).
val LightChatPalette = ChatPalette(
    isDark = false,
    background = Color(0xFFFBFFF1),
    secondaryBg = Color(0xFFF1F3EA),
    inputBg = Color.White,
    inputIconBg = Color(0xFFEEF0E8),
    inputIconBorder = Color.Transparent,
    inputBorder = Color(0x293C3744),
    primaryText = Color(0xFF3C3744),
    secondaryText = Color(0xFF665F70),
    tertiaryText = Color(0xFF948E9C),
    disabledText = Color(0x4D3C3744),
    userBubble = Color(0xFFE1E8F3),
    toolBg = Color(0xFFEEF0E8),
    toolBorder = Color(0x1F3C3744),
    toolCapsuleBg = Color(0xFFEEF0E8),
    separator = Color(0x1F3C3744),
    sendButton = Color(0xFF090C9B),
    sendButtonDisabled = Color(0x4D3C3744),
    codeBlockBg = Color(0xFF000000),
    codeBlockText = Color(0xFF34C759),
    inlineCodeBg = Color(0xFFEEF0E8),
    inlineCodeText = Color(0xFFFF9500),
    link = Color(0xFF3D52D5),
    blockquoteBar = Color(0x80FF9500),
    thinking = Color(0xFF3D52D5),
    warningBg = Color(0x14FF9500),
    warningText = Color(0x73000000),
    tableBorder = Color(0x1F3C3744),
    inputShadow = Color.Transparent,
    toastBg = Color(0x2E3D52D5),
    thumbnailBorder = Color(0x33808080),
    sheetHeaderBg = Color(0xFFFFFFFF),
    sheetHeaderBorder = Color(0x1F3C3744),
    fabAccent = Color(0xFF090C9B),
)

// T153: Android-specific dark palette tweaks. iOS borrows the system
// palette (#1C1C1E / #2C2C2E etc.) which reads as "layered dark grey"
// on a 1000+ nit display, but on a typical Android phone (Pixel 6 ≈
// 500 nits, mid-range OEMs even less) those layers crush together
// into a single near-black wash and the user can't tell tool capsules
// from background or input from message list. Lift the non-background
// layers ~6-10% so the contrast survives the brightness gap; the pure
// `background` itself stays #000 because every other color is keyed
// to "darker than this".
//
// Auris brand dark tokens: bg #141219, surface #1F1C24, elevated #2A2630,
// text Cream #FBFFF1 / text2 Mist #B4C5E4 / text3 #8A8694, primary Royal
// #3D52D5, accent Mist, chip #252A52, separator rgba(251,255,241,.10),
// inputBorder rgba(180,197,228,.20). The lift between layers is kept so the
// ramp still separates on dimmer panels.
val DarkChatPalette = ChatPalette(
    isDark = true,
    background = Color(0xFF141219),
    secondaryBg = Color(0xFF1F1C24),
    inputBg = Color(0xFF1F1C24),
    inputIconBg = Color(0xFF2A2630),
    inputIconBorder = Color(0xFF3A3640),
    inputBorder = Color(0x33B4C5E4),
    primaryText = Color(0xFFFBFFF1),
    secondaryText = Color(0xFFB4C5E4),
    tertiaryText = Color(0xFF8A8694),
    disabledText = Color(0x4DFBFFF1),
    // [T-android-user-bubble-dark-contrast] Opaque chip colour so the user's
    // own messages read as a distinct accent on the #141219 background; the
    // Cream primaryText stays legible on it.
    userBubble = Color(0xFF252A52),
    toolBg = Color(0xFF2A2630),
    toolBorder = Color(0x1AFBFFF1),
    toolCapsuleBg = Color(0xFF1F1C24),
    separator = Color(0x1AFBFFF1),
    sendButton = Color(0xFFB4C5E4),
    sendButtonDisabled = Color(0x4DFBFFF1),
    codeBlockBg = Color(0xFF1F1C24),
    codeBlockText = Color(0xFF8CF38C),
    // [T-inline-code-dark-bg-android] Inline chips sit one step above the
    // surface (#1F1C24) and the fenced code block so they read against both.
    inlineCodeBg = Color(0xFF2A2630),
    inlineCodeText = Color(0xFFFF9F0A),
    link = Color(0xFFB4C5E4),
    blockquoteBar = Color(0x80FF9F0A),
    thinking = Color(0xFF3D52D5),
    warningBg = Color(0x14FF9F0A),
    warningText = Color(0x73FFFFFF),
    tableBorder = Color(0xFF332F38),
    inputShadow = Color(0x80000000),
    toastBg = Color(0x2E3D52D5),
    thumbnailBorder = Color(0x33B4C5E4),
    sheetHeaderBg = Color(0xFF1F1C24),
    sheetHeaderBorder = Color(0x1AFBFFF1),
    fabAccent = Color(0xFF3D52D5),
)

val LocalChatPalette = compositionLocalOf { LightChatPalette }

// Short accessor: ChatColors.primaryText instead of LocalChatPalette.current.primaryText
val ChatColors: ChatPalette
    @Composable
    @ReadOnlyComposable
    get() = LocalChatPalette.current
