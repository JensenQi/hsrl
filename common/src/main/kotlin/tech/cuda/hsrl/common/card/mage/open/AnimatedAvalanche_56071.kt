package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnimatedAvalanche_56071 : Card() {
    override val id = 56071
    override val name = "活化雪崩"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，召唤一个该随从的 复制。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "每次都因为说话的时候手上动作太多而冲下山崖。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bfd9d9b25466428e91cd1bd8f747ccd835e48996ce7fd11fe2f9dd1f8b29bbfc.png"
}
