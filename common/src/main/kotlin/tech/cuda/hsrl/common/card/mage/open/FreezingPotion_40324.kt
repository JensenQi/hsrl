package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FreezingPotion_40324 : Card() {
    override val id = 40324
    override val name = "冰冻药水"
    override val description = "<b>冻结</b>一个敌人。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Msog
    override val background = "冻住，不许走！"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/78e7ea653e1c76c055d429084094bcf688bedb7aa21b138e90d23e60d12cc196.png"
}
