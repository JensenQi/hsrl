package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PterrordaxHatchling_41076 : Card() {
    override val id = 41076
    override val name = "翼手龙宝宝"
    override val description = "<b>战吼：</b><b>进化</b>。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "噢，它真的好可爱！想不想再喂它几根手指头？"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a1016accee7f995d4287406df8548a28354ddd2b861893f13f376ce0ff279497.png"
}
