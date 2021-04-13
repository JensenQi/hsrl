package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Torrent_56467 : Card() {
    override val id = 56467
    override val name = "洪流"
    override val description = "对一个随从造成 8点伤害。如果你在上个回合施放过法术，则法力值消耗减少（3）点。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.AshesOfOutland
    override val background = "经过数周的交叉训练，她的四肢结实了不少。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/486935334690935630097eea24e7d8ba215d42525b6e375ddb846836820b65a7.png"
}
