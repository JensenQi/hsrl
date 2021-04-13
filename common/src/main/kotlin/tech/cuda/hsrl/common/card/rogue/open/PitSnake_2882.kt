package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PitSnake_2882 : Card() {
    override val id = 2882
    override val name = "深渊巨蟒"
    override val description = "<b>剧毒</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Loe
    override val background = "打蛇打七寸，可它的七寸在哪里……"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5b0b642202b95f4103eae64647c62deaa38f4545d658b7f343fd827309c3930.png"
}
