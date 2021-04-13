package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForbiddenShaping_38434 : Card() {
    override val id = 38434
    override val name = "禁忌畸变"
    override val description = "消耗你所有的法力值，随机 召唤一个法力值消耗相同的随从。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Wotog
    override val background = "唯一的缺点就是召唤出来的随从都黏糊糊的。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ab61339379e6d4fce90b65c7b416a18c5127a49146a756b69002a4986cd3f2f3.png"
}
