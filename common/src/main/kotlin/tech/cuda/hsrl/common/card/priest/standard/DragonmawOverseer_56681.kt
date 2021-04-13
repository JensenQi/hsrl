package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonmawOverseer_56681 : Card() {
    override val id = 56681
    override val name = "龙喉监工"
    override val description = "在你的回合结束时，使另一个友方随从获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.AshesOfOutland
    override val background = "啊，训诫靴……拿来治疗苦工的懒病最快了。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d69861cd8e866f07025a797d4aa3d8fc06be9701acfcce371fdc3d0864e55a5f.png"
}
