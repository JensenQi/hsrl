package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AugmentedElekk_49269 : Card() {
    override val id = 49269
    override val name = "强能雷象"
    override val description = "每当你将一张牌洗入牌库，额外洗入一张相同的牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "她的朋友们叫她“洗羊羊”。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aed37ac88aa5035ac3f4dcb9bd47c765650b099b882443b260911fa519509da7.png"
}
