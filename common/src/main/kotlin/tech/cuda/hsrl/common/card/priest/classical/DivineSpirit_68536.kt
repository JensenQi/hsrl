package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DivineSpirit_68536 : Card() {
    override val id = 68536
    override val name = "神圣之灵"
    override val description = "使一个随从的生命值翻倍。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "加倍的付出会得到加倍的收获！"
    override val artist = "Jim Pavelec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7ffb74db8e61104e56167796a94ff1c5e9ba0ae1a63ca89019649a43c73b5ade.png"
}
