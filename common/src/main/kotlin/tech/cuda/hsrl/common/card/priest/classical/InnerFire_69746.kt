package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InnerFire_69746 : Card() {
    override val id = 69746
    override val name = "心灵之火"
    override val description = "使一个随从的攻击力等同于其生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "“但是，真正的胜利，孩子——是鼓舞你的子民心中的斗志。”——泰瑞纳斯·米奈希尔"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3559f8d09292e9a6714b0ad0bde5d2d52f0fce9ce72dcd7f14126af61ed8d727.png"
}
