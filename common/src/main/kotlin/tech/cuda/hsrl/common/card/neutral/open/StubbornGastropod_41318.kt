package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StubbornGastropod_41318 : Card() {
    override val id = 41318
    override val name = "倔强的蜗牛"
    override val description = "<b>嘲讽</b> <b>剧毒</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "小小的天有大大的梦想，重重的壳裹着轻轻地仰望。"
    override val artist = "Aaron Miller"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/91d1f0f4fd4d32da60018e56bd2437a911446c2db086e961d683745888817f5f.png"
}
