package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Pilfer_52264 : Card() {
    override val id = 52264
    override val name = "窃取"
    override val description = "随机将一张另一职业的卡牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy1635
    override val background = "欺不如窃，窃不如偷。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bfdeba6f80cdde26c9b2975bf78dd11af17e1bc37f0e8a4f98de31a9a0e44c9d.png"
}
