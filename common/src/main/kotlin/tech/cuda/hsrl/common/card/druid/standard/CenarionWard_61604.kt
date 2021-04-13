package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CenarionWard_61604 : Card() {
    override val id = 61604
    override val name = "塞纳里奥结界"
    override val description = "获得8点护甲值。随机召唤一个法力值消耗为（8）的 随从。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "别问他的右手怎么了，他还在努力把它长成手的形状。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/14299127c96411e42fa400f8902635333c76e4748f15c7f5bd58181699241014.png"
}
