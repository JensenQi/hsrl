package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CallInTheFinishers_40419 : Card() {
    override val id = 40419
    override val name = "神奇四鱼"
    override val description = "召唤四个1/1的鱼人。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Msog
    override val background = "他们住在加基森的下水道，他们超爱吃披萨！"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e150dfada30f5e129de9efee1ee29349ae244ea2ca1635790f6a54c96b26c303.png"
}
