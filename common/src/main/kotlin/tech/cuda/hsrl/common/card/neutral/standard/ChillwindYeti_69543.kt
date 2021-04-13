package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChillwindYeti_69543 : Card() {
    override val id = 69543
    override val name = "冰风雪人"
    override val description = ""
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "他梦想着有一天能够下山开一间拉面店。但他没有那个勇气。"
    override val artist = "Mauro Cascioli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/05d4302767051602a0dc1672515e5b19e0c8d39114a706a476fa48fe7331eb50.png"
}
