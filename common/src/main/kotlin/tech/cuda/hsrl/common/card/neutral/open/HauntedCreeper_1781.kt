package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HauntedCreeper_1781 : Card() {
    override val id = 1781
    override val name = "鬼灵爬行者"
    override val description = "<b>亡语：</b>召唤两只1/1的鬼灵蜘蛛。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "不管是看到真蜘蛛还是假蜘蛛，患有蜘蛛恐惧症的人都会发出令人毛骨悚然的尖叫。"
    override val artist = "Jeremy Cranford"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e09c2d6b75f835c3c9d4309a1c2a212a125b6bea6d3cda905615912e9c2f833.png"
}
