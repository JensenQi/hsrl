package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Siamat_54148 : Card() {
    override val id = 54148
    override val name = "希亚玛特"
    override val description = "<b>战吼：</b>从<b>突袭，嘲讽，圣盾</b>或<b>风怒</b>中获得两种效果<i>（由你选择）</i>。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "<b>嘲讽， 嘲讽。</b>"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3923b3b02457180be5882b33030a5d620a9dae387bee7346003617261eac03e0.png"
}
