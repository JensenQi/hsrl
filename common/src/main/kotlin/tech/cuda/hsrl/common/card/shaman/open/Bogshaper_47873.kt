package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bogshaper_47873 : Card() {
    override val id = 47873
    override val name = "塑沼者"
    override val description = "每当你施放一个法术，从你的牌库中抽一张随从牌。"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.TheWitchwood
    override val background = "最困难的地方在于维持他们的形状。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e4fcca1599edee05b2b4a9d8dff08966fcdc71bc2ad8acb2edfdc45b61be4b03.png"
}
