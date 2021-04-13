package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MagmaRager_68379 : Card() {
    override val id = 68379
    override val name = "岩浆暴怒者"
    override val description = ""
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "尽管现在每个人都能单刷熔火之心了，但他依然觉得自己很厉害。"
    override val artist = "Matt Gaser"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/200d48eb9598ac12c55a9905e8f62f4b2d2743633aab1014752e1c60394d14c1.png"
}
