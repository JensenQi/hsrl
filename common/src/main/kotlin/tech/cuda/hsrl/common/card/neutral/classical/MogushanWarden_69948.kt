package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MogushanWarden_69948 : Card() {
    override val id = 69948
    override val name = "魔古山守望者"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 4
    override var health: Int? = 7
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "这些家伙们每天做的就是谈论雷神。真无聊！"
    override val artist = "Cole Eastburn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e1304b5b7e508dfcf9a954a10a1677147a6df01e47d02d9709913bb128be2dc.png"
}
