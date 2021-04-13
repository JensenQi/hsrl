package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MagmaRager_1653 : Card() {
    override val id = 1653
    override val name = "岩浆暴怒者"
    override val description = ""
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "尽管现在每个人都能单刷熔火之心了，但他依然觉得自己很厉害。"
    override val artist = "Matt Gaser"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/775572ad2b2d54f4f1deecf30ffd069ee558f859c8777de9445817c2fdbf427d.png"
}
