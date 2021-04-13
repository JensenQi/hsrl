package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpectralSight_58453 : Card() {
    override val id = 58453
    override val name = "幽灵视觉"
    override val description = "抽一张牌。<b>流放：</b>再抽一张。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“选一张牌，随意选！最好是最左或最右边的。”"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ecf4dc429d21defc4918200aaa4537e3073bb1646486ff979742bb4c9afe302f.png"
}
