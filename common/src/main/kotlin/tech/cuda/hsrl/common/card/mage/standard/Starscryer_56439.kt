package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Starscryer_56439 : Card() {
    override val id = 56439
    override val name = "星占师"
    override val description = "<b>亡语：</b>抽一张法术牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.AshesOfOutland
    override val background = "座中泣下谁最多，精灵涕泪星沾湿。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dffd0b4b03499632ca77fe4d167c96bfc7a2b9cf4007b19bb1fb55a870d5c3b8.png"
}
