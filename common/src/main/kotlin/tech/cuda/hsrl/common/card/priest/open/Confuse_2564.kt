package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Confuse_2564 : Card() {
    override val id = 2564
    override val name = "迷乱"
    override val description = "将所有随从的攻击力和生命值 互换。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Tgt
    override val background = "有时会发生意想不到的结果！"
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f7de56a4f646f100a57854697dc2b78a937e880e509b36687d38181db246a8fe.png"
}
