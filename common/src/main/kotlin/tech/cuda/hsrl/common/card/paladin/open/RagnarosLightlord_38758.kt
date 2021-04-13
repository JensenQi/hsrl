package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RagnarosLightlord_38758 : Card() {
    override val id = 38758
    override val name = "光耀之主拉格纳罗斯"
    override val description = "在你的回合结束时，为一个受伤的友方角色恢复 8点生命值。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Wotog
    override val background = "根据负负得正定理，当你去腐化一个已被腐化的炎魔之王，其结果就是他变成了你们口中所谓的“好人”。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/69ba7a3dcfd1e84354eba3bdbcafbc589c97993e1fd96a70bbb4d277e157babf.png"
}
