package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CarrionGrub_38985 : Card() {
    override val id = 38985
    override val name = "腐肉虫"
    override val description = ""
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Wotog
    override val background = "有喜欢吃鲜肉的，就有喜欢吃腐肉的。"
    override val artist = "Kan Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/221f8d80f243945051e6193bb9e7cabf8f45964726a2de86a7b10003472fb897.png"
}
