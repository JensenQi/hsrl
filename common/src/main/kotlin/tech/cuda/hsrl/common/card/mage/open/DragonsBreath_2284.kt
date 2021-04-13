package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonsBreath_2284 : Card() {
    override val id = 2284
    override val name = "龙息术"
    override val description = "造成 4点伤害。在本回合中每有一个随从死亡，该牌的法力值消耗就减少（1）点。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Brm
    override val background = "大家都知道龙能够喷吐火焰，但你知道其实它们也能喷吐棉花糖吗？只是通常来说，它们缺少一个喷吐棉花糖的理由而已。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b3350decc04a226c6e84598e68ca20cb3328c0691eb9a67c96124d32da0b34c7.png"
}
