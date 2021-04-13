package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoblinBomb_47837 : Card() {
    override val id = 47837
    override val name = "地精炸弹"
    override val description = "<b>亡语：</b>对敌方英雄造成2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "这些婴儿潮时期出产的小家伙们是导致人口爆炸的一个重要原因。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c3a1f330d5ad27d8204f4fa34a698b5d5c4079b15dcd330d38675c84b329afa9.png"
}
