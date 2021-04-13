package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SolemnVigil_2274 : Card() {
    override val id = 2274
    override val name = "严正警戒"
    override val description = "抽两张牌。在本回合中每有一个随从死亡，该牌的法力值消耗就减少（1）点。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Brm
    override val background = "每年这个时候，矮人们都聚集在黑石山下，悼念那些被炎魔控制了心智，葬身熔岩之中的同胞们。"
    override val artist = "Jaime Jones"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1d9d6cfc688c063b5f9c94b9b26a3c4ef826b7554cb70ea7c9b3d27822fae68e.png"
}
