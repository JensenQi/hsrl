package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VioletWurm_43526 : Card() {
    override val id = 43526
    override val name = "紫色岩虫"
    override val description = "<b>亡语：</b>召唤七只1/1的肉虫。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "它总是一路向下钻。"
    override val artist = "J. Cranford"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bddb911407e76670533784fdc23b3beaad7e85ca1c273b19ac86f568ff565377.png"
}
