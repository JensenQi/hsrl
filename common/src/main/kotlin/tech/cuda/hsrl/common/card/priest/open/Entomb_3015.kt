package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Entomb_3015 : Card() {
    override val id = 3015
    override val name = "埋葬"
    override val description = "选择一个敌方随从。将该随从洗入你的牌库。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Loe
    override val background = "其实只要留有通风口，活埋还是很安全的。"
    override val artist = "Alex Konstad"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9083ca47109ca0371f21e6a04ce4fcd8d777139535742eb2b3b47cc85632b7f6.png"
}
