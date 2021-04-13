package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CloakscaleChemist_48566 : Card() {
    override val id = 48566
    override val name = "隐鳞药剂师"
    override val description = "<b>潜行</b> <b>圣盾</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "她这套衣服是依照鳞片模型剪裁的。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a9be5871e76df7db305c725f53126c913100b30b0c7e3f78f36e115bdd8cb6e.png"
}
