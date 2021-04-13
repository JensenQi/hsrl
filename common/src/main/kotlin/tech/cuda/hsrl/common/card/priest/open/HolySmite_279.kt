package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolySmite_279 : Card() {
    override val id = 279
    override val name = "神圣惩击"
    override val description = "对一个随从造成 3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "这和多么虔诚没有关系，每个人都需要时不时有人鞭策一下。"
    override val artist = "Steve Ellis"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/507a8a9e2e6badf437a895bba0d81aa04c5798926e1e83aa0d235947ebaa6046.png"
}
