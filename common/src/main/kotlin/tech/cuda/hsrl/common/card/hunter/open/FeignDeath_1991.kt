package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FeignDeath_1991 : Card() {
    override val id = 1991
    override val name = "假死"
    override val description = "触发所有友方随从的<b>亡语</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Gvg
    override val background = "要完成一次完美的假死，最重要的是发出正确的气味。这需要经常训练或是一瓶特殊的香水。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ecf87f0c60c3c4e08fdc691f0f4248a056eed98f012e67ad34518474d4312e9.png"
}
