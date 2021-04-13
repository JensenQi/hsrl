package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DuneSculptor_54408 : Card() {
    override val id = 54408
    override val name = "沙丘塑形师"
    override val description = "在你施放一个法术后，随机将一张法师随从牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "魔法表演，欢迎参观。沙雕城堡，随从驻足。"
    override val artist = "Servando Lupini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8351bc5997a8ae887865f258a430961b96441cd35a92dd2932cc649cf70beb2f.png"
}
