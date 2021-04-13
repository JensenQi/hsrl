package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mulch_2793 : Card() {
    override val id = 2793
    override val name = "腐根"
    override val description = "消灭一个随从。随机将一张随从牌置入对手的手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Tgt
    override val background = "腐根到底有多疼，怕是没机会知道了。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b7c66cefe3247780ec44ec5694a202eb9e1b83d11c5a5286df68f72177e5c98c.png"
}
