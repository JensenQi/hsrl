package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronwoodGolem_43284 : Card() {
    override val id = 43284
    override val name = "铁木魔像"
    override val description = "<b>嘲讽</b> 除非你的护甲值大于或等于3点，否则无法进行攻击。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "上面写着“钢铁魔像，防锈认证”。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb3452b7750e55fed91296d7d9e5a1b15e3a200200fcb030cf6747314446ffb3.png"
}
